class DistanceConverter
{
	public static void main(String[]args)
	{
		
		final float MILESCNT = 1.609f; // this is how we declare a constant value in java
		final float YARDSCNT = 1760.0f; // you have to put a f to convert a double value to a float
		int miles = 26, yards = 385;		
		float km;

		km = miles * MILESCNT +(yards * YARDSCNT) * MILESCNT;
		System.out.println(km);

		
		
	}
}