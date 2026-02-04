import java.util.Scanner;

public class test {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("กรอกตัวเลข: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("เป็นเลขคู่");
        } else {
            System.out.println("เป็นเลขคี่");
        }
    }
}

