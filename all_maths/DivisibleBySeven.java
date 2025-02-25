
package all_maths;
import java.util.*;
public class DivisibleBySeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        if (number % 7 == 0) {
            System.out.println(number + " is divisible by 7.");
        } else {
            System.out.println(number + " is not divisible by 7.");
        }

  }
}