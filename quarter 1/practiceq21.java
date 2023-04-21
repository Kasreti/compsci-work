public class practiceq21 {
	
	static void isEven(int n){
		if((n%2)==0){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	static void isPositive(int n){
		if(n>=0){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	static void abs(int n){
		if(n>=0){
			System.out.println(n);
		} else {
			n = n * -1;
			System.out.println(n);
		}
	}
	
	static void isFactor(int n, int x){
		if((n%x)==0){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	static void countFactors(int n){
		for(int k=1;k<=n;k++){
			if((n%k)==0){
				System.out.print(k);
				if(n!=k){
					System.out.print(", ");
				}
			}
		}
		System.out.println("");
	}
	
	static void isPrime(int n){
		for(int k=2;k<=n;k++){
			if((n%k)==0 && n!=k){
				System.out.println("false");
				break;
			} else if (n==k){
				System.out.println("true");
			}
		}
	}
	
	static void listPrimeFactors(int n){
		for(int k=1; k<=n; k++){
	mainloop : if(n%k==0){
				for(int i=2; i<=k; i++){
					if((k%i)==0 && k!=i){
						 break mainloop;
					} else if (n==i){
						System.out.print(k);
						System.out.print(", ");
					}
				}
				System.out.print(k);
			}
		}
	}
	
	static void lcm(int n){

	}
		
	
	public static void main (String[] args) {
		System.out.println("chegwin");
		isEven(2);
		isPositive(1);
		abs(-6);
		isFactor(12,4);
		countFactors(12);
		isPrime(13);
		listPrimeFactors(12);
	}
}

