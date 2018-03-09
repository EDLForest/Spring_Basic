package com.Database;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * This is a JDBC Template for a monster object.
 * The database monster contains some of the monster's basic information
 * such as name, type, race, level, and as well as a primary id key for each entry
 * a player should have only these information
 *
 */
public class MonsterJDBCTemplate implements MonsterDAO {

    private DataSource datasource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSOurce(DataSource ds) {
        this.datasource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(datasource);
    }

    @Override
    public void create(String name, String type, String race, int level) {
        String SQL = "insert into monster (name, type, race, level) value(?, ?, ?, ?)";
        jdbcTemplateObject.update(SQL, name, type, race, level);
    }

    @Override
    public Monster getMonster(Integer id) {
        String SQL = "select * from monster where idmonster = ?";
        return jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new MonsterMapper());
    }

    @Override
    public List<Monster> listMonsters() {
        String SQL = "select * from monster";
        return jdbcTemplateObject.query(SQL, new MonsterMapper());
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from monster where id = ?";
        System.out.println("Deleting row with id =" + id);
        jdbcTemplateObject.update(SQL, id);
    }

    @Override
    public void update(Integer id, Monster m) {
        String SQL = "update monster set name = ?, type = ?, race = ?, level = ?";
        int rowAffected = jdbcTemplateObject.update(SQL, m.getName(), m.getType(), m.getRace(), m.getLevel());
        System.out.println(rowAffected + " row was affected");
    }
}
