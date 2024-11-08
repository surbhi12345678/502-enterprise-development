package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springcore.jdbc.entities.Student;
import io.micrometer.common.lang.Nullable;

public class RowMapperImpl implements RowMapper<Student>{

    @Override
    @Nullable
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setCity(rs.getString("city"));
        return student;
    }
}
