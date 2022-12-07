package org.example;

import org.example.Entities.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        StudentEntity student = new StudentEntity();
        student.setFirstName("AAAA");
        student.setLastName("BBBBB");
        student.setBirthAt(2);
        student.setPoints(3);
        student.setStudentCondition("disabled");
        student.setPoints(21.0);
        Repository.save(student);

        StudentEntity student1 = new StudentEntity();
        student.setFirstName("CCCC");
        student.setLastName("DDDD");
        student.setBirthAt(2008);
        student.setPoints(10);
        student.setStudentCondition("obecny");
        student.setPoints(21.0);
        Repository.save(student);

        //StudentEntity s1 = Repository.remove_(student1.getId());

        StudentEntity s = Repository.searchById(1);
        s.setBirthAt(2001);
        Repository.update(s);
        System.out.printf(s.toString());

//        Repository.remove(5);
//        student.setFirstName("CHUUJ");
//        Repository.update(student);
    }

}
