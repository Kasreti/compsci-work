public class danya {
    
    public static void main (String[] args) {
        //output name
        IBIO.output("kujo and drbaba"); 
        //define variable outside loop
        int n = 0;
        //input variable while loop
        do
        {
        do
        {n = IBIO.inputInt("Calculate up to term (n)? "); 
            //if number is invalid, send error
            if (n<0)
            IBIO.output("Error- enter a positive number.");
            //loop until valid number is entered
        } while (n < 0);
        
        long f = 0;
        long s = 0;
        long t = 1;
        double sum = 0;
        int digits = 0;
        long term = 0;
        // lists first n terms of sequence
        // remember the curly brackets
        if (n<=20)
            for (int i = 0; i < n; i++)
            {
                sum = sum + t;
                IBIO.out(t);
                f = s;
                s = t;
                if (i < (n-1)){
					IBIO.out("; ");
					t = f + s;
				}
                
            }
        else if (n>20)
        {
            for (int i = 0; i < n; i++)
            {
                sum = sum + t;
                f = s;
                s = t;
                t = f + s;
            }
            t = t-f;
            IBIO.out("Term" + n + ": " + t);
        }
        term = t;
        sum = sum / n;
        IBIO.output("");
        IBIO.output("avg = " + sum);
        do{
			digits++;
			term = term/10;
		} while (term>0);
		IBIO.output(t + " has: " + digits + " digits");
        }
        while (n!=0);
    }
}
