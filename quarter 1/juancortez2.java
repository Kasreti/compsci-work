public class juancortez2 {
	
	public static void main (String[] args) {
		IBIO.output("Chegwin");
		int n = 0;
		int power = 1;
		int pc = 0;
		int power2 = 0;
		int digits = 0;
		do{
			n = IBIO.inputInt("Enter a number: ");
			if(n>9){
				IBIO.output("Error please enter again");
			} else if (n<1){
				IBIO.output("Error please enter again. Program ended");
				System.exit(1);
			}
		}while(n>9);
		for(int i=1;i<=n;i++){
			IBIO.out(i);
			if(i*i>=10){
				IBIO.out(" " + i*i);
			}else if(i*i<10){
				IBIO.out("  " + i*i);
			}
			
			do{
				power = power * n;
				pc++;
			} while (pc < i);
			power2 = power;
			digits = 0;
			do{
				power2 = power2/10;
				digits++;
			}while(power2>0);
			digits = 10-digits;
			for(int c=0;c<digits;c++){
				IBIO.out(" ");
			}
			IBIO.output(power);
		}
	}
}

