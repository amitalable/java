/* 
 * In DOS, current date is stored in encoded form to reduce the space. Date is encoded in a single
 * integer number. The binary form of the number can be divided to decode the date
 * parameters.
 * Date is a sequence of 23 bits. First 14-bits for year, next 4-bits for month and finally 5 bits
 * for date.
 * e.g., 12 February 1990 can be encoded as -
 * 1990 02 12 ---> (11111000110 0010 01100) Binary Form
 * ---> (1018956) Decimal Form
 * Your task is simple. You only will have to decode date from the given decimal encoded form.
 * Score is source length.
 * Input
 * The input consists of N cases (equal to about 1000). The first line of the input contains only
 * positive integer N. Then follow the cases. Each case consists of exactly one line with one
 * positive integer X. This integer X is the encoded form which is to be decoded.
 * 1<=N<=1000
 * X will fit in Integer(C Int) range.

 * Output
 * Output consist of exactly N lines of decoded form.
 * Example:
 * Input
 * 5
 * 1024275
 * 1029012
 * 1017036
 * 903863
 * 802507
 * Output
 * 19 August 2000
 * 20 December 2009
 * 12 June 1986
 * 23 May 1765
 * 11 June 1567
 * 
 * Copyright Code: Amit Ranjan
 * Used only for Educational purpose only.
 */
 
public class Bina 
{
	enum Month
	{
		January,February,March,April,May,June,July,August,September,October,November,December
	}
	public static void main(String[] args)
	{
		int a = 1018956;
		String b = Integer.toBinaryString(a);
		
		int c = b.length();
		String year ="";
		String month ="";
		String day ="";
		
		for(int i =0;i<c;i++)
		{
			if(i<11)
			{
				year+= b.charAt(i);
			}
			else if(i>=11 && i<15)
			{
				month+=b.charAt(i);
			}
			else
			{
				day+= b.charAt(i);
			}
		}
		System.out.print(Integer.parseInt(day,2)+" ");
		//Month[] mon= Month.values();
		System.out.print(Month.values()[Integer.parseInt(month, 2) - 1]+" ");
		System.out.print(Long.parseLong(year,2)+" ");

	}
}
