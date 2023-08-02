
package com.abc.JDBCDemo.dao;

 

import java.util.List;

 

import com.abc.JDBCDemo.model.Student;

 

public interface DaoInterface {

 

    public boolean addStudent(Student std);

    public boolean deleteStudent(int sid);

    public boolean updateStudent(Student std);

    public Student getStudentById(int sid);

    public List<Student> viewAllStudents();
    public List<Student> orderBy();
}

 
