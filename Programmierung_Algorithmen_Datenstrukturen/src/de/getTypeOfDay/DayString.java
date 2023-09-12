package de.getTypeOfDay;

public class DayString {
	
	
	public static String getTypeOfDay(String day)
	{
		String typeOfDay;
		
		String dayOfWeek = day;
		
		String daylower = dayOfWeek.toLowerCase();
		

		switch (daylower)
		{
			case "monday": typeOfDay = "Start of work week";
				break;
			case "tuesday":
			case "wednesday":
			case "thursday": typeOfDay = "Midweek";
				break;
			case "friday": typeOfDay = "End of work week";
				break;
			case "saturday":
			case "sunday": typeOfDay = "Weekend";
				break;
		default:
		throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
		}
		return typeOfDay;
	}
}
