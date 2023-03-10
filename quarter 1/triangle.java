public class triangle {
	
	public static void main (String[] args) {
	IBIO.output("Chegwin");
	int n = 0;
	do{
	n = 0;
	int sum = 0;
	int digits = 0;
	float average = 0;
	int ans2 = 0;
	do{
		n = IBIO.inputInt("Calculate up to term (n)? ");
		if (n<0){
			IBIO.output("Error- enter a positive number.");
		}
	} while (n<0);
	if (n==0){
		break;
	}
	int ans = 0;
	if (n>20){
		for(int i=1 ; i <= n; i++){
			ans = ans + i;
			sum = sum + ans;
		}
		IBIO.output("Term " + n + ": " + ans);
	}else{
		for(int i=1 ; i <= n; i++){
			ans = ans + i;
			sum = sum + ans;
			IBIO.out(ans);
			if (i<n){
				IBIO.out(", ");
			}
		}
		IBIO.output("");
	}
	average = sum/n;
	IBIO.output("\nAverage = " + average);
	ans2 = ans;
	do{
		digits++;
		ans2 = ans2/10;
	}while (ans2>0);
	IBIO.output("\n" + ans + " has " + digits + " digits");
}while(n!=0);
}
}
