public class Desktop extends Computer{

	private String GPU;
	
	public Desktop(String name, String CPU, int primaryMemory, int secondaryMemory, String GPU){
		super(name, CPU, primaryMemory, secondaryMemory);
		this.GPU = GPU;
	}
	
	public Desktop(String name, int primaryMemory, int secondaryMemory, String GPU){
		super(name, primaryMemory, secondaryMemory);
		this.GPU = GPU;
	}
	
	public void setGPU(String gpu){
		this.GPU = gpu;
	}
	
	public String getGPU(){
		return this.GPU;
	}
	
	public double calculateVirtualMemory(){
		return 2.5 * this.getPrimaryMemory();
	}
	
	public String toString()
	{
		String output = "Computer name: " + this.getName();
		output = output + "\nCPU: " + this.getCPU();
		output = output + "\nRAM in GB: " + this.getPrimaryMemory();
		output = output + "\nSSD in GB: " + this.getSecondaryMemory();
		output = output + "\nVirtual Memory in GB: " + this.calculateVirtualMemory();
		output = output + "\nGPU: " + this.getGPU();
		return output;
	}
	
}
