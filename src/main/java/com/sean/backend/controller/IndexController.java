package com.sean.backend.controller;


//import com.sean.backend.dao.StudentDao;
//import com.sean.backend.entity.Student;

//@Controller
////@ResponseBody
//@RequestMapping("/front/*")
//public class IndexController {
//    @Autowired
//    private TestDao testDao;
//
//    //index页面
//    @RequestMapping("/index")
//    public String index(HttpServletRequest request){
//        String id = request.getParameter("username");
//      String password = request.getParameter("password");
//        return " 2222";
////        return testDao.findByRoleid(1);
//    }

////    //注册页面
////    @RequestMapping("/register")
////    public String register(){
////        return "register"; //跳转的界面hhh
////    }
//    //登录方法
//    @RequestMapping("/addlogin")
//    public String login(HttpServletRequest request){
//        String id = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        Student student =studentDao.findByIdAndAndPassword(id,password);
//        String str = "";
//        if (student !=null){
//            str = "index";
////                 //////////////////////
////            Session添加
//            HttpSession session=request.getSession();//获取session并将userName存入session对象
//            session.setAttribute("stuid", id);
////            ///////////
//        }else {
//            str = "login";
//        }
//        return str;
//
//    }
//
//    //登录页面
//    @RequestMapping("/login")
//    public String login2(HttpServletRequest request){
//
//        HttpSession session=request.getSession();//获取session并将userName存入session对象
//        session.setAttribute("stuid", "");
//        return "login";
//    }
//
////    @GetMapping(value = "/course")
////    public String studentFindOne(@PathVariable("id") String id){
////        Student student =studentDao.findByIdAndAndPassword("170720114","lx123456");
////
////        return student.getAddress();
////    }











//}
