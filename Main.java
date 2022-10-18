package com.rajesh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculateBMI();
    }
    public static void calculateBMI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight in kg :");
        float weight = sc.nextFloat();
        System.out.println("Please enter your height in cm :");
        float height = sc.nextFloat();
        float bmi = 100*100*(weight/(height*height));
        System.out.println("Your BMI is "+bmi);
        printBMICategory(bmi);

    }
    public static void printBMICategory(float bmi){
        if(bmi < 18.5){
            System.out.println("You are underweight");
        }else if(bmi < 25){
            System.out.println("You are normal");
        }else if(bmi < 30){
            System.out.println("You are overweight");
        }else{
            System.out.println("You are obese");
        }
    }
}
