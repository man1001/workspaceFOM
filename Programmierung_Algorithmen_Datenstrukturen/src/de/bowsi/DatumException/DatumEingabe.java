package de.bowsi.DatumException;

import java.util.Date;
import java.text.*;

public class DatumEingabe {
	
	public Date pruefeDatum(String datum) throws ParseException{
		DateFormat df = DateFormat.getDateInstance();
		
		df.setLenient(false);
		
		Date d = df.parse(datum);
		return d;
	}
	
	
}
