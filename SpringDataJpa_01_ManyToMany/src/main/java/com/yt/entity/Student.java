package com.yt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="JPA_STUDENT_TABLE")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student 
{
	
	@Id
	@SequenceGenerator(name="student_gen",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="student_gen",strategy=GenerationType.SEQUENCE)
	private Integer sid;
	
	@Column(length=30)
	@NonNull
	private String sname;
	
	@Column(length=30)
	@NonNull
	private String saddress;
	
	@Column(length=30)
	@NonNull
	private String college;
	
	@ManyToMany(targetEntity=Faculty.class,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(
	    name = "MTM_FACULTIES_STUDENTS_TABLE",
	    joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "sid"),  
	    inverseJoinColumns = @JoinColumn(name = "faculty_id", referencedColumnName = "fid") 
	)
	private Set<Faculty> facultyInfo = new HashSet<>();

	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", college=" + college + "]";
	}

	
	
	
	

}
