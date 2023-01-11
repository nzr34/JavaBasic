package Class_6_Switch_Case_statements;
import java.util.Scanner;
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String country=scanner.next();
        // System.out.println(country.toLowerCase());
//11:47
        switch (country.toLowerCase()){ // converts the text to lowercase USA=>usa
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanishtan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}