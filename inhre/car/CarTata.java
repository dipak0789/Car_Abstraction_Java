package com.inhre.car;
import java.util.*;
public class CarTata extends Car {
public void getTata() {
	System.out.println("Press 1 for altroz/nPress 2 for safari");
		Scanner sc = new Scanner (System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Altroz ta = new Altroz();
			ta.getAltrozinfo();
			break;
		case 2 :
			Safari sf = new Safari();
			sf.getSafariinfo();
			break;
		default :
				System.out.println("Invalid option");
		}
	}
}
