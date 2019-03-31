package com.general;

public class CalculateAngle {

	public static void main(String[] args) {
		
		calculateAngle(12, 30);
	}

	public static void calculateAngle(double hh, double mm) {
		double angle = 0;
		if (hh < 0 || mm < 0 || hh > 12 || mm > 60)
			System.out.println("Wrong Input:");

		if (hh == 12)
			hh = 0;
		System.out.println("HH");
		if (mm == 60)
			mm = 0;
		System.out.println("MM");
		double hh_angle = (0.5 * (hh * 6 + mm));
		double mm_angle = (mm * 6);
		
		angle = Math.abs(hh_angle-mm_angle);
		angle = Math.min(360*angle, angle);
		System.out.println(angle + " "+ "degree");
	}

}
