/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class juancortez{
	public static void main(String[] args){
		IBIO.output("Chegwin");
		int n = 0;
		do{
			n = IBIO.inputInt("Enter a number: ");	
			if(n<0){
				IBIO.output("Error please enter again");
			} else if (n>9){
				IBIO.output("Error please enter again");
			} else if (n==0){
				System.exit(1);
			}
		}while(n<=0 || n>10);	
		for(int i=1;i<=n;i++){
			int power = 1;
			int power2 = 0;
			int pcount = 0;
			int digit = 0;
			//number
			IBIO.out(i);
			if((i*i)<10){
				IBIO.out("  "+(i*i));
			}else{
				IBIO.out(" "+(i*i));
			}
			//square
			do{
				power = power * n;
				pcount++;
			}while(pcount<=(i-1));
			//power
			power2 = power;
			do{
				digit++;
				power2 = power2/10;
			} while (power2>0);
			digit = 10-digit;
			for(int c = 0; c<digit; c++){
				IBIO.out(" ");
			}
			IBIO.output(power);
		}
	}
}
	



/*

OUTPUT OF YOUR PROGRAM (copy & paste from Terminal/Command prompt)

*/
