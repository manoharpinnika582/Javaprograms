
public class NumberToString {
	public static String[] units= {
			"","One","Two","Three","Four","Five","Six","Seven","Eight",
			"Nine","Ten","Eleven","Twelve","Thirteen",
			"Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"	
	};
	public static String[] tens= {
			"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	};
	
	public static String convertToWords(int number) {
		if (number == 0) {
			return "Zero";
		}

		if (number < 0) {
			return "Negative " + convertToWords(-number);
		}

		if (number < 20) {
			return units[number];
		}

		if (number < 100) {
			return tens[number / 10] + (number % 10 != 0 ? " " + units[number % 10] : "");
		}

		if (number < 1000) {
			return units[number / 100] + " Hundred" + (number % 100 != 0 ? " and " + convertToWords(number % 100) : "");
		}
		if (number < 10000) {
			return units[number / 1000]+" Thousand "+(number%1000!=0 ? convertToWords(number % 1000) : "") ;
		}
		if (number < 1000000) {
            return convertToWords(number / 10000) + " lakhs" + (number % 10000 != 0 ? " " + convertToWords(number % 10000) : "");
        }

        if (number < 1000000000) {
            return convertToWords(number / 1000000) + " Million" + (number % 1000000 != 0 ? " " + convertToWords(number % 1000000) : "");
        }

		return "Number too large to convert";
	}
}
