import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("*********Menu**********");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left,\n" +
                    "top-right, botton-left, botton-right)\n");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 5; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int height;
                    System.out.println("nhap chieu cao tam giac can vao");
                    height = scanner.nextInt();
                    int k = 0;
                    for (int i = 1; i <= height; ++i, k = 0) {
                        for (int j = 1; j <= height - i; ++j) {
                            System.out.print(" ");
                        }
                        while (k != 2*i -1){
                            System.out.print("*");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }

    }
}
