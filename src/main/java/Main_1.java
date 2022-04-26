import org.apache.commons.lang3.StringUtils;

public class Main_1 {

    public static String abbr(String str, int size) {
        return str.substring(0, size - 3) + "...";
    }

    public static boolean abbrTest() {
        if (!"I...".equals(abbr("IgorKlimenko", 4))) {
            return false;
        }
        if (!"Hello...".equals(abbr("Hello World", 8))) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(abbrTest());
        System.out.println(abbr("IgorKlimenko", 4)); //сокращает строку до 4 символов
    }
}
