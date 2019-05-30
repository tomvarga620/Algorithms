import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hope_bringer on 30.05.2019.
 * My email is gergelysiladi@gmail.com
 */
public class Knight {

    public void Start(){
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();
        System.out.println(position);

        String pattern = "([A-H|a-h][1-8]|[1-8][A-H|a-h])";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(position);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0));
            String s = m.group(0).toString();
            char z1 = s.charAt(0);
            char z2 = s.charAt(1);

            if(Character.isDigit(z1)){
                char temp = z1;
                z1 = z2;
                z2 = temp;
            }

            z1 = Character.toUpperCase(z1);
            int c = Character.getNumericValue(z2);
            System.out.println("C cislo = "+c);
            System.out.println(z1+" "+c);
            jump(z1,c,0);

        }
        else
        {
            System.out.println("Error wrong input");
        }
    }

    public void jump(char z1, int c,int count){
        if(count == 3){
          String text = (z1+" "+c);
          System.out.println(text);
        }
        else
        {
            count++;
            if(z1>='C' && c>1)
                jump((char) (z1-2),c-1,count);
            if(z1>='C' && c<8)
                jump((char) (z1-2),c+1,count);
            if(z1>='B' && c<7)
                jump((char) (z1-1),c+2,count);
            if(z1<='G' && c<7)
                jump((char) (z1+1),c+2,count);
            if(z1<='F' && c<8)
                jump((char) (z1+2),c+1,count);
            if(z1<='F' && c>1)
                jump((char) (z1+2),c-1,count);
            if(z1<='G' && c>2)
                jump((char) (z1+1),c-2,count);
            if(z1>='B' && c>2)
                jump((char) (z1-1),c-2,count);
        }
    }

}
