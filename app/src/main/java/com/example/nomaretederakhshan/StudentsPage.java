package com.example.nomaretederakhshan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class StudentsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_page);
        TextView student1 = (TextView) findViewById(R.id.cellScore1);
        TextView student2 = (TextView) findViewById(R.id.cellScore2);
        TextView student3 = (TextView) findViewById(R.id.cellScore3);
        TextView student4 = (TextView) findViewById(R.id.cellScore4);
        TextView student5 = (TextView) findViewById(R.id.cellScore5);
        Button sort = (Button) findViewById(R.id.sortButton);
        Button averageButton = (Button) findViewById(R.id.averageButton);

        String[] students = {"Ali :9","Mohammad :10","Alireza :20","Setare :18","Akbar :15"};
        student1.setText(students[0]);
        student2.setText(students[1]);
        student3.setText(students[2]);
        student4.setText(students[3]);
        student5.setText(students[4]);
        
        //Scores
        int aliScore = 9 ,mohammadScore =10 , alirezaScore = 20 , setareScore = 18 , akbarScore = 15;
        //average
        float averageScores = (aliScore+akbarScore+alirezaScore+setareScore+mohammadScore)/ students.length;
        
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(students);
                student1.setText(students[0]);
                student2.setText(students[1]);
                student3.setText(students[2]);
                student4.setText(students[3]);
                student5.setText(students[4]);
            }
            
        });
        averageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(StudentsPage.this,String.format("%f",averageScores), Toast.LENGTH_SHORT).show();
            }
        });

        student1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int score1 = Integer.parseInt(students[0].substring(students[0].indexOf(":")+1));
                if (score1<10){
                    Toast.makeText(StudentsPage.this, "تکاور گرامی . حداقل تقلب میکردی.پاس نشدید", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(StudentsPage.this, "پاس شدید", Toast.LENGTH_SHORT).show();
                }
            }
        });
        student2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score2 = Integer.parseInt(students[1].substring(students[1].indexOf(":")+1));
                if (score2<10){
                    Toast.makeText(StudentsPage.this, "تکاور گرامی . حداقل تقلب میکردی.پاس نشدید", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(StudentsPage.this, "پاس شدید", Toast.LENGTH_SHORT).show();
                }
            }
        });
        student3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score3 = Integer.parseInt(students[2].substring(students[2].indexOf(":")+1));
                if (score3<10){
                    Toast.makeText(StudentsPage.this, "تکاور گرامی . حداقل تقلب میکردی.پاس نشدی", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(StudentsPage.this, "پاس شدید", Toast.LENGTH_SHORT).show();
                }
            }
        });
        student4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score4 = Integer.parseInt(students[3].substring(students[3].indexOf(":")+1));
                if (score4<10){
                    Toast.makeText(StudentsPage.this, "تکاور گرامی . حداقل تقلب میکردی.پاس نشدی", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(StudentsPage.this, "پاس شدید", Toast.LENGTH_SHORT).show();
                }
            }
        });
        student5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score5 = Integer.parseInt(students[4].substring(students[4].indexOf(":")+1));
                if (score5<10){
                    Toast.makeText(StudentsPage.this, "تکاور گرامی . حداقل تقلب میکردی.پاس نشدی", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(StudentsPage.this, "پاس شدید", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}