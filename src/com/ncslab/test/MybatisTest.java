package com.ncslab.test;

import com.ncslab.pojo.Camera;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ncslab.mapper.CameraMapper;



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
