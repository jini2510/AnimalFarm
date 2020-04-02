package Mapper;

import com.Farm.Students;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentsMapper implements RowMapper<Students> {

    @Override
    public Students mapRow(ResultSet rs, int rowNum) throws SQLException{

        Students students = new Students();
        students.setId(rs.getInt("Id"));
        students.setFirst_name(rs.getString("first_name"));
        students.setLast_name(rs.getString("second_name"));

        return students;
    }
}


