import java.util.Scanner;
public class cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cub s1=new cub();
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height rib of cube");
        int a = scan.nextInt();
        s1.a=a;
		double Yourss = s1.calccube();
		System.out.println(" Your cube is " + Yourss);
		
		
		}
	}


