class RandNum{
	public static void main(String[] args){

		double r = Math.random();
		System.out.printf("Random number (0-1) is %f\n",r);
		
		int num = ((int)(r*10))+1; /* 1 - 10 integer random number (incase the random number you get is 0.00 
		something, thats why you add 1, in order to get numbers between 1 - 10) */

		System.out.printf("Random number (1-10) is %d\n",num);
	}
}
	 
