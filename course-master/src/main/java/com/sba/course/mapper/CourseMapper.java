package com.sba.course.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

import com.sba.course.model.Course;


@Mapper
public interface CourseMapper {

	@Insert("insert into sba_course.course(name,description,skill,startdate,enddate,mentorname,fee) values(#{name},#{description},#{skill},#{startdate},#{enddate},#{mentorname},#{fee})")
	@SelectKey(statement = "select LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
	void addCourse(Course course);
}
