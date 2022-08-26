package com.training.spring.db;

import com.training.spring.rest.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class JdbcEmployee {

    @Autowired
    private DataSource dataSource;

    public void addEmployee(Employee employee) throws SQLException {
        try (Connection con = dataSource.getConnection(); PreparedStatement pr = con.prepareStatement("insert into employee (height, name, surname, weight, employee_id) values (?, ?, ?, ?, ?)")) {
            pr.setLong(1,
                       1);
            pr.setString(2,
                         employee.getName());
            pr.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
