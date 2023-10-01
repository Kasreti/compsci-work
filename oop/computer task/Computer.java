public abstract class Computer
{

	private String name;
	private int primaryMemory;		// in GB
	private int secondaryMemory;	// in GB
	private String CPU;

	public Computer(String name, String CPU, int primaryMemory, int secondaryMemory)
	{
		this.name = name;
		this.primaryMemory   = primaryMemory;
		this.secondaryMemory = secondaryMemory;
		this.CPU = CPU;
	}

	public String getName()
	{
		return this.name;
	}

	public int getPrimaryMemory()
	{
		return this.primaryMemory;
	}

	public int getSecondaryMemory()
	{
		return this.secondaryMemory;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPrimaryMemory(int primaryMemory)
	{
		this.primaryMemory = primaryMemory;
	}

	public void setSecondaryMemory(int secondaryMemory) {
		this.secondaryMemory = secondaryMemory;
	}

	public double getVirtualMemory() {
		return this.primaryMemory * 1.5;
	}
	
	public void setCPU(String CPU){
		this.CPU = CPU;
	}
	
	public String getCPU(){
		return this.CPU;
	}

	public abstract double calculateVirtualMemory();

	public String toString()
	{
		String output = "Computer name: " + this.name;
		output = output + "\nCPU: " + this.CPU;
		output = output + "\nRAM in GB: " + this.primaryMemory;
		output = output + "\nSSD in GB: " + this.secondaryMemory;
		return output;
	}

}
