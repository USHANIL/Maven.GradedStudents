package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest
{
    @Test
    public void testgetStudents()  //test constructor with students parameter
    {
        // : Given

        Double[] s1Score = { 100.0, 95.0, 123.0, 96.0};
        Double[] s2Score = { 225.0, 25.0};

        Student s1 = new Student("Usha", "Kun", s1Score);
        Student s2 = new Student("Anil", "Kunapareddy", s2Score);

        Student[] students = {s1,s2};

        Classroom classroom = new Classroom(students);

        // When
       // Student[] output = classroom.getStudents();
        String outString = classroom.studentToStringformat(classroom.getStudents());
        System.out.println(outString);

        // Then
//        for (int i=0; i<output.length; i++)
//        {
//            StringBuilder sb = new StringBuilder();
//            sb.append(String.format("%s %s\n%s",output[i].firstName, output[i].lastName, output[i].getExamScores()));
//            System.out.println(sb);
//        }
    }

    @Test
    public void testgetAverageExamScore() {
        // : Given
        Double[] s1Score = { 100.0, 95.0};
        Double[] s2Score = { 225.0, 25.0};

        Student s1 = new Student("Usha", "Kun", s1Score);
        Student s2 = new Student("Anil", "Kunapareddy", s2Score);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);
        Double expected = 111.25;

        // When
        Double actual = classroom.getClassAverageExamScore();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testaddStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] s1Score = { 100.0, 95.0, 123.0, 96.0};
        Student s2 = new Student("Leon", "Hunter", s1Score);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(s2);
        Student[] postEnrollment = classroom.getStudents();


        System.out.println("===========================");
        System.out.println(classroom.studentToStringformat(preEnrollment));
        System.out.println("===========================");

        String outString = classroom.studentToStringformat(postEnrollment);
        System.out.println(outString);

    }


}
