package com.ncslab.pojo;

public class SuperviseDevice {
    private int id;
    private int name;

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperviseDevice{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
