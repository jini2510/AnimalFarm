package com.Farm.Mapper;
import com.Farm.Player;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerMapper implements RowMapper<Player> {

    @Override

    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {

        Player player = new Player();
        player.setPlayerName(rs.getString("name"));
        player.setPlayerMoney(rs.getInt("money"));

        return player;
    }
}
