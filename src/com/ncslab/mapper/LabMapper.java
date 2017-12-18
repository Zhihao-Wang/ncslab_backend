package com.ncslab.mapper;

import com.ncslab.pojo.Lab;

import java.util.List;

public interface LabMapper {
    int add(Lab lab);

    void delete(int id);

    Lab get(int id);

    int update(Lab lab);

    List<Lab> list();
}
