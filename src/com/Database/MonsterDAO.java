package com.Database;

import javax.sql.DataSource;
import java.util.List;

public interface MonsterDAO {

    void setDataSOurce(DataSource ds);
    void create(String name, String type, String race, int level);
    Monster getMonster(Integer id);
    List<Monster> listMonsters();
    void delete(Integer id);
    void update(Integer id, Monster monster);
}
