package com.atguigu.springbootmybatis.mapper;

import com.atguigu.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个数据库的mapper,也可以使用MapperScan批量扫描所有的Mapper接口
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    //是不是使用自动生成的主键，哪个属性是用来封装主键的
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
