public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int check) {
		if (check % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}

	public static String teacherOrStudent(String check) {
		if (check == "Kalisz") {
			return "Teacher";
		} else {
			return "Student";
		}
	}

	public static int fartherFromZero(int check) {
		if (check < 0) {
			return check - 5;
		} else if (check > 0) {
			return check + 5;
		} else {
			return check;
		}
	}

	public static String isFive(int check) {
		if (check == 5) {
			return "The number is Five";
		}
		return "The number is not Five";
	}

	public static String positiveOrNegative(double check) {
		if (check > 0) {
			return "Positive";
		} else {
			return "Negative";
		}
	}

	public static String highOrLow(int check) {
		if (check > 100) {
			return "High";
		} else {
			return "Low";
		}
	}

	public static String isHello(String check) {
		if (check.equals("Hello")) {
			return "The word is Hello";
		} else {
			return "The word is not Hello";
		}
	}
}
