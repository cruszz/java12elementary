package lesson1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpressions {


    public static void main(String[] args) {
        String text = "youremail@email.com";
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

        }

        System.out.println(text);


    }
}
