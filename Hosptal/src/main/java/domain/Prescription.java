package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table
@Data
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	private String medicine;
	
	private int dosesPerDay;
	
	private int days;
	
	@ManyToOne
	@JoinColumn(name="presc_test_id")
	private Test prescribedTest;
	
	
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
}
