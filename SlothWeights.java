import java.util.Scanner;
public class SlothWeights {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int risk = 0;
		double riskAvg = 0;
		int noRisk = 0;
		double noRiskAvg = 0;
		int more = 1;
		double weight;
		while (more == 1) {
			System.out.println("\nEnter weight in lbs of this sloth:");
			weight = input.nextDouble();
			while (weight <= 0) {
				System.out.println("*** ERROR *** A sloth can't weigh that much!");
				System.out.println("\nEnter weight in lbs of this sloth:");
				weight = input.nextDouble();
			}
			if (weight <= 3) {
				risk++;
				riskAvg = riskAvg + weight;
			} else {
				noRisk++;
				noRiskAvg = noRiskAvg + weight;
			}
			System.out.println("\nEnter more sloth data? (1 = yes)");
			more = input.nextInt();
		}	
		
		riskAvg = riskAvg / risk;
		noRiskAvg = noRiskAvg / noRisk;
		System.out.println("\nNumber of at-risk sloths: " + risk);
		if (risk == 0) 
			System.out.println("Average at-risk weight (lbs): N/A");
		else
			System.out.println("Average at-risk weight (lbs): " + riskAvg);
		if (noRisk == 0) 
			System.out.println("Average not-at-risk weight (lbs): N/A");
		else
			System.out.println("Average not-at-risk weight (lbs): " + noRiskAvg);
	}

}
