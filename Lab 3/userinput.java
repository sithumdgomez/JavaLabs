class UserInput
{
	public static void main(String[] args)
	{ 
		String name = args[0];
		int num = Integer.parseInt(args[1]);
		int square = num * num;
		System.out.println("Your name is: "+name);
		System.out.println("Square of the number input is "+square);
		System.out.println("Square root of the number input is "+Math.sqrt(num));
		
	}

}