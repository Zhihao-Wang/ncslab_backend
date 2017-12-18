package com.ncslab.service;

import java.util.List;

import com.ncslab.pojo.Camera;

public interface CameraService {

	List<Camera> list();
	void add(Camera camera);
	void update(Camera camera);
	void delete(Camera camera);
	Camera get(int id);

}
