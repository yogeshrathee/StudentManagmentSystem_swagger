package org.example.studentmanagmentsystemthymeleaf.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.studentmanagmentsystemthymeleaf.Entity.Student;
import org.example.studentmanagmentsystemthymeleaf.Repository.StudentRepository;
import org.example.studentmanagmentsystemthymeleaf.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudentById(Long id) {

    }
}
