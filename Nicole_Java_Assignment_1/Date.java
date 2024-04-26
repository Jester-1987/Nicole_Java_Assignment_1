// Driver: Ch3_ex314.java

/* 3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type int), 
a day (type int) and a year (type int). Provide a constructor that initializes the three instance variables
and assumes that the values provided are correct. Provide a set and a get method for each instance variable. 
Provide a method displayDate that displays the month, day and year separated by forward slashes (/). 
Write a test app named DateTest that demonstrates class Date’s capabilities. */

public class Date {
    // create instance variables for month, day and year as type int
    private int month;
    private int day;
    private int year;

    // constructor initalizes name with parameter name
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    
    // getters
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }

    // setters
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // method to display the date as mm/dd/yyyy
    public void displayDate() {
        System.out.printf("%02d/%02d/%d\n", month, day, year);
    }    
}