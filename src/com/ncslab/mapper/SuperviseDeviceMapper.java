package com.ncslab.mapper;

import java.util.List;

import com.ncslab.pojo.SuperviseDevice;

public interface SuperviseDeviceMapper {

    int add(SuperviseDevice superviseDevice);

    void delete(int id);

    SuperviseDevice get(int id);

    int update(SuperviseDevice superviseDevice);

    List<SuperviseDevice> list();

}