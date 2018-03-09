package com.Database;

public class Monster {

    private int id;
    private String name;
    private String type;
    private String race;
    private int level;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRace() {
        return race;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Monster{ " +
                "name= \"" + name + '\"' +
                ", type= \"" + type + '\"' +
                ", race= \"" + race + '\"' +
                ", level= " + level +
                '}';
    }
}
