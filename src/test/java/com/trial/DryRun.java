package com.trial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DryRun  {

	public static void main(String[] args)
	{
		//Create formatter
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a");

		//Local date time instance
		LocalDateTime localDateTime = LocalDateTime.now();

		//Get formatted String
		String ldtString = FOMATTER.format(localDateTime);

		System.out.println("Suresh " +ldtString+".png");
	}

}
