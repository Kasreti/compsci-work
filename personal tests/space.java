import java.lang.Math;
public class space {
	
	public static void main(String[] args) { 
		int width = IBIO.inputInt("enter a number ");
		String stars = "";
		for(int i = 1; i <= width; i++){
			stars = "";
			System.out.println(spacing(stars, i, width));				
		}
		for(int i = 0; i < 3; i++){
			System.out.println(stem(width));
		}
	}
	
	static String spacing(String input, int leaves, int max){
		for(int i = 1; i <= (max-leaves); i++){
			input = " " + input;
		}
		leaves = leaves + (leaves-1);
		for(int i = 0; i < leaves; i++){
			input = input + "*";
		}
		return input;
	}
	
	static String stem(int max){
		String input = "";
		for(int i = 1; i <= (max-1); i++){
			input =  " " + input;
		}
		input = input + "*";
		return input;
	}
}

