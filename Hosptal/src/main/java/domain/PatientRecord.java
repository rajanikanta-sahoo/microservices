package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table
@Data
public class PatientRecord {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@ManyToOne
	@JoinColumn(name="pat_id")
	private User patientId;
	
	@ManyToOne
	@JoinColumn(name="dep_patr_id")
	private Department departmentId;
	
	@ManyToOne
	@JoinColumn(name="doc_aptr_id")
	private User doctorId;
	
	@ManyToOne
	@JoinColumn(name="pat_prc_id")
	private Prescription prescriptionId;
	
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
}
