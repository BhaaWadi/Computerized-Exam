package com.jma.firstapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner m=new Scanner(System.in);
        System.out.println("enter the user name");
        String name=m.nextLine();
        System.out.println("enter the password");
        int password =m.nextInt();
        System.out.println("1)Add Question\n2)Add MultipleChoice\n3)Add  True/false Question\n4)print Question\n5)Exam Settings\n6)Exi");


       int counter=1;
       boolean islooping=true;
       ArrayList<String >data=new ArrayList<>();


              if(name.equalsIgnoreCase("bhaa") &&password==1) {


                  try {

                      PrintWriter r = new PrintWriter("question.txt");
                      r.println("the name of the teacher : "+name);
                      r.println("the password"+password);
                      System.out.println("الرجاء ادخال عدد الاسئلة المراد اضافتها");
                      int number2=m.nextInt();
                      r.println("number the question is : "+number2);

                      while (islooping || counter>=number2) {
                          System.out.println("Enter the Choice ");
                          int p = m.nextInt();
                          switch (p) {

                              case 1:
                                  System.out.println("enter the Q");
                                  String w = m.nextLine();

                                  String w4 = m.nextLine();
                                  System.out.println("enter the ansew");
                                  String g=m.nextLine();


                                  r.println("Q");

                                  r.println(w4);
                                  r.println(g);

                                  data.add(w4);
                                 counter++;

                                  break;
                              case 2:
                                  System.out.println("enter THE M");

                                  String e = m.nextLine();
                                  String d1 = m.nextLine();
                                  System.out.println("enter the answer");
                                  String d2 = m.nextLine();
                                  System.out.println("enter the choose1");
                                  String d3 = m.nextLine();
                                  System.out.println("enter the choose2");
                                  String d4 = m.nextLine();
                                  System.out.println("enter the choose3");
                                  String d5 = m.nextLine();


                                  r.println("M");
                                  r.println(d1);
                                  r.println(d2);
                                  r.println(d3);
                                  r.println(d4);
                                  r.println(d5);
                                  data.add(d1);
                                  data.add(d2);
                                  data.add(d3);
                                  data.add(d4);
                                  data.add(d5);
                                  counter++;

                                  break;
                              case 3:
                                  System.out.println("enter   the T");

                                  String tr = m.nextLine();
                                  String g1 = m.nextLine();
                                  System.out.println("enter the ansew");
                                  String g2 = m.next();


                                  r.println("T");
                                  r.println(g1);
                                  r.println(g2);

                                  data.add(g1);
                                  counter++;

                                  break;
                              case 4:
                                  for (int i = 0; i < data.size(); i++) {
                                      System.out.println(data.get(i));
                                  }
                                  break;
                              case 5:
                                  System.out.println("أدخل وقت الامتحان");
                                  System.out.println("ملاحظة/ يجب ان يكون بين 10-30 دقيقة");
                                  int timeexam = m.nextInt();

                                  if (timeexam > 30 || timeexam < 10) {

                                      System.out.println("الوقت غير مسموح به ادخل وقت صحيح");
                                     timeexam = m.nextInt();
                                  }
                                  else   r.println("Exam time : "+timeexam);
                                  break;
                              case 6:
                                  r.close();
                                  return;


                          }

                          System.out.println("enter yes/no");


                          String ee = m.nextLine();
                          if (ee.equalsIgnoreCase("no")) {
                              islooping = false;
                          }

                      }


                  } catch (FileNotFoundException e1) {
                      e1.printStackTrace();
                  }

              }



    }
}
