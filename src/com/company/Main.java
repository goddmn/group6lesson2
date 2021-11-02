package com.company;

public class Main {

    public static void main(String[] args) {
        String color = "Белый";

        // Условная конструкция switch
        switch (color){
            case "Красный":
                System.out.println("Вы грубый и злой!");
                break;
            case "Белый":
                System.out.println("Вы добрый и мягкий!");
                break;
        }

        // Обзор логических операторов
        // '&&' - оператор 'и', '||' - оператор 'или'
        int temp = 15;
        if (color == "Белый" && temp > 20){
            System.out.println("Условие прошло");
        }

        print();
        print();
        print();
        print();
        print();

        printText("Hello 123456789", 10);
        System.out.println(sum(22, 12));
    }

    public static void print(){
        System.out.println("Hello world!");
    }

    public static void printText(String text, int number){
        System.out.println(text + " " + number);
    }

    public static int sum(int a, int b){
        return a + b;
    }

}
