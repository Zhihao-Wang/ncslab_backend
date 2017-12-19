package com.ncslab.pojo;

public class Lab {


    private int id;
    private int labid;
    private String nameCN;
    private String ip;
    private Boolean statusCode;
    private String manager;
    private  int orderMenu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLabid() {
        return labid;
    }

    public void setLabid(int labid) {
        this.labid = labid;
    }

    public String getNameCN() {
        return nameCN;
    }

    public void setNameCN(String nameCN) {
        this.nameCN = nameCN;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Boolean statusCode) {
        this.statusCode = statusCode;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getOrderMenu() {
        return orderMenu;
    }

    public void setOrderMenu(int orderMenu) {
        this.orderMenu = orderMenu;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "id=" + id +
                ", labid=" + labid +
                ", nameCN='" + nameCN + '\'' +
                ", ip='" + ip + '\'' +
                ", statusCode=" + statusCode +
                ", manager='" + manager + '\'' +
                ", orderMenu=" + orderMenu +
                '}';
    }
}
