package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.PatientReport;

public interface PatientReportRepository extends JpaRepository<PatientReport, Integer> {

}
