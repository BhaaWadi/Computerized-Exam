package com.jma.firstapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Redy {
    public static void main(String[] args) {



        Scanner B=new Scanner(System.in);

        System.out.println("enter the user name");
        String b=B.nextLine();
        System.out.println("enter University number ");
        String number=B.nextLine();


        ArrayList <Q>data=new ArrayList<>();
        try {
            File file=new File("question.txt");

            Scanner scanner=new Scanner(file);
            String s=  scanner.nextLine();
            String password=  scanner.nextLine();
            String numberTheQuestion=scanner.nextLine();



            while (scanner.hasNext()){
                String d=scanner.nextLine();

                if (d.equalsIgnoreCase("Q")){
                    String z=scanner.nextLine();
                    String z2=scanner.nextLine();
                    Q TER=new Q(z,z2);
                    data.add(TER);
                }
                else if (d.equalsIgnoreCase("M")){
                    String d2=scanner.nextLine();
                    String a1=scanner.nextLine();
                    String a2=scanner.nextLine();
                    String a3=scanner.nextLine();
                    String a4=scanner.nextLine();

                    MultipleChoice k=new MultipleChoice(d2,a1,a2,a3,a4);
                    data.add(k);
                }
                else if (d.equalsIgnoreCase("T")){
                    String d2=scanner.nextLine();
                    String ansew=scanner.nextLine();
                    TrueOrFalse q3=new TrueOrFalse(d2,ansew,"false");
                    data.add(q3);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int counter=1;
        Collections.shuffle(data);

        for (int i=0;i<data.size();i++){

            System.out.println(data.get(i).getText());

            System.out.println("ادخل الاجابة");
            String ansew=B.nextLine();
           if (data.get(i).checkanswer(ansew)){
               counter++;
               for (int r=0;r<data.size();r++){

                   System.out.println(data.get(r).getText());
               }
           }




        }

        System.out.println("العلامة"+counter);





    }
}
