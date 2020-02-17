package com.aiub.lab;

public class Mountainbike extends Bicycle {
		int seatheight;

		public Mountainbike(int seatheight) {
			super();
			this.seatheight = seatheight;
		}
		public void show()
		{
			System.out.println( gear+" : "+speed+":"+seatheight);
		}
}
