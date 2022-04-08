import java.util.Scanner;

public class Programme1 {

    public static void readTenNumbersAndSum() {
        //Scanner declaration for reading input form console
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = s.hasNextInt();
            if (isAnInt) {
                int number = s.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            s.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        // closing the scanner object
        s.close();
    }

    public static void main(String[] args) {
        readTenNumbersAndSum();
    }

}
