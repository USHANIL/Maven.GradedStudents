package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Classroom
{
    Student[] students;
    int maxStudents;

    public Classroom(Student[] students1) //constructor with students array parameter
    {
        this.students = students1;
    }

    public Classroom(int maxNumberOfStudents) //contructor with max number of students
    {
        this.maxStudents = maxNumberOfStudents;

    }

    public Classroom() //default constructor with 30 students
    {
        this.students = new Student[30];
    }


    //method to return the students
    public Student[] getStudents()
    {
        return students;
    }

    //String format of students
    public String studentToStringformat(Student[] inpStudents)
    {
        StringBuilder sb = new StringBuilder();
     //   sb.append("");
        if (inpStudents != null)
        {
            Student[] output = inpStudents;
            // Then
            for (int i = 0; i < output.length; i++) {
                sb.append(String.format("Student Name: %s %s\nAverage Score: %s\n%s", output[i].firstName, output[i].lastName, output[i].getStudentAverageExamScore(), output[i].getExamScores()));
                // System.out.println(sb);
            }
        }
        return sb.toString();
    }

    public Double getClassAverageExamScore()
    {
        Double total = 0.0;
        if (students !=null ) {
            for (int i = 0; i < students.length; i++) {
                total += students[i].getStudentAverageExamScore();
            }
            return total / students.length;
        }
        else return 0.0;

    }

    public void addStudent(Student student)
    {
        students = new Student[maxStudents];
        if (students !=null ) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    break;
                }
            }
        }
        else
        {
            students[0] = student;
        }

    }

    public Student[] removeStudent(String firstName, String lastName)
    {
        if (students !=null ) {
            for (int i = 0; i < students.length; i++)
            {
                if ((students[i].firstName + students[i].lastName).equals(firstName + lastName)) ;
                {
                    Student temp = students[i];
                    for (int j = i; j < students.length - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[students.length - 1] = null;
                    break;
                }
            }
        }
        return students;
    }

    public Student[] getStudentsByScore()
    {
        //sort students by score highest to lowest score
        Arrays.sort(students, Collections.reverseOrder());

        return students;
    }

    public Map getGradeBook()
    {
        Map<String, String> book = new TreeMap<String, String>();

        return book;
    }


}
