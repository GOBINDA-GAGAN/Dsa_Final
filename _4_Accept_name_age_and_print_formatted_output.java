import java.util.Scanner;

public class _4_Accept_name_age_and_print_formatted_output {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = sc.nextLine();
        System.out.print("enter your age:");
        int age = sc.nextInt();
        System.out.print("enter your rollnumber:");
        String rollnumber = sc.next();
        System.out.println("name:" + name + " " + "age:" + age + " " + "rollnumber:" + rollnumber);
    }

}