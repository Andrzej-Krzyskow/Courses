package com.andy.crud;

import com.andy.crud.dao.StudentDAO;
import com.andy.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner ->{
            // createStudent(studentDAO);
            createMultipleStudent(studentDAO);
            // readStudent(studentDAO);
            // queryForAllStudents(studentDAO);
            // queryForStudentsByLastName(studentDAO);
            // updateStudent(studentDAO);
            // removeStudent(studentDAO);
            // deleteAll(studentDAO);
        };
    }

    private void deleteAll(StudentDAO studentDAO) {
        System.out.println("Deleting all students");
        int studentsDeletedCount = studentDAO.deleteAll();
        System.out.println("Deleted students: " + studentsDeletedCount);
    }

    private void removeStudent(StudentDAO studentDAO) {
        int studentId = 1;

        System.out.println("Deleting the student with id: " + studentId);
        studentDAO.delete(studentId);

    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;

        System.out.println("Updating the student with id: " + studentId);

        Student tempStudent = studentDAO.findById(1);
        tempStudent.setFirstName("Scooooby-dooo");

        studentDAO.update(tempStudent);
        System.out.println("Updated student: "+ tempStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {

        List<Student> theStudents = studentDAO.findByLastName("Temp");

        // display all students
        for (Student student : theStudents) {
            System.out.println(student);
        }
    }

    private void queryForAllStudents(StudentDAO studentDAO) {
        // get the list of all students
        List<Student> theStudents = studentDAO.findAll();

        // display all students
        for (Student student : theStudents) {
            System.out.println(student);
        }
        // System.out.println(students.stream().sorted(Comparator.comparing(Student::getLastName).reversed()).toList());
    }

    private void readStudent(StudentDAO studentDAO) {
        // create the student
        System.out.println("Creating the new student...");
        Student tempStudent = new Student("Andy", "Temp", "123@temp.com");

        // save the student
        System.out.println("Saving the new students...");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Student saved. Generated ID: " + tempStudent.getId());

        // retrieve the student based on the id
        Student retrievedStudent = studentDAO.findById(tempStudent.getId());

        // display the student
        System.out.println("\nRetrieved student:\n"+retrievedStudent);
    }

    private void createMultipleStudent(StudentDAO studentDAO) {
        // create multiple student
        System.out.println("Creating three students at once...");
        Student tempStudent1 = new Student("Andy1", "Krzys1", "1231@gmail.com");
        Student tempStudent2 = new Student("Andy2", "Krzys2", "1232@gmail.com");
        Student tempStudent3 = new Student("Andy3", "Krzys3", "1233@gmail.com");

        // save the students
        System.out.println("Saving the new students...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
    }

    private void createStudent(StudentDAO studentDAO){
        // create the student
        System.out.println("Creating the new student...");
        Student tempStudent = new Student("Andy", "Krzys", "123@gmail.com");

        // save the student
        System.out.println("Saving the new student...");
        studentDAO.save(tempStudent);

        // print the newly created id
        System.out.println("Student saved. Generated ID: " + tempStudent.getId());

    }




}
