package com.spring.jpa.chap02_querymethod.entity.repository;

import com.spring.jpa.chap02_querymethod.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
extends JpaRepository<Student, String> {

}
