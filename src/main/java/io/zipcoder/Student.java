package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList();

    public Student(String firstName, String lastName, Double examScoresInput[])
    {
        this.firstName = firstName;
        this.lastName = lastName;
       if (examScoresInput != null)
       {
            Collections.addAll(this.examScores, examScoresInput);
       }
       else
       {
           this.examScores = null;
       }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getNumberExamsTaken() {
        if (this.examScores != null) {
            return this.examScores.size();
        } else return 0;
    }

    public String getExamScores() {
        StringBuilder output=new StringBuilder();
        output.append("Exam Scores:\n");
        for(int i=0;i<examScores.size();i++){
            output.append(String.format("Exam %s -> %s\n",i+1,Math.round(examScores.get(i))));
        }
        return output.toString();
    }

    public void addExamScore(Double examScore)
    {
        if (this.examScores != null)
        {
            examScores.add(examScore);
        }

    }

    public void setExamScore(int index, Double examScore)
    {
        if (this.examScores != null)
        {
            examScores.set(index, examScore);
        }
        else
        {
            examScores.add(index, examScore);
        }

    }
    public Double getAverageExamScore()
    {
        Double sum = 0.0;
        if (this.examScores != null)
        {
            for (Double score : examScores)
            {
                sum += score;

            }

            return sum / getNumberExamsTaken();
        }
        else {
            return sum; //return 0
        }
    }


}


