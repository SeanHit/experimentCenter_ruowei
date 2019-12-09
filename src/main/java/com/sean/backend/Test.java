package com.sean.backend;


import com.sean.backend.entity.Role;
import com.sean.backend.entity.User;
import com.sean.backend.entity.classTest;
import com.sean.backend.entity.teacherTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String [] args){



        Configuration configuration=new Configuration();
        configuration.configure();

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Role role1=new Role();
        Role role2=new Role();
        Role role3=new Role();
        role1.setName("role1");
        role2.setName("role2");
        role3.setName("role3");
        User user1=new User();
        User user2=new User();
        User user3=new User();
        user1.setName("user1");
        user2.setName("user2");
        user3.setName("user3");
        Set<Role> roles1=new HashSet<>();
        roles1.add(role1);
        roles1.add(role2);
        roles1.add(role3);
        user1.setRoles(roles1);
        user2.setRoles(roles1);
        user3.setRoles(roles1);

//
        session.save(role1);
        session.save(role2);
        session.save(role3);
//        //session.save(roles1);
        session.save(user1);
        session.save(user2);
        session.save(user3);

//
//

//
//        classTest class1=new classTest();
//        classTest class2=new classTest();
//        class1.setName("class1");
//        class2.setName("class2");
//        teacherTest teacher1=new teacherTest();
//        teacherTest teacher2=new teacherTest();
//        teacherTest teacher3=new teacherTest();
//
//
//        teacher1.setName("teacher1");
//        teacher2.setName("teacher2");
//        teacher3.setName("teacher3");
//        Set<teacherTest> teacher1s=new HashSet<>();
//        Set<teacherTest> teacher2s=new HashSet<>();
//        teacher1s.add(teacher1);
//        teacher1s.add(teacher2);
//        teacher2s.add(teacher2);
//        teacher2s.add(teacher3);
//        class1.setTeachers(teacher1s);
//        class2.setTeachers(teacher2s);
//
//
//        session.save(class1);//会级联插入class表，teacher表，中间表
//        session.save(class2);//会级联插入class表，teacher表，中间表
//        classTest clazz=(classTest) session.get(classTest.class, 2);
//        Set<teacherTest> teachers=clazz.getTeachers();
//        Iterator<teacherTest> iterator=teachers.iterator();
//        while(iterator.hasNext()){
//            teacherTest teacher=iterator.next();
//            System.out.println(teacher.getName());
//        }
        transaction.commit();
        session.close();




        System.out.println("Successful saved");

    }
}
