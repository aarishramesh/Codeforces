package div2.round456;
import java.util.Scanner;

/**
 * Grisha needs to obtain some yellow, green and blue balls. 
 * 
 * It's known that to produce a yellow ball one needs two yellow crystals, green — one yellow and one blue, and for a blue ball, three blue crystals are enough.
	Right now there are A yellow and B blue crystals in Grisha's disposal. 
	Find out how many additional crystals he should acquire in order to produce the required number of balls.
 * 
 * @author aarishramesh
 *
 */
public class TrickyAlchemy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String availableCrystals =  sc.nextLine();
		long yellowCrystals = Long.parseLong(availableCrystals.split(" ")[0]);
		long blueCrystals = Long.parseLong(availableCrystals.split(" ")[1]);

		String reqBalls = sc.nextLine();
		long yellowBalls = Long.parseLong(reqBalls.split(" ")[0]);
		long greenBalls = Long.parseLong(reqBalls.split(" ")[1]);
		long blueBalls = Long.parseLong(reqBalls.split(" ")[2]);

		long yellowCrystalsReq =  yellowBalls * 2 + greenBalls;
		long blueCrystalsReq = blueBalls * 3 + greenBalls;
		
		long yellowCrysNeeded = yellowCrystalsReq - yellowCrystals;
		long blueCrysNeeded = blueCrystalsReq - blueCrystals;
		
		if (yellowCrysNeeded >= 0 || blueCrysNeeded >= 0) {
			if (yellowCrysNeeded >= 0 && blueCrysNeeded >= 0) {
				System.out.println(yellowCrysNeeded + blueCrysNeeded);
			} else if (yellowCrysNeeded >= 0) {
				System.out.println(yellowCrysNeeded);
			} else if (blueCrysNeeded >= 0) {
				System.out.println(blueCrysNeeded);
			}
		} else {
			System.out.println(0);
		}
	}
}
