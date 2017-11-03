package com.hillel;

import java.util.Scanner;

public class RoomRentalNoParams {
    
    public static void main(String... args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество дней: ");
        int days = scanner.nextInt();
        
        System.out.print("Введите цену: ");
        int price = scanner.nextInt();
        
        int totalPrice = days * price;
        
        if (days > 5 && days <= 7) {
            totalPrice -= 20;
        }
            
        if (days > 7) {
            totalPrice -= 50;
        }
        
        System.out.println(totalPrice);
    }
}