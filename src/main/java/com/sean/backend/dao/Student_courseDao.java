package com.sean.backend.dao;

//import com.sean.backend.entity.CourseInfo;
//import com.sean.backend.entity.Student_course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
//
//public interface Student_courseDao extends JpaRepository<Student_course,String> {
//
////    @Query(value = "select new com.sean.backend.entity.CourseInfo(s_c.studentid,c.name,s_c.courseid,t.name,s_c.score) " +
////            "from Student_course s_c left join Couese c on s_c.courseid =c.id" +
////            "where s_c.studentid =:id",nativeQuery = true)
////    List<CourseInfo> findUserInfo1(@Param("id") String id);
////
////    @Query(value = "SELECT  new com.sean.backend.entity.CourseInfo(s_c.studentid,c.name,s_c.courseid,s_c.score)FROM Student_course s_c LEFT JOIN Couese c ON s_c.courseid=c.id WHERE s_c.studentid =:id",nativeQuery = false)
////    CourseInfo findUserInfo2(@Param("id") String id);
//
//    @Query(value = "SELECT s_c.studentid,c.name,c.id,t.tname,s_c.score " +
//            "FROM student_course s_c,course c,teacher t " +
//            "WHERE s_c.studentid=?1 and s_c.courseid=c.id and c.teacherid=t.tid", nativeQuery = true)
//     List<Object[]> findUserInfo(String id);
//
//
//
//}
