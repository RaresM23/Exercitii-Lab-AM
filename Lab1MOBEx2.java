import java.util.Scanner;

public class Lab1MOBEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = sum / n;

        System.out.println("The average value of the array elements is: " + average);

        scanner.close();
    }
}
