package com.example.sa_g7_tw2_spring;

import com.example.sa_g7_tw2_spring.Controller.CloudComputing;
import com.example.sa_g7_tw2_spring.DataProcessing.DataProcessing;

import java.io.File;

public class SimpleTest {
    public static void main(String[] args) {
        CloudComputing cc = new CloudComputing();

        System.out.println(new DataProcessing().test(new File("test/record20.wav")));

        int a = 1;
    }
}
