package org.example.studentmanagmentsystemthymeleaf.Repository;


import org.example.studentmanagmentsystemthymeleaf.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
