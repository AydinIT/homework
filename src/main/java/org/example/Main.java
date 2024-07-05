package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 21));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 32));
        System.out.println(permission(generateRandomAge(), 11));
        System.out.println(permission(generateRandomAge(), -1));
    }

    public static String permission(int age, double temperature){
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25){
            return "Можно идти гулять";
        } else{
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        return (int) Math.ceil(Math.random()*100);
    }
}
