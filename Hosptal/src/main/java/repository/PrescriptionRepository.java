package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
