class Rounding{
	public static void main(String[] args){

		double d = 3.1545454;
		double rounded = Math.round(d * 1000d) /1000d; /*in order to round the double to 3 decimal places you
		multiply it by 1000 and devide it by 1000 - number of decimal places you need = number of 0's */

		System.out.println("Answer is "+ rounded);
	}
}