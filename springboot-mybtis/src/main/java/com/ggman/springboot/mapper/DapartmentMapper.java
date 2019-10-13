package com.ggman.springboot.mapper;

import com.ggman.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

//@Mapper  配置了自动扫描
public interface DapartmentMapper {
    @Select("select *from dapartment where id=#{id}")
    public Department getdeptById(Integer id );

    @Delete("delete from dapartment where id=#{id}")
    public int deleteDeptById(Integer id );

    @Options(useGeneratedKeys = true,keyProperty = "id")        //告诉人家这个是一个自增id
    @Insert("insert into  department (departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update  department  set  departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
