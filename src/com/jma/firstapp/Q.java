package com.jma.firstapp;

public class Q {

       String text;
      private String answer;

    public Q(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public Q() {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean checkanswer(String answerr){

        if(answerr.equals(answer)){
            return true;
        }

        return false;


    }

    @Override
    public String toString() {
        return
                "text: " + text
                ;
    }
}
