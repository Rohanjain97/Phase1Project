package simlilearn;

public class MethodExecution {
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);}

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}


public static void main(String[] args) {

	MethodExecution b=new MethodExecution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	
	MethodExecution d = new MethodExecution();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);

	}




}

