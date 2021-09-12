package com.jetbrains.employeedemo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeesByLastNameContaining(String str);
    //JPQL
    @Query("select s from Employee  s where  s.id= ?1")
    public Employee findByCustomId(Long id);

    @Transactional
    @Modifying
    @Query("update Employee  e set e.firstName = ?2 where e.id = ?1")
    public void updateById(Long id, String newFirstName);
    //Native
    @Query(value = "select * from Employee ", nativeQuery = true)
    public List<Employee> findAllEmployeesCustom();
}

