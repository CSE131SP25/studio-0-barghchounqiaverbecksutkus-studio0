package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		int burritosEatenWeek1 = 7;
		int burritosEatenWeek2 = 4;
		int burritosEatenWeek3 = 19; //don't judge me
		int burritosEatenWeek4 = 1;
		
		int totalBurritos = burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4;
		double burritoPrice = 7.50;
		double totalBurritoPrice = totalBurritos * burritoPrice;
		double averageWeeklyBurritoPrice = totalBurritoPrice / 4;
		
		System.out.println("You have spent an average of $" + averageWeeklyBurritoPrice + " per week on burritos.");
	
	}
}
