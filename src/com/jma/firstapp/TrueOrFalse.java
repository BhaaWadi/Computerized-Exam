package com.jma.firstapp;

public class TrueOrFalse extends Q {

    private String  red;

    public TrueOrFalse(String text, String answer, String red) {
        super();
       this.text=text;
        setAnswer(answer);
        setRed(red);


    }

    public String getRed() {
        return red;
    }



    public void setRed(String red) {

        if (red.equalsIgnoreCase("false"))
        this.red = red;
        else
            System.out.println("ادخال خاطى");
    }

    @Override
    public void setAnswer(String answer) {
        if (answer.equalsIgnoreCase("true"))
        super.setAnswer(answer);
        else System.out.println("ادخال خاطى");
    }

    @Override
    public String toString() {
        return getAnswer() +"\n"+red;
    }

    @Override
    public boolean checkanswer(String answerr) {

        return super.checkanswer(answerr);
    }
}
