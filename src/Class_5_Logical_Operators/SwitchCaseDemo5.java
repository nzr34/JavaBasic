package Class_5_Logical_Operators;


import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender  m f");
        char gender=scanner.next().charAt(0);

        switch (gender){

            case 'f':
                System.out.println("Female");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
                System.out.println("Male");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
/*switch (gender){

            case 'f':
                System.out.println("Female");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'm'://we dont have to make break if we need lower and upper sensivity..
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }*/
    }
}