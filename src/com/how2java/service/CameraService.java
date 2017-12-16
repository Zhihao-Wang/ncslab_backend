package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Camera;
import com.how2java.util.Page;

public interface CameraService {

	List<Camera> list();
	int total();
	List<Camera> list(Page page);
	void add(Camera camera);
	void update(Camera camera);
	void delete(Camera camera);
	Camera get(int id);

}
