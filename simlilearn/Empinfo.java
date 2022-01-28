package simlilearn;

class Empinfo 
{
	double width;
	double height;
	double depth;
	Empinfo ()
	{
		System.out.println("Constructor without parameters");
		width=15;
		height=20;
		depth=15;
	}
	Empinfo(int a, int b, int c){
		System.out.println("Constructor with parameters");
		width = a;
		height = b;
		depth = c;
	}
	double volume()
	{
		return width * height * depth;
		
	}
}

	class ConstructorDemo
	{
	public static  void main(String[] args) 
	{
		Empinfo cub1 = new Empinfo();
		double vol;
		vol = cub1.volume();
		System.out.println("Volume is"+ vol);
		Empinfo cub2 = new Empinfo(8,11,9);
		vol= cub2.volume();
		System.out.println("Volume is"+ vol);

	}
}

