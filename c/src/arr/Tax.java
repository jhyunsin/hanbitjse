/**
 * 
 */
package arr;

/**
 * @date : 2016. 6. 14.
 * @author : hb2009
 * @file : Tax.java
 * @story :
 */
public class Tax {
	public String tax(String outname, int outsal) {

		String name;
		int sal;
		int money;
		double taxRate = 0.097;

		name = outname;

		sal = outsal;
		money = (int) (sal * taxRate);
		return"연봉을" + sal + "만원 받으시는" + name + "님께서 납부할 세금은" + money + "입니다";
	

	}
}
