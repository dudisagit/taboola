package dudiSagitTaboola.q2;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class MyClass {
	private Date time;
	private String name;
	private List<Long> numbers;
	private List<String> strings;

	public MyClass(Date time, String name, List<Long> numbers, List<String> strings) {

		this.time = time;
		this.name = name;
		this.numbers = numbers;
		this.strings = strings;
	}

	public boolean equals(Object obj) {
		if (obj instanceof MyClass) {
			return name.equals(((MyClass) obj).name);
		}
		return false;
	}

	public String toString() {
		String out = name;
		for (long item : numbers) {
			out += " " + item;
		}
		return out;
	}

	public void removeString(String str) {
		strings.removeIf(item -> item.equals(str));
	}

	public boolean containsNumber(long number) {
		for (Long num : numbers) {
			if (num.equals(number)) {
				return true;
			}
		}
		return false;
	}

	public boolean isHistoric() throws NullPointerException{
		LocalDateTime localDateTime =LocalDateTime.now();
		Date today = new Date(localDateTime.getYear(),localDateTime.getMonthValue(),localDateTime.getDayOfMonth());
		Date timeParse = new Date(time.getYear(),time.getMonth(),time.getDate());

		return timeParse.before(today);
	}
}
