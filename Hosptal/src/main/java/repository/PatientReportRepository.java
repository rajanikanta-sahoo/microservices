package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.PatientRecord;

public interface PatientReportRepository extends JpaRepository<PatientRecord, Integer> {

}
