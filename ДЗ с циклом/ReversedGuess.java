/*
 * ReversedGuess.java..java
 * 
 * Copyright 2021 Евгений <Евгений@DESKTOP-QEDPRK8>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class ReversedGuess {
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int secret=1+random.nextInt(100);
		for(int i=1;i<11; i++){
			System.out.println(" conceived number -");
			int d = in.nextInt();
			if (d == secret) {
				System.out.println(" you guessed it, the planned number -" + d);
				System.out.println(" try -" + i);
				break;
				}
			else 
			{
			    if ( d > secret ) {
					System.out.println(" too many");}
				else {
					System.out.println(" too little");}
			System.out.println("   you guessed wrong, you have the next try");
}
}
}
	
	}


