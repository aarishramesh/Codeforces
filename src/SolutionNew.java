import java.util.Scanner;

public class SolutionNew {

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
