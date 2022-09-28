import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n vao");
        int number = scanner.nextInt();
        boolean check = false;
        if (number >= 2) {
            System.out.printf("cac so nguyen to nh hon %d la : ", number);
            System.out.printf("\n");
            for (int i = 2; i < number; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    System.out.printf("%d\t", i);
                }
            }

        }
    }
}
