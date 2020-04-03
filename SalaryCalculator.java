package demos;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		// annual salaru : " Hours in week" weeks in year
		// defainr verubles
		double hourlyRate = 37;
		double  hoursInWeek = 40;
		int vacationWeeks = 3;
		int workingYear = 52;
		// colculete
		
		int  workingWeeks =  workingYear - vacationWeeks;
		
		 
		double annualIncome = hourlyRate * hoursInWeek * workingWeeks
				;
		System.out.println("$"+ annualIncome );
		
	}

}
