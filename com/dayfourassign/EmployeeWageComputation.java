package com.dayfourassign;
import java.sql.SQLOutput;
import java.util.Random;
public class EmployeeWageComputation {
    public static void main(String[] args) {


        int day = 0;
        Random random = new Random();
       int  fulltime = 1;

        int randomNumber = random.nextInt(100) + 1;
        double empCheck = randomNumber % 2;
        //double empCheck = Math.floor(Math.random() + 10) % 2;
        for(int i = 0; i<=19; i++) {
            if (fulltime == empCheck) {

                System.out.println("employee is present");
                day++;


            }
             else {
                System.out.println("employee is absent");
                break;

            }
        }

            switch (day) {
                case 20:
                    System.out.println("one month salary " + day * 160);
                    break;
                case 1:
                    System.out.println("one day salary " + day * 160);
                    break;


                default:
                    System.out.println("employeee need to work more");
            }
        }


}