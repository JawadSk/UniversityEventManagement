package com.jawad.UniversityEventManagement.repository;

import com.jawad.UniversityEventManagement.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Integer> {

    @Modifying
    @Query(value = "update students set department = :department where student_id = :id", nativeQuery = true)
    public void updateDepartmentById(String department, Integer id);
}
