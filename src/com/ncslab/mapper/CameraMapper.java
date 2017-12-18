package com.ncslab.mapper;
 
import java.util.List;

import com.ncslab.pojo.Camera;

public interface CameraMapper {

    int add(Camera camera);

    void delete(int id);

    Camera get(int id);

    int update(Camera camera);
       
    List<Camera> list();
    
}