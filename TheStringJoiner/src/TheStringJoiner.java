import java.util.Scanner;
public class TheStringJoiner {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str1=scan.next();
	String str2=scan.next();
	String res=joinStrings(str1,str2);
	System.out.println(res);
		// TODO Auto-generated method stub

	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}

}
