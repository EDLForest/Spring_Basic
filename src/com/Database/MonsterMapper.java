package com.Database;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MonsterMapper implements RowMapper<Monster> {
    @Override
    public Monster mapRow(ResultSet resultSet, int i) throws SQLException {
        Monster monster = new Monster();
        monster.setId(resultSet.getInt("idmonster"));
        monster.setName(resultSet.getString("name"));
        monster.setType(resultSet.getString("type"));
        monster.setRace(resultSet.getString("race"));
        monster.setLevel(resultSet.getInt("level"));
        return monster;
    }
}
