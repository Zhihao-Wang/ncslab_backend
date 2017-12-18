package com.ncslab.service;

import java.util.List;

import com.ncslab.pojo.SuperviseDevice;

public interface SuperviseDeviceService {

    List<SuperviseDevice> list();
    void add(SuperviseDevice superviseDevice);
    void update(SuperviseDevice superviseDevice);
    void delete(SuperviseDevice superviseDevice);
    SuperviseDevice get(int id);

}