package com.yt.entity;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="JPA_FACULTY_TABLE")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Faculty 
{
	@Id
	@SequenceGenerator(name="faculty_gen",sequenceName="FAC_SQE",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="faculty_gen",strategy=GenerationType.SEQUENCE)
	private Integer fid;
	
	
	@Column(length=30)
	@NonNull
	private String fname;
	
	@Column(length=30)
	@NonNull
	private String faddrs;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="facultyInfo")
	private Set<Student> studentInfo =new HashSet<>();

	@Override
	public String toString() 
	{
		return "Faculty [fid=" + fid + ", fname=" + fname + ", faddrs=" + faddrs + "]";
	}
	
	
	
	
	

}
