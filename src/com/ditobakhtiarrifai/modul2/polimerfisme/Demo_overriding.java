package com.ditobakhtiarrifai.modul2.polimerfisme;

public class Demo_overriding {
    public static void main(String[] args) {
        x superClass = new x();
        y subClass = new y();

        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }

}
