package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.Camera;
import com.how2java.util.Page;


public interface CameraMapper {
 
      
    public int add(Camera camera);
       
      
    public void delete(int id);  
       
      
    public Camera get(int id);
     
      
    public int update(Camera camera);
       
      
    public List<Camera> list();
    
    public List<Camera> list(Page page);
    
      
    public int total();  
    
    
    
}