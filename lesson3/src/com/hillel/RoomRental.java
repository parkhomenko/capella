package com.hillel;

public class RoomRental {
    
    public static void main(String... args) {
        
        int days = Integer.parseInt(args[0]);
        int price = Integer.parseInt(args[1]);
        
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