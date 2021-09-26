import java.util.Scanner;
public class ConvertFeetToMeters {
    //write a program that reads a number of feet in, converts to meters,
    //and displays the result. one foot is 0.305 meters
    public static void main(String[] args) {


        //1. read in number of feet
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet:");
        double feet = input.nextDouble();
        //2. convert to meters
        double meters = feet * 0.305;
        //3. display result
        System.out.print(meters + " meters");
    }
}
