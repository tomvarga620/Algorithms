import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Position");
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();
        System.out.println(position);

        String pattern = "([A-H|a-h][1-8]|[1-8][A-H|a-h])";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(position);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0));
        }
        else
        {
            System.out.println("Error");
        }

    }
}
