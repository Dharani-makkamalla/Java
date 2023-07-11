import java.util.Scanner;
public class MessseagDecoderApp {

	public static void main(String[] args) {
	
				Scanner scan=new Scanner(System.in);
				 System.out.println("enter a characte");
				 char ch=scan.next().charAt(0);
				 
				 MessageDecoder decoder = new MessageDecoder();

				System.out.println( decoder.decodeCharacter(ch));
				// TODO Auto-generated method stub

			}

		}
