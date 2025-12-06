package com.example.filesexamples.controllers;

import javafx.scene.control.Button;

import java.io.*;
import java.util.ArrayList;

public class FIleCRUD {

    String filePath;

    public FIleCRUD(String filePath){
        this.filePath = filePath;


    }

    public void create(String content){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true); //segundo parametro: para añadir y no sobreescribir
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.newLine(); //dos linea
            bufferedWriter.close(); //SIEMPRE CERRAR EL COSHINO ARCHIVO
        }catch (IOException e) {
            e.printStackTrace();

        }
    }

    public ArrayList read() {
        ArrayList<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public void update(int index, String content){
        ArrayList<String> list = this.read();
        list.set(index, content);
        try {
            FileWriter fileWriter = new FileWriter(filePath); //segundo parametro: para añadir y no sobreescribir
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(String line: list){
                bufferedWriter.write(line);
                bufferedWriter.newLine(); //dos linea
            }
            bufferedWriter.close(); //SIEMPRE CERRAR EL COSHINO ARCHIVO
        }catch (IOException e) {
            e.printStackTrace();

        }
    }
    //nombre de usuario y cuantos barcos unidos y cuales no

    public void delete(int index){
        ArrayList<String> list = this.read();
        list.remove(index);
        try {
            FileWriter fileWriter = new FileWriter(filePath); //segundo parametro: para añadir y no sobreescribir
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(String line: list){
                bufferedWriter.write(line);
                bufferedWriter.newLine(); //dos linea
            }
            bufferedWriter.close(); //SIEMPRE CERRAR EL COSHINO ARCHIVO
        }catch (IOException e) {
            e.printStackTrace();

        }
    }
}
