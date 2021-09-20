package assignments;
import java.util.Scanner;

class Cab {
    int fare;
    int d;

    public Cab() {
        fare = 30;
    }
    
    public Cab(int fare) {
        this.fare = fare;   
        
    }

   
}

public class CabFare {

	public static void main(String[] args) {
		        int cd; 
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the cab distance from user: ");
		        cd = sc.nextInt();

		        if(cd > 5) {
		            Cab ob = new Cab(30 + (cd - 5) * 10); 
		            System.out.print("Enter the distance travelled: ");
		            ob.d = sc.nextInt();

		            ob.fare += 10 * ob.d;

		            System.out.println("Total fare: Rs " + ob.fare);

		            
		        }
		        else {
		            Cab ob = new Cab();
		            System.out.print("Enter the distance travelled: ");
		            ob.d = sc.nextInt();

		            ob.fare += 10 * ob.d;

		            System.out.println("Total fare: Rs " + ob.fare);

		            Cab ob2 = new Cab();
		            System.out.println("Data ob2: " + ob2.fare);
		        }

	}
}
