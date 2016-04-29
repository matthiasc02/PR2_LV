package recursion.campus02.uebung;

public class RecursiveAddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(3,5));
		System.out.println(add1(3,5));
		
		System.out.println(mul(3,0));
		System.out.println(mul(3,1));
		System.out.println(mul(3,2));
		System.out.println(mul(3,3));

	}
	
	public static int add (int a, int b)
	{
		if(b==0)
		{
			return a+1;
		}
		
		return add(a+1,b-1);
	}
	
	public static int add1 (int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		
		return add(a+1,b-1);
	}
	
	public static int mul(int x,int y){
		
		if(x==0||y==0){
			return 0;
		}
		if(y==1){
			return x;
		}
		
		return add(x,mul(x,y-1));
			
	}
	
	

}
