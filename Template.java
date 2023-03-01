/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Template{
	public static void main(String[] args){
		double result = 0;
		double numer = 1;
		double denom = 1;
		double fraction = 1;
		double numersum = 1;
		double denomsum = 1;
		for (int i = 1; i<=100; i++){
			denom = 1;
			numer = 1;
			numersum = 1;
			denomsum = 1;
			for(int j = 1; j <= i; j++){
				numer = numer + 1;
				numersum = numersum * numer;
			}
			for(int k = 1; k <= i; k++){
				denom = denom + 2;
				denomsum = denomsum * denom;
			}
			fraction = numersum/denomsum;	
			IBIO.output("F " + fraction);
			result = result + fraction;
		}
		result = result + 1;
		IBIO.output("ans: " + result*2);
}
}
	



/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/

