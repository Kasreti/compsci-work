public class Laptop extends Computer{

	private double batteryCapacity;
	
	public Laptop(String name, String CPU, int primaryMemory, int secondaryMemory, double battery){
		super(name, CPU, primaryMemory, secondaryMemory);
		this.batteryCapacity = battery;
	}
	
	public void setBattery(double b){
		this.batteryCapacity = b;
	}
	
	public double getBattery(){
		return this.batteryCapacity;
	}
	
	public double calculateVirtualMemory(){
		return 1.2 * this.getPrimaryMemory();
	}
	
	public String toString()
	{
		String output = "Computer name: " + this.getName();
		output = output + "\nCPU: " + this.getCPU();
		output = output + "\nRAM in GB: " + this.getPrimaryMemory();
		output = output + "\nSSD in GB: " + this.getSecondaryMemory();
		output = output + "\nVirtual Memory in GB: " + this.calculateVirtualMemory();
		output = output + "\nBattery: " + this.batteryCapacity;
		return output;
	}
	
}
