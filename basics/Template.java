/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Template{
    public static void main(String[] args){
		double max = 0;
		double min = 0;
		double times = 1;
		double n = 1;
        do{
			n = IBIO.inputDouble("enter a number. enter 0 to exit the programme. ");
			if(times==1){
				max = n;
				min = n;
			}
			if(n==0){
				break;
			}
			if (n>max){
				max = n;
			} else if (n<min){
				min = n;
			}
			times++;
		}while(n!=0);
		System.out.println("\n================================\nThe maximum value is " + max + "\nThe minimum value is " + min + "\nThe range is " + (max-min) + "\n================================");
				
    }
}
