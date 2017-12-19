package com.ncslab.service.impl;

import com.ncslab.mapper.LabMapper;
import com.ncslab.pojo.Lab;
import com.ncslab.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabServiceImpl implements LabService {

    @Autowired
    LabMapper labMapper;

    @Override
    public List<Lab> list() {
        return labMapper.list();
    }

    @Override
    public void add(Lab lab) {
        labMapper.add(lab);
    }

    @Override
    public void update(Lab lab) {
        labMapper.update(lab);
    }

    @Override
    public void delete(Lab lab) {
        labMapper.delete(lab.getId());

    }

    @Override
    public Lab get(int id) {
        return labMapper.get(id);
    }
}
