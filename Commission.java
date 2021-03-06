import java.util.*;
import java.io.*;
public class Commission extends Employee
{
    private int weeksWorked;
    private double weeklySalary;
    private double weeklySales;
    private double yearlySales;
    private double commission;
    private char type = 'C';

    //Constructors
    public Commission()
    {
        weeksWorked = 0;
        weeklySalary = 0.0;
        weeklySales = 0.0;
        commission = 0.0;
    }

    public Commission(String id, String empNum, String dept, int numWeeks, double weekSal, double wSales, double ySales, double comm)
    {
        super(id, empNum, dept);
        weeksWorked = numWeeks;
        weeklySalary = weekSal;
        yearlySales = ySales;
        commission = comm;
    }

    //Accessors
    public int getWeeksWorked()
    {
        return weeksWorked;
    }

    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    public double getWeeklySales()
    {
        return weeklySales;
    }

    public double getYearlySales()
    {
        return yearlySales;
    }

    public double getCommission()
    {
        return commission;
    }

    public char getType()
    {
        return type;
    }

    //Mutators
    public void setWeeksWorked(int numWeeks)
    {
        weeksWorked = numWeeks;
    }

    public void setWeeklySalary(double weekSal)
    {
        weeklySalary = weekSal;
    }

    public void setWeeklySales(double wSales)
    {
        weeklySales = wSales;
    }

    public void setCommission(double comm)
    {
        commission = comm;
    }

    //Helper Methods
    /**
     * Determines if employee is part of the Top Seller's Club
     */
    public boolean topSeller()
    {
        boolean topSeller = false;

        if ((yearlySales / 52.0) > 1500)
            topSeller = true;

        return topSeller;
    }

    protected double calcWeeklySalary()
    {
        double salary = 0.0;

        salary = (weeksWorked * weeklySalary) + (weeklySales * commission);

        return salary;
    } 

    public String toString()
    {
        String result;

        result = super.toString();
        result = result + " " + type + " " + weeksWorked + " " + weeklySalary + " " + weeklySales + " " + commission;

        return result;
    } 

    public void writeData(String fileLoc) throws IOException
    {
        super.writeData(fileLoc);
    }

    public String printDetails()
    {
        String result;

        result = super.printDetails();
        result = result + "Weeks Worked: \t" + weeksWorked + "\n" +
        "Weekly Salary: \t" + weeklySalary + "\n" +
        "Weekly Sales: \t" + weeklySales + "\n" +
        "Commission Rate: \t" + commission + "\n";

        return result;
    }
}
