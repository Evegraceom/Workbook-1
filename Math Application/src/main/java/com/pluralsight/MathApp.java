package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 80000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The Higher Salary is " + highestSalary);

        double carPrice = 100000;
        double truckPrice = 210000;

        double cheaperPrice = Math.min(carPrice,truckPrice);

        System.out.println("The Cheaper Price is $" + cheaperPrice);

        double radius = 7.5;
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle is " + area);









    }


}
