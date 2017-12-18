package com.ncslab.service.impl;

import java.util.List;


import com.ncslab.pojo.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncslab.mapper.CameraMapper;
import com.ncslab.service.CameraService;


@Service
public class CameraServiceImpl implements CameraService {
	@Autowired
	CameraMapper cameraMapper;

	public List<Camera> list(){
		return cameraMapper.list();
	}

	@Override
	public void add(Camera camera) {
		cameraMapper.add(camera);
		
	}

	@Override
	public void update(Camera camera) {
		cameraMapper.update(camera);
	}


	@Override
	public void delete(Camera camera) {
		cameraMapper.delete(camera.getId());
	}


	@Override
	public Camera get(int id) {
		return cameraMapper.get(id);
	};

}
