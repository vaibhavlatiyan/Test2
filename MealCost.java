
public class MealCost {
	
	public static void main (String []args) {
		double mealPrice = 50;
		int tipPercent = 20;
		int taxPercent = 15;
		double totalMealCost;
		totalMealCost = mealPrice + ((mealPrice*tipPercent)/100) + ((mealPrice*taxPercent)/100);
		System.out.println("Total Meal Cost = " +totalMealCost);
		
	}
	
}
