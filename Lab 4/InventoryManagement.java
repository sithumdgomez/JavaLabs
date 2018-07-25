import java.util.Scanner;
class EconOrd{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);	
		System.out.println("Enter the Demanding Rate");
		double dr = s.nextDouble();
		System.out.println("Enter the Setup Cost");
		double sc = s.nextDouble();
		System.out.println("Enter the Holding Cost");
		double hc = s.nextDouble();

		double EOQ = CalcEOQ(dr,sc,hc); // passing values to EOQ function
		System.out.println("EOQ is "+ Math.round(EOQ*1000d)/1000d);

		double TBO = CalcTBO(sc,dr,hc); // passing values to TBO function
		System.out.println("TBO is "+ Math.round(TBO*1000d)/1000d);		

	}

	static double CalcEOQ(double dr, double sc, double hc){
][

		double EOQ = Math.sqrt((2 * dr * sc) / hc);
		return EOQ;
	}
	
	static double CalcTBO(double sc, double dr, double hc){

		double TBO = Math.sqrt((2 * sc) / (dr * hc));
		return TBO;
	}
}