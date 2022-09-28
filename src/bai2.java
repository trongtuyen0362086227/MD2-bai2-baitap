import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = 0;
        int number=2;
        System.out.println("nhap so luong so nguyen to can in ra");
        num = scanner.nextInt();
        while (count<=num){
            boolean check = true;
            for (int i =2; i < number; i++) {
                if (number%i==0){
                    check = false;
                }
            }
            if (check){
                System.out.printf("%d\t",number);
                count++;
            }
            number++;
        }
    }
}
