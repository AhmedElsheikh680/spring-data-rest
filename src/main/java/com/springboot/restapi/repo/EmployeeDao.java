package com.springboot.restapi.repo;

import com.springboot.restapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path="members")
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
