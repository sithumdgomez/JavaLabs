class ParsingStrings
{
	public static void main(String[]args)
	{
		
		String str1 = "-12345";		
		String str2 = "756.83";

		int intNum;
		float floatNum;
		double decimalNum;

		intNum = Integer.parseInt(str1);
		floatNum = Float.parseFloat(str2);
		decimalNum = Double.parseDouble(str2);
		
	}
}