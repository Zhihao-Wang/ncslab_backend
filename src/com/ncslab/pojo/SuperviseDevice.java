package com.ncslab.pojo;

public class SuperviseDevice {
    private int id;
    private String testRigName;

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }


    public String getTestRigName() {
        return testRigName;
    }

    public void setTestRigName(String testRigName) {
        this.testRigName = testRigName;
    }

    @Override
    public String toString() {
        return "SuperviseDevice{" +
                "id=" + id +
                ", testRigName='" + testRigName + '\'' +
                '}';
    }
}
