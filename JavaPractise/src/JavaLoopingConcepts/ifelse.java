package JavaLoopingConcepts;

public class ifelse {

	public static void main(String[] args) {
		
		ifelse obj = new ifelse();
		
		int a =10;
		int b = 20;
		
		if(a<b){
			System.out.println("The value of b is greater than a");
		} else{
			System.out.println("The value of a is less than b");
		}
		
		obj.addSum(10,20);

	}
	
	
	public  int addSum(int a, int b){
		int c = a+b;
		System.out.println("The value of c is : "+ c);
		return c;
	}

}
