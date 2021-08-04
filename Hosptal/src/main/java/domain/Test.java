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
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	private String type;
	
	@ManyToOne
	@JoinColumn(name="test_pat_id")
	private User patientId;
	
	@ManyToOne
	@JoinColumn(name="test_doc_id")
	private User doctorId;
	
	private String testName;
	
	private String result;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
}
