package com.company;
public class Shape{
    int length;
    int wide;
    String weight;
    Shape(int lngth, int wde, String wght) {
        length = lngth;
        wide = wde;
        weight = wght;
    }
    public String getLength(){
        return "Длина фигуры: " + length;
    }
    public String getWide(){
        return "Ширина фигуры: " + wide;
    }
    public String getWeight(){
        return "Вес фигуры: " + weight;
    }
}


