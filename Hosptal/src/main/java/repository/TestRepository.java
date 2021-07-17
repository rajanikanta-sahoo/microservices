package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {

}
