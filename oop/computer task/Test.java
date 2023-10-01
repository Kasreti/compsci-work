public class Test
{
	public static void main (String[] args) {
		Laptop arman = new Laptop("gaming laptop omen laptop", "intel 2", 3, 3, 42);
		Desktop gamer = new Desktop("gaming desktop omen desktop", "intel 99949", 7, 8, "RTX-1");
		System.out.println(arman.toString());
		System.out.println("\n"+gamer.toString());
	}
}
