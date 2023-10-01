import java.util.Scanner;
public class Fraction{
private int num;
private int den;

Fraction(int a, int b){
	num = a;
	den = b;
}
public String toString(){
	String ss = num + "/" + den;
	return ss;
}

public void enter(){
	do{
		String strFraction = IBIO.input("Enter fraction (a/b format): ");
		strFraction = strFraction.replace("/", " "); //change slash to space to parse
		Scanner parse = new Scanner(strFraction);
		num = parse.nextInt();
		den = parse.nextInt();
		if(den<=0){
			System.out.println("Please enter a denominator greater than 0!");
		}
	} while(den<=0);
	this.simplify();
}

private static int lcm(int a, int b){
	int c=0;
	for(int i=1; i<=b; i++){
		if(((a*i)%b)==0){
			c=a*i;
			return c;
		}
	}
	return c;
}

private int gcd(){
	int a = this.num;
	int b = this.den;
	int c=0;
	for(int i=1; i<=a; i++){
		if((a%i)==0 && (b%i)==0){
			c = i;
		}
	}
	return c;
}

private void simplify(){
	int gcd = this.gcd();
	this.num = this.num/gcd;
	this.den = this.den/gcd;
}

void print(){
	IBIO.output(num + "/" + den);
}

Fraction add(Fraction b){
	Fraction temp = new Fraction(0,0);
	int lcm = lcm(this.den, b.den);
	temp.num = (this.num * (lcm/this.den)) + (b.num * (lcm/b.den));
	temp.den = lcm;
	return temp;
} 

public double toDecimal(){
	double n = this.num;
	double d = this.den;
	return n/d;
} 

public static void main(String[] args) {
  Fraction a = new Fraction(0,0);
  a.enter();
  a.print();
  double x = a.toDecimal();
  IBIO.output(a + " change to decimal = " + x);
  Fraction b = new Fraction(0,0);
  b.enter();
  Fraction c = new Fraction(0,0);
  c = a.add(b);
  System.out.println(a + " + " + b + " = " + c);    
}

}
