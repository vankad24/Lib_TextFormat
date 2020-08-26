import com.textformat.TextBackground;
import com.textformat.TextColor;
import com.textformat.TextFormat;
import com.textformat.TextStyle;

public class Main {
    public static final String ANSI_BLUE = "\u001B[107m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        System.out.println(ANSI_BLUE+"Hello world!"+ANSI_RESET); //Чёрный фон

        System.out.println(TextBackground.background("Hello world!",TextBackground.BLACK)); //Тоже чёрный фон, но используя библиотеку

        TextFormat text = new TextFormat("Hello world!");
        text.color(TextColor.RED).style(TextStyle.CROSSED).style(TextStyle.ITALICS).print();

        System.out.print(TextColor.color(" --> ",TextColor.YELLOW));

        text.setText("Привет мир!").style(TextStyle.BOLD_UNDERLINED).color(TextColor.TEAL).println();


    }


}
