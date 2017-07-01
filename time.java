import java.util.Scanner;

public class time {
	public static void main(String[] argv){
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int hours = days*24;
		int minutes = hours*60;
		int seconds = minutes*60;
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
	}
}
