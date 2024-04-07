import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static String calc(String input)
    {
        String answer = null;
        String[] words = input.split(" ");
        int a, b;
        char operator;
        a = Integer.parseInt(words[0]);
        operator = words[1].charAt(0);
        b = Integer.parseInt(words[2]);



        if(1 <= a && 10 >= a && 1 <= b && 10 >= b)
        {
            if(words.length > 3){
                return answer = "Error";
            }


            switch(operator)
            {
                case '+':
                    answer = String.valueOf(a + b);
                    break;
                case '-':
                    answer = String.valueOf(a - b);
                    break;
                case '/':
                    answer = String.valueOf(a / b);
                    break;
                case '*':
                    answer = String.valueOf(a * b);
                    break;
                default:
                    answer = "Operator not found";
            }
        }else
        {
            answer = "Incorrect value";
        }



        return answer;
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(calc(input));


    }
}