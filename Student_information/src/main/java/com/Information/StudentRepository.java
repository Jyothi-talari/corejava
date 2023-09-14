package com.Information;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Information.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
