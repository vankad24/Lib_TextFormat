package com.textformat;

public class TextColor extends TextFormat {
    private TextColor(int code) {
        this.code = code;
    }
    
    public static final TextColor WHITE = new TextColor(30);
    public static final TextColor RED = new TextColor(31);
    public static final TextColor GREEN = new TextColor(32);
    public static final TextColor PALE_YELLOW = new TextColor(33);
    public static final TextColor BLUE = new TextColor(34);
    public static final TextColor PURPLE = new TextColor(35);
    public static final TextColor TEAL = new TextColor(36);
    public static final TextColor GRAY = new TextColor(37);
    public static final TextColor DARK_GRAY = new TextColor(90);
    public static final TextColor PINK = new TextColor(91);
    public static final TextColor YELLOW = new TextColor(93);
    public static final TextColor SKY = new TextColor(94);
    public static final TextColor MAGENTA = new TextColor(95);
    public static final TextColor CYAN = new TextColor(96);
    public static final TextColor BLACK = new TextColor(97);

    public static String color(String text, TextColor color){
        return format(text, color.code);
    }
    
}
