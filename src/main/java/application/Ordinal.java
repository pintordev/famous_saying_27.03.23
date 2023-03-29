package application;

public class Ordinal {
    public static String convert(int order) {
        if (order % 10 == 1) {
            return order + "st";
        } else if (order % 10 == 2) {
            return order + "nd";
        } else if (order % 10 == 3) {
            return order + "rd";
        } else {
            return order + "th";
        }
    }
}
