package com.textformat;

public class TextBackground extends TextFormat {
    private TextBackground(int code) {
        this.code = code;
    }

    public static final TextBackground LIGHT_GRAY = new TextBackground(7);
    public static final TextBackground WHITE = new TextBackground(40);
    public static final TextBackground RED = new TextBackground(41);
    public static final TextBackground GREEN = new TextBackground(42);
    public static final TextBackground PALE_YELLOW = new TextBackground(43);
    public static final TextBackground BLUE = new TextBackground(44);
    public static final TextBackground PURPLE = new TextBackground(45);
    public static final TextBackground TEAL = new TextBackground(46);
    public static final TextBackground GRAY = new TextBackground(47);
    public static final TextBackground DARK_GRAY = new TextBackground(100);
    public static final TextBackground PINK = new TextBackground(101);
    public static final TextBackground YELLOW = new TextBackground(103);
    public static final TextBackground SKY = new TextBackground(104);
    public static final TextBackground MAGENTA = new TextBackground(105);
    public static final TextBackground CYAN = new TextBackground(106);
    public static final TextBackground BLACK = new TextBackground(107);

    public static String background(String text, TextBackground background){
        return format(text, background.code);
    }
}