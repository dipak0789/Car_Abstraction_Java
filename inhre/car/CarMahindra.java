package com.inhre.car;

import java.util.*;

public class CarMahindra {
	public void getMahindra() {
		System.out.println("press 1 for Thar\nPress 2 for XUV");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Thar mh= new Thar();
			mh.getTharinfo();
			break;
		case 2 :
			Xuv mh1 = new Xuv();
			mh1.getXUVinfo();
			break;
		default :
				System.out.println("Invalid option");
		}
	}

}
