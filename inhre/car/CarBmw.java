package com.inhre.car;
import java.util.*;
public class CarBmw {
	public void getBMW() {
		System.out.println("press 1 for X5\n Press 2 for X6");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
				switch(ch) {
		case 1:
			X5 bm = new X5();
			bm.getX5info();
			break;
		case 2 : 
			X6 bm1 = new X6();
			bm1.getX6info();
			break;
		default :
				System.out.println("Invalid option");
		}
	}

}
