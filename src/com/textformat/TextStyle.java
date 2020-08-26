package com.textformat;

public class TextStyle extends TextFormat{
    private TextStyle(int code) {
        this.code = code;
    }

    final static public TextStyle BOLD = new TextStyle(1);
    final static public TextStyle ITALICS = new TextStyle(3);
    final static public TextStyle UNDERLINED = new TextStyle(4);
    final static public TextStyle CROSSED = new TextStyle(9);
    final static public TextStyle BOLD_UNDERLINED= new TextStyle(21);
    final static public TextStyle FRAMED= new TextStyle(51);

    public static String style(String text, TextStyle style){
        return format(text, style.code);
    }

}

