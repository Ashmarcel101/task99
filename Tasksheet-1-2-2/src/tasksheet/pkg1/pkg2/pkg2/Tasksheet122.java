package tasksheet.pkg1.pkg2.pkg2;
public class Tasksheet122 
 {
    private int day;
    private int month;
    private int year;


    public Tasksheet122() {
        this(1, 1, 1);
    }

    public Tasksheet122(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    } public int getYear() {
        return year;
    }
  
    public int setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
            return 1;
        }
        return 0;
    } public int setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
            return 1;
        }
        return 0;
    }
    public int setYear(int year) {
        if (year > 0) {
            this.year = year;
            return 1;
        }
        return 0;
    } 
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
   
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Tasksheet122 date1 = new Tasksheet122(1, 1, 1978);
        Tasksheet122 date2 = new Tasksheet122(21, 9, 1984);
        Tasksheet122 date =  new Tasksheet122(12, 12, 2012);
        System.out.println("Initial date: " + date.toString());
        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());
        System.out.println("Leap years between " +
                date1.getYear() + " and " + date2.getYear() + ":");
        for (int year = date1.getYear(); year <=
                date2.getYear(); year++) { if (isLeapYear(year)) {
            System.out.println(year);
        }
        }
    }
}