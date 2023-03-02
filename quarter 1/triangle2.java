public class triangle2 {
	public static void main (String[] args) {
		IBIO.output("Chegwin");
		int n = 0;
		int ans = 0;
		int ans2 = 0;
		double sum = 0;
		int digits = 0;
		do{
			n = IBIO.inputInt("Calculate up to term (n)? ");
			if(n<1){
				IBIO.output("Error- enter a positive number.");
			}
		}while (n<0);
		if(n>20){
			for(int i = 1; i <= n ; i++){
				ans = ans + i;
				sum = sum + ans;
			}
			IBIO.out("Term " + n + ": " + ans);
		} else if (n<=20){
			for(int i = 1; i <= n ; i++){
				ans = ans + i;
				sum = sum + ans;
				IBIO.out(ans);
				if(i<n){
					IBIO.out(", ");
				}
			}
		}
		IBIO.output("\n\nAverage = " + sum/n);
		ans2 = ans;
		for(digits = 0; ans2 > 0; digits++){
			ans2 = ans2/10;
		}
		IBIO.output("\n" + ans + " has " + digits + " digits");
	}
}

