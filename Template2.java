/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

import java.lang.Math;
public class Template2{
	public static void main(String args[]){
		String num = IBIO.input("enter a binary number: ");
		char[] binary = num.toCharArray();
		double res = convert(binary);
		System.out.println(num + " in denary is " + (int)res);
	}
	static double convert(char a[]){
		double sum = 0;
		int j;
		for(int i = a.length-1; i >= 0; i--){
			j = a[i]-48;
			sum = sum + (j * Math.pow(2,a.length -1 - i));
		}
		return sum;
	}
}

	



/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/

