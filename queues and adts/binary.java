public class binary {
	
	public static void main (String[] args) {
		int denary = IBIO.inputInt("enter your denary number: ");
		System.out.println(convertbinary(denary));
	}
	
	public static String convertbinary(int denary){
		Stack s = new Stack();
		String result = "";
		do{
			s.push(denary%2);
			denary = denary/2;
		} while (denary!=0);
		do{
			result = result + s.pop();
		} while (!s.isEmpty());
		return result;
	}
}

