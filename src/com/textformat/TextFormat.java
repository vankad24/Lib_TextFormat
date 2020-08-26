package com.textformat;

public class TextFormat {
    int code;
    private String text="";

    public TextFormat() { }

    public TextFormat(String text) {
        this.text = text;
    }

    private final static String start_chars = "\u001B[";
    private final static String reset_chars = "\u001B[0m";

    public static String format(String text, int code){
        return start_chars+code+"m"+text+reset_chars;
    }

    public TextFormat setText(String text) {
        this.text = text;
        return this;
    }

    public TextFormat color(TextColor color){
        setText(format(text,color.code));
        return this;
    }

    public TextFormat background(TextBackground background){
        setText(format(text,background.code));
        return this;
    }

    public TextFormat style(TextStyle style){
        setText(format(text,style.code));
        return this;
    }

    @Override
    public String toString() {
        return text;
    }

    public void print(){ System.out.print(text); }
    public void println(){ System.out.println(text); }
}