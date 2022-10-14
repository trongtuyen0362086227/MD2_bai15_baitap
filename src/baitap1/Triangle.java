package baitap1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap canh dau tien cua tam giac");
            float canh1 = Float.parseFloat(scanner.nextLine());
            System.out.println("nhap canh thu 2 cua tam giac");
            float canh2 = Float.parseFloat(scanner.nextLine());
            System.out.println("nhap canh thu 3 cua tam giac");
            float canh3 = Float.parseFloat(scanner.nextLine());
            if (canh1+canh2<=canh3||canh2+canh3>=canh1||canh1+canh3>=canh2) {
                throw new IllegalTriangleException("Day khong phai 3 canh tam giac");
            } else {
                System.out.println("Day la 3 canh tam giac");
            }
        } catch (NumberFormatException ex){
                throw new IllegalTriangleException("Day khong phai 3 canh tam giac");
            }
        }
    }
