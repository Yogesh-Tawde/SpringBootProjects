package com.yt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="ACC_BANK")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount 
{
	
	@Id
	@SequenceGenerator(name="seq1",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="Gen1",strategy=GenerationType.SEQUENCE)
	private Long accNo;
	
	@Column(name="HOLDER_NAME" ,length=30)
	@NonNull
	private String holderName;
	
	@Column(name="ADDRESS",length=30)
	@NonNull
	private String addr;
	
	@Column(name="BALANCE")
	@NonNull
	private Double balance;
	
	@Version
	private Integer updationCount;
	
	@CreationTimestamp
	@Column(insertable=true,updatable=false)
	private LocalDateTime creationTime;
	
	@UpdateTimestamp
	@Column(insertable=false,updatable=true)
	private LocalDateTime lastAccessTime;
	
	@Column(length=30)
	private String createdBy;
	
	@Column(length=30)
	private String updatedBy;
	
	private String active_SW = "active";
	

}
