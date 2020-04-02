package Mapper;

import com.Farm.Animal;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalMapper implements RowMapper<Animal> {

    @Override
    public Animal mapRow(ResultSet rs, int rowNum) throws SQLException{

        Animal animal = new Animal();
        animal.setName(rs.getString("name"));
        animal.setPrice(rs.getInt("price"));
        return animal;
    }
}


