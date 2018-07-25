class Area
{
	static final double PI = Math.PI;

	public static void main(String[] args)
	{
		String name = args[0];
		int r = Integer.parseInt(args[1]);

		double area = PI * r * r;
		System.out.println("Your name is "+name);
		System.out.println("Area of the circle is "+area);
		System.out.println("Area of the circle (rounded up) is "+Math.round(area));
	}
}