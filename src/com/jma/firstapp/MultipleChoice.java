package com.jma.firstapp;

public class MultipleChoice  extends Q {

   private String choose1;
   private String choose2;
  private   String choose3;


    public MultipleChoice(String text, String answer, String choose1, String choose2, String choose3) {
        super(text, answer);
        this.choose1 = choose1;
        this.choose2 = choose2;
        this.choose3 = choose3;
    }

    public String getChoose1() {
        return choose1;
    }

    public void setChoose1(String choose1) {
        this.choose1 = choose1;
    }

    public String getChoose2() {
        return choose2;
    }

    public void setChoose2(String choose2) {
        this.choose2 = choose2;
    }

    public String getChoose3() {
        return choose3;
    }

    public void setChoose3(String choose3) {
        this.choose3 = choose3;
    }

    @Override
    public String toString() {
        return getAnswer()+"\n"+choose1+"\n"+choose2+"\n"+choose3;
    }

    @Override
    public boolean checkanswer(String answerr) {
        return super.checkanswer(answerr);
    }
}
