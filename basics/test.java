public class test {
	
	public static void main (String[] args) {
		IBIO.output("Chegwin");
		int n = 0;
		do{
			do{
				n = IBIO.inputInt("Enter an integer between 1 and 9: ");
				if(n<0){
					IBIO.output("Error- number out of range.");
				} else if(n>9){
					IBIO.output("Error- number out of range");
				} else if(n==0){
					System.exit(1);
				}
			} while (n>9 || n<1);
			for(int c=1;c<=n;c++){
				for(int i=1;i<=20;i++){
					IBIO.out(c + " x");
					if(i<10){
						IBIO.out("  " + i + " = ");
					}else if(i>9){
						IBIO.out(" " + i + " = ");
					}
					if(c*i>=100){
						IBIO.output(c*i);
					} else if (c*i>=10){
						IBIO.output(" " + c*i);
					} else if (c*i<10){
						IBIO.output("  " + c*i);
					}	
				}
				IBIO.output("------------");
			}
		}while(n!=0);	
	}
}
