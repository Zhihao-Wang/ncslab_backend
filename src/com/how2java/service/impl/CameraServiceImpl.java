package com.how2java.service.impl;

import java.util.List;


import com.how2java.pojo.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CameraMapper;
import com.how2java.service.CameraService;
import com.how2java.util.Page;

@Service
public class CameraServiceImpl implements CameraService {
	@Autowired
	CameraMapper cameraMapper;
	
	
	public List<Camera> list(){
		return cameraMapper.list();
	}


	@Override
	public List<Camera> list(Page page) {
		// TODO Auto-generated method stub
		return cameraMapper.list(page);
	}


	@Override
	public int total() {
		return cameraMapper.total();
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
		// TODO Auto-generated method stub
		return cameraMapper.get(id);
	};

}
