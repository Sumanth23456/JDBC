package com.abc.JDBCDemo.controller;

 

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

 

import com.abc.JDBCDemo.dao.DaoImpl;

import com.abc.JDBCDemo.dao.DaoInterface;

import com.abc.JDBCDemo.model.Student;

 

public class Application {

 

    

    

    

    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
   
    Student std=new Student();
    System.out.println("press 1 to add a Student");
    System.out.println("press 2 to delete a student by ID");
    System.out.println("press 3 to Update a Student by ID");
    System.out.println("press 4 to view a particular Student Information");
    System.out.println("press 5 to view all the Students Information");
    
    System.out.println("choose any one of the option :");
    int option=s.nextInt();
    DaoInterface dao=new DaoImpl();
    while(option>0) {
    	if(option==1) {
    		 System.out.println("Enter sid");
    	          std.setSid(s.nextInt());		     		     
    		     System.out.println("Enter student name");
    		     std.setSname(s.next());
    		     System.out.println("Enter marks ");
    		     std.setMarks(s.nextInt());
    		     System.out.println("Enter city");
    		     std.setCity(s.next());
    		     boolean b=dao.addStudent(std);
    		     if(b) {
    		         System.out.println("student record added successfully");
    		         break;
    		     }
    		     else {

    		         System.out.println("fail");
    		         break;
    		     }
    		
    	}
    	else if(option==2) {
    		System.out.println("enter the id to be delete");
    		int did=s.nextInt();
    		boolean d=dao.deleteStudent(did);
    		if(d==true) {
    			System.out.println("record successfully deleted");
    			break;
    		}
    		else {
    			System.out.println("operation has failed");
    			break;
    		}
    	}
    	else if(option==3) {
    		System.out.println("Enter the id of the record to be updated");
    		std.setSid(s.nextInt());
    		System.out.println("Enter the name of the record to be updated");
    		std.setSname(s.next());
    		System.out.println("Enter the marks of the record to be updated");
    		std.setMarks(s.nextInt());
    		System.out.println("Enter the city of the record to be updated");
    		std.setCity(s.next());
    		boolean b=dao.updateStudent(std);
    		if(b) {
    			System.out.println("Successfully updated");
    			break;
    		}
    		else {
    			System.out.println(" update failed");
    			break;
    		}
    	}
    	else if (option==4) {
    		System.out.println("enter  id to view a particular Student Information");
    		int sid=s.nextInt();
    		Student s1=dao.getStudentById(sid);
    		System.out.println(s1.getSid());
    		System.out.println(s1.getSname());
    		System.out.println(s1.getMarks());
    		System.out.println(s1.getCity());
    		break;
    	}
    	else if (option==5) {
    		List<Student> ls=dao.viewAllStudents();
    		for(Student s3:ls){
    			System.out.println(s3);
    		}
    		break;
    	}
    	else if(option==6) {
    		List<Student> ls=dao.orderBy();
    		for(Student s3:ls){
    			System.out.println(s3);
    		}
    		break;
    	}
    	else {
    		System.out.println("Invalid option ");
    		break;
    	}
    }
    

   
    
    }

 

}
 
 
