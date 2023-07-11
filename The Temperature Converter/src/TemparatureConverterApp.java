import java.util.Scanner;
public class TemparatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
		
		// TODO Auto-generated method stub

	}

}
