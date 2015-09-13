import java.util.Scanner; 

public class Main {
	
	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		double a; 
		double b;
		double c; 
		double d; 
		
		Scanner touchDowns = new Scanner(System.in);
		System.out.print("How many touchdowns has the QB made? ");
		double TD = touchDowns.nextDouble();
		
		Scanner totalYards = new Scanner(System.in);
		System.out.print("How many total yards does the QB have? ");
		double YDS = totalYards.nextDouble();
		
		Scanner interceptions = new Scanner(System.in);
		System.out.print("How many interceptions has the QB made? ");
		double INT = interceptions.nextDouble();
		
		Scanner completions = new Scanner(System.in);
		System.out.print("How many completions does the QB have? ");
		double comp = completions.nextDouble();
		
		Scanner passesAttempted = new Scanner(System.in);
		System.out.print("What is the number of attempted passes the QB has made? ");
		double ATT = passesAttempted.nextDouble();
		
		
		a = ((comp/ATT)-0.3)*5;
		b = ((YDS/ATT)-3)*0.25;
		c = (TD/ATT)*20;
		d = 2.375-((INT/ATT)*25);
		
		double PR; 
		PR = ((a+b+c+d)/6)*100;
		
		System.out.println("The QB's passer rating is: "+ PR);
	}
}
