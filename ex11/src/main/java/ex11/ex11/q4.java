package ex11.ex11;

public class q4 {
	public static String compare(double a, double b, String mod) {
		
		switch(mod) {
		case "regular":
			if (a<b)
				return "B";
			else
				return "A";
			
		case "negatives":
			if (-a <-b)
				return "B";
			else
				return "A";
			
		case "reciprocals":
			if (1/a<1/b)
				return "A";
			else
				return "B";
		}
		return mod;
	}

}
