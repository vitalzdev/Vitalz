package nl.vitalzteam.vitalz.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * Get the full name of the current day
	 * @return The full name of the current day
	 */
	public static String getDayName() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String strDay;
		switch(day) {
			case Calendar.SUNDAY:
				strDay = "Sunday";
				break;

			case Calendar.MONDAY:
				strDay = "Monday";
				break;

			case Calendar.TUESDAY:
				strDay = "Tuesday";
				break;

			case Calendar.WEDNESDAY:
				strDay = "Wednesday";
				break;

			case Calendar.THURSDAY:
				strDay = "Thursday";
				break;

			case Calendar.FRIDAY:
				strDay = "Friday";
				break;

			case Calendar.SATURDAY:
				strDay = "Saturday";
				break;

			default:
				strDay = "ERROR";
				break;
		}
		return strDay;
	}

	/**
	 * Get the abbreviation of the current day
	 * @return The abbreviation of the current day
	 */
	public String getDayNameAbbr() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String strDay;
		switch(day) {
			case Calendar.SUNDAY:
				strDay = "Sun";
				break;

			case Calendar.MONDAY:
				strDay = "Mon";
				break;

			case Calendar.TUESDAY:
				strDay = "Tue";
				break;

			case Calendar.WEDNESDAY:
				strDay = "Wed";
				break;

			case Calendar.THURSDAY:
				strDay = "Thu";
				break;

			case Calendar.FRIDAY:
				strDay = "Fri";
				break;

			case Calendar.SATURDAY:
				strDay = "Sat";
				break;

			default:
				strDay = "ERROR";
				break;
		}
		return strDay;
	}

	/**
	 * Get full name of the current month
	 * @return The full name of the current month
	 */
	public static String getMonthName() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		String strMonth;
		switch(month) {
			case Calendar.JANUARY:
				strMonth = "Jan";
				break;

			case Calendar.FEBRUARY:
				strMonth = "Feb";
				break;

			case Calendar.MARCH:
				strMonth = "Mar";
				break;

			case Calendar.APRIL:
				strMonth = "Apr";
				break;

			case Calendar.MAY:
				strMonth = "May";
				break;

			case Calendar.JUNE:
				strMonth = "June";
				break;

			case Calendar.JULY:
				strMonth = "July";
				break;

			case Calendar.AUGUST:
				strMonth = "Aug";
				break;

			case Calendar.SEPTEMBER:
				strMonth = "Sept";
				break;

			case Calendar.OCTOBER:
				strMonth = "Oct";
				break;

			case Calendar.NOVEMBER:
				strMonth = "Nov";
				break;

			case Calendar.DECEMBER:
				strMonth = "Dec";
				break;

			default:
				strMonth = "ERROR";
				break;
		}
		return strMonth;
	}

	/**
	 * Get the abbreviation of the current month
	 * @return The abbreviation of the current month
	 */
	public static String getMonthNameAbbr() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		String strMonth;
		switch(month) {
			case Calendar.JANUARY:
				strMonth = "January";
				break;

			case Calendar.FEBRUARY:
				strMonth = "February";
				break;

			case Calendar.MARCH:
				strMonth = "March";
				break;

			case Calendar.APRIL:
				strMonth = "April";
				break;

			case Calendar.MAY:
				strMonth = "May";
				break;

			case Calendar.JUNE:
				strMonth = "June";
				break;

			case Calendar.JULY:
				strMonth = "July";
				break;

			case Calendar.AUGUST:
				strMonth = "August";
				break;

			case Calendar.SEPTEMBER:
				strMonth = "September";
				break;

			case Calendar.OCTOBER:
				strMonth = "October";
				break;

			case Calendar.NOVEMBER:
				strMonth = "November";
				break;

			case Calendar.DECEMBER:
				strMonth = "December";
				break;

			default:
				strMonth = "ERROR";
				break;
		}
		return strMonth;
	}

	/**
	 * Get the current year
	 * @return The current year
	 */
	public static String getYear() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		String output = format.format(date);
		return output;
	}

	/**
	 * Get the number of the current month
	 * @return The number of the current month
	 */
	public static String getMonthNumber() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM");
		String output = format.format(date);
		return output;
	}

	/**
	 * Get the number of the current day
	 * @return The number of the current day
	 */
	public static String getDayNumber() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd");
		String output = format.format(date);
		return output;
	}

	/**
	 * Get the current hour
	 * @return The current hour
	 */
	public static String getHour() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH");
		String output = format.format(date);
		return output;
	}

	/**
	 * Get the current minute
	 * @return The current minute
	 */
	public static String getMinute() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("mm");
		String output = format.format(date);
		return output;
	}

	/**
	 * Get the current second
	 * @return The current second
	 */
	public static String getSecond() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("ss");
		String output = format.format(date);
		return output;
	}

	/**
	 * Get the full date in dd-MM-yyyy HH:mm:ss format
	 * @return The full date in dd-MM-yyyy HH:mm:ss format
	 */
	public static String getFullDate() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String output = format.format(date);
		return output;
	}
}