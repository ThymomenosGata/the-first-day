import java.util.Scanner;

public class learning {
	public static void writeUntil(){
		String sym="";
		Scanner scanner = new Scanner(System.in);
		do{
			sym = scanner.nextLine();
			System.out.println(sym);
		}while(!sym.equals("."));
	}
	public static void main(String[] args) {
		writeUntil();
	}
}
