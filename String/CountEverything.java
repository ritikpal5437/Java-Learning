package String;
import java.util.Scanner;
public class CountEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        int alphabet=0;
        int digit=0;
        int special=0;
        int spaces = 0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if ((ch>='a'&&ch<='z')|| (ch>='A'&& ch<='Z')) {
                alphabet++;
            }
         else if (ch>='0'&&ch<='9') {
                digit++;
            }
         else if (ch== ' '){
             spaces++;}
         else {
                special++;
            }

        }
        System.out.println("Number of alphabet characters: "+alphabet);
        System.out.println("Number of digits: "+digit);
        System.out.println("Number of spaces: "+spaces);
        System.out.println("Number of special characters: "+special);


    }

    }

