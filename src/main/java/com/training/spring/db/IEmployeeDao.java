package com.training.spring.db;

import com.training.spring.rest.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IEmployeeDao extends CrudRepository<Employee,Long> {

    List<Employee> findByName(String name);
    List<Employee> findByNameAndSurname(String name,String surname);
    List<Employee> findByNameIn(List<String> name);
    List<Employee> findByNameAndSurnameOrderByName(String name,String surname);

    @Query("select e from Employee e where e.name=?1")
    List<Employee> searchName(String name);

    @Query("select e from Employee e where e.name=:isim")
    List<Employee> searchName2(@Param("isim") String name);

    @Query(value = "select * from calisan e where e.name=?1",nativeQuery = true)
    List<Employee> searchNativeName(String name);


}
