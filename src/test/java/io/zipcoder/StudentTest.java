package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public void testDefaultConstructor() {
        // Given
        String expectedfirstName = "Rose";
        String expectedlastName  = "Petal";
        // ArrayList<Double> examScore =  new ArrayList<>();
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        String examScoresStr = "Exam Scores:" + "\n" +
                "Exam 1 -> 100" + "\n" +
                "Exam 2 -> 95" + "\n" +
                "Exam 3 -> 123" + "\n" +
                "Exam 4 -> 96\n";

        // When
        Student student = new Student(expectedfirstName,expectedlastName, examScores);

        // Then
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualScore = student.getExamScores();

        Assert.assertEquals(expectedfirstName, actualFirstName);
        Assert.assertEquals(expectedlastName, actualLastName);
        Assert.assertEquals(examScoresStr, actualScore);
    }

    @Test
    public void testgetFirstName() {
        String expectedfirstName = "Leon";
        String lastName = "Hunter";

        Student student = new Student(expectedfirstName, lastName, null);

        // When
        String actual = student.getFirstName();
        Assert.assertEquals(expectedfirstName, actual);

    }

    @Test
    public void testsetFirstName()
    {
        String expectedfirstName = "Leon1";

        Student student = new Student(null, null, null);

        // When
        student.setFirstName(expectedfirstName);
        String actual = student.getFirstName();


        Assert.assertEquals(expectedfirstName, actual);
    }

    @Test
    public void testgetLastName() {
        String expectedfirstName = "Leon";
        String expectedlastName = "Hunterrrr";
        Student student = new Student(expectedfirstName, expectedlastName, null);

        // When
        String actual = student.getLastName();
        Assert.assertEquals(expectedlastName, actual);
    }

    @Test
    public void testsetLastName() {

        String expectedlastName = "Hunter1";

        Student student = new Student(null, null, null);

        // When
        student.setLastName(expectedlastName);
        String actual = student.getLastName();


        Assert.assertEquals(expectedlastName, actual);

    }

    @Test
    public void testgetExamScores()
    {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        String examScoresExp = "Exam Scores:" + "\n" +
                "Exam 1 -> 100" + "\n" +
                "Exam 2 -> 95" + "\n" +
                "Exam 3 -> 123" + "\n" +
                "Exam 4 -> 96\n";


        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        Assert.assertEquals(examScoresExp, output);


    }

    @Test
    public void testgetExamScores1()
    {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {  };

        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        Assert.assertEquals("Exam Scores:\n", output);


    }
    @Test
    public void testgetNumberExamsTaken() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Integer expected = 4;

        Student student = new Student(firstName, lastName, examScores);

        // When
        Integer output = student.getNumberExamsTaken();

        // Then
        Assert.assertEquals(expected, output);
    }


    @Test
    public void testaddExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0 };

        Student student = new Student(firstName, lastName, examScores);
        Double toAddScore = 123.00;

        String examScoresStr = "Exam Scores:" + "\n" +
                "Exam 1 -> 100" + "\n" +
                "Exam 2 -> 95" + "\n" +
                "Exam 3 -> 123" + "\n";

        // When
        student.addExamScore(toAddScore);
        String scoresActualOutput = student.getExamScores();

        // Then
        Assert.assertEquals(examScoresStr, scoresActualOutput);
    }

    @Test
    public void testsetExamScore() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0 };
        String examScoresExp = "Exam Scores:\n" +
                "Exam 1 -> 100\n" +
                "Exam 2 -> 123\n";

        Student student = new Student(firstName, lastName, examScores);
        Double toAddScore = 123.00;

        // When
        student.setExamScore(1,toAddScore);

        // When
        String scoresActualOutput = student.getExamScores();

        // Then
        Assert.assertEquals(examScoresExp, scoresActualOutput);
    }

    @Test
    public void testgetStudentAverageExamScore()
    {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Double expOutput = 103.5;

        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getStudentAverageExamScore();

        // Then
        Assert.assertEquals(expOutput, output);

    }
}