package com.jawad.UniversityEventManagement.Service;

import com.jawad.UniversityEventManagement.model.Departments;
import com.jawad.UniversityEventManagement.model.Student;
import com.jawad.UniversityEventManagement.repository.IStudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;

    public String addStudentToDb(Student student) {
        iStudentRepository.save(student);
        return "Student added!";
    }
    @Transactional
    public String updateDepartmentById(Departments department, Integer id) {
        iStudentRepository.updateDepartmentById(department.name(), id);
        return "Department updated!";
    }
    public String deleteStudentById(Integer id) {
        iStudentRepository.deleteById(id);
        return "Student deleted!";
    }
    public List<Student> getAllStudents() {
        return (List<Student>) iStudentRepository.findAll();
    }
    public Student getStudentById(Integer id) {
        return iStudentRepository.findById(id).orElse(null);
    }
}
