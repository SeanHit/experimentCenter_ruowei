package com.sean.backend.controller;

//import com.sean.backend.dao.StudentDao;
//import com.sean.backend.dao.Student_courseDao;
import com.sean.backend.dao.TestDao;
import com.sean.backend.entity.userModule.RolePriv;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import net.sf.json.JSONObject;
@Controller
@ResponseBody
public class StudentController {
    @Autowired
    private TestDao testDao;

//    @Autowired
//    private Student_courseDao student_courseDao;



    @RequestMapping(value = "/front")
    public String StudentFindOne(){
        //RolePriv rolePriv;

        //JSONObject json = JSONObject.fromObject();
        return testDao.findById(1).getRole().getName().toString();
    }
//
//    @GetMapping(value = "/course")
//    public String CourseFind(HttpServletRequest request){
//        String session1=request.getSession().getAttribute("stuid").toString();//获取session并将userName存入session对象
//        if(session1.equals(""))
//            return "错误";
//        List<Object[]> objects= student_courseDao.findUserInfo(session1);
//        int n =objects.size();
//        String string ="";
//        for(int i =0; i<n; i++){
//            for (int j =0;j<5;j++)
//                string +=objects.get(i)[j].toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
//            string +="</br>";
//        }
//        return  "学号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
//                "课&nbsp;&nbsp;&nbsp;程&nbsp;&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
//                "课程号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
//                "教&nbsp;师&nbsp;姓&nbsp;名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
//                "成&nbsp;&nbsp;&nbsp;绩</br>"+string;
//    }
//
//    @GetMapping(value = "/course/score")
//    public String CourseFindById( HttpServletRequest request){
//        String session1=request.getSession().getAttribute("stuid").toString();//获取session并将userName存入session对象
//        if(session1.equals(""))
//            return "错误";
////        session.getAttribute("stuid");
//
//        List<Object[]> objects= student_courseDao.findUserInfo(session1);
//        int n =objects.size();
//        float sum =0.0f;
//        for(int i =0; i<n; i++){
//          sum += Float.parseFloat(objects.get(i)[4].toString());
//        }
//        if(sum/n>0)
//            return "学生的平均成绩为：\n"+sum/n;
//        else
//            return "暂无成绩";
//    }
//
//
////    @GetMapping(value = "/front/Course/{id}")
////    public List<CourseInfo> girlFindOne(@PathVariable("id") String id){
////        return studentDao.findUserInfo(id);
////    }
}
