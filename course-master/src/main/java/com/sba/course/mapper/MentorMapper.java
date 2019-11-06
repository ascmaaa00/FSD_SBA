package com.sba.course.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sba.course.model.MentorCourse;

@Mapper
public interface MentorMapper {
	
	@Select("SELECT a.id,a.name,a.mentorname,a.skill,a.startdate,a.enddate,a.fee, coalesce(b.rating, 0) as rate, a.description FROM sba_course.course a  left join (SELECT courseid, round(avg(rating)) as rating FROM sba_course.rate group by courseid) b on a.id =b.courseid where a.status='available'")
	List<MentorCourse> findMentors();
	
	@Select("SELECT a.id,a.name,a.mentorname,a.skill,a.startdate,a.enddate,a.fee, a.description, a.username FROM sba_course.course a where a.username is null")
	List<MentorCourse> searchMentors();
	
	@Update("update sba_course.course set username=#{username},progress=1 where id = #{id}")
	void bookCourse(@Param("username") String username, @Param("id") Integer id);

}