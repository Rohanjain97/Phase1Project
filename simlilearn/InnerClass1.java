package simlilearn;

class Cpu 
{
	double price;
	class Processor
	{
		double cores;
		String manufacturer;

		double getCache(){
			return 4.3;
		}
	}
	protected class Ram
	{
		double memory;
		String manufacturer;
		double getClockSpeed(){
			return 5.5;
		}
	}
}
public class InnerClass1{

	public static void main(String[] args) 
	{
		Cpu c=new Cpu();

		Cpu.Processor p=c.new Processor();
		Cpu.Ram ram=c.new Ram();
		System.out.println("processor cache ="+p.getCache());
		System.out.println("Ram Clock Speed ="+ram.getClockSpeed());

	}
}