package com.ncslab.service.impl;

import com.ncslab.mapper.SuperviseDeviceMapper;
import com.ncslab.pojo.SuperviseDevice;
import com.ncslab.service.SuperviseDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperviseDeviceServiceImpl implements SuperviseDeviceService {

    @Autowired
    SuperviseDeviceMapper superviseDeviceMapper;
    @Override
    public List<SuperviseDevice> list() {
        return superviseDeviceMapper.list();
    }

    @Override
    public void add(SuperviseDevice superviseDevice) {
        superviseDeviceMapper.add(superviseDevice);
    }

    @Override
    public void update(SuperviseDevice superviseDevice) {
        superviseDeviceMapper.update(superviseDevice);
    }

    @Override
    public void delete(SuperviseDevice superviseDevice) {
        superviseDeviceMapper.delete(superviseDevice.getId());
    }

    @Override
    public SuperviseDevice get(int id) {
        return superviseDeviceMapper.get(id);
    }
}
