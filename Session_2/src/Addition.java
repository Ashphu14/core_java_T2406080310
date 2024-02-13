
public class Addition {
   //method overloading
	public int add(int a, int b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
		
	}
	public float add(float a, float b, float c) {
		return a+b+c;
	
    }
	public int add(int... a)//
	{
		int sum =0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
	
	
	
	
	
	public static void main (String args[]) {
		Addition a = new Addition();
		System.out.println("with 2 parameters of int:"+a.add(1, 2));
		System.out.println("with 2 parameters of float:"+a.add(1.5f,2.5f));
		System.out.println("with 3 parameters of int:"+a.add(1, 2,3));
		System.out.println("with multiple parameters of int:"+a.add(1, 2,3 , 4, 5, 6, 7));
	}
}

	