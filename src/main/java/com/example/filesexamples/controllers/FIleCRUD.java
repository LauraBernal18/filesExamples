package com.example.filesexamples.controllers;

import javafx.scene.control.Button;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FIleCRUD {
    public void create(String filePath, String content){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        }catch (IOException e) {
            e.printStackTrace();

        }
    }
}
