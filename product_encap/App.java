package com.product_encap;
import java.util.*;

public class App {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for Product details\nPress 2 for Billing details");

            switch (sc.nextInt()) {
                case 1:
                    Set_Shop.product();
                    break;
                case 2:
                    Set_Billings.billings();
                    break;
            }
        }
    }
}
