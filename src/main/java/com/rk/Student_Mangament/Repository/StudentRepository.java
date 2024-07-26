package com.rk.Student_Mangament.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rk.Student_Mangament.entiyt.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
