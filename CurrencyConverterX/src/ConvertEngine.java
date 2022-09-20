public class ConvertEngine {
    static String[] currencies = {"EUR", "KCS", "ZLO"};

    static double result;
    static double eurCourse = 1;
    static double kcsCourse = 25;
    static double zloCourse = 4.7;

    public static void conversion(String unit_a, String unit_b, double entryValue) {

        if (unit_a.equals("EUR")) {
            result = entryValue / eurCourse;
        }
        else if (unit_a.equals("KCS")) {
            result = entryValue / kcsCourse;
        }
        else if (unit_a.equals("ZLO")) {
            result = entryValue / zloCourse;
        }

        if (unit_b.equals("EUR")) {
            result = entryValue * eurCourse;
        }
        else if (unit_b.equals("KCS")) {
            result = entryValue * kcsCourse;
        }
        else if (unit_b.equals("ZLO")) {
            result = entryValue * zloCourse;
        }


    }

}
