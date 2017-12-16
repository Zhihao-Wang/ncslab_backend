package com.how2java.test;

import java.util.List;

import com.how2java.pojo.Camera;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CameraMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private CameraMapper categoryMapper;

//	@Test
	public void testAdd() {
		for (int i = 0; i < 100; i++) {
			Camera camera = new Camera();
			camera.setNameCN("new Category");
			categoryMapper.add(camera);
		}

	}



}
