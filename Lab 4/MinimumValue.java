class MinVal{
	public static void main(String[] args){

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int min = num1 > num2 ? num2 : num1;

		System.out.println("Minimum value is "+ min);
	}
}