/*
 * q2test.java
 * 
 * Copyright 2022 User <User@KASRETI>
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


public class q2test {
	
	public static void main (String[] args) {
		System.out.println("Chegwin Yeung");
		int hm = 0;
		int max = 0;
		int min = 0;
		int evens = 0;
		double sum = 0;
		double average = 0;
		do{
			hm = IBIO.inputInt("How many numbers to process? ");
			if(hm<3){
				System.out.println("Input Error.");
			}
		} while (hm<3);
		for(int i = 1; i<=hm; i++){
			int n = IBIO.inputInt("Enter number: ");
			if(i==1){
				max = n;
				min = n;
			}
			if(n>max){
				max = n;
			} else if (n<min){
				min = n;
			}
			if((n%2)==0){
				evens++;
			}
			sum = sum + n;
		}
		average = sum/hm;
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Range: " + (max-min));
		System.out.println("Average: " + average);
		System.out.println("Evens: " + evens);
		System.out.println("Odds: " + (hm-evens));
	}
}
