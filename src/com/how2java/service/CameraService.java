package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Camera;

public interface CameraService {

	List<Camera> list();
	void add(Camera camera);
	void update(Camera camera);
	void delete(Camera camera);
	Camera get(int id);

}
