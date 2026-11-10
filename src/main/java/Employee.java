public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double getTotalPay() {
        //return (payRate * hoursWorked); //consider overtime pay (if, else-if)
        //return (getRegularHours() * payRate) + ((getRegularHours() * payRate) * 1.5)
        return (regularHours() * payRate) + (overtimeHours() * payRate * 1.5);

    }

    public double regularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else return 40;
    }


    public double overtimeHours () {
        if(hoursWorked > 40) {
            return hoursWorked - 40;
        } else return 0;
    }
    double start;
    public double punchIn (double time) {
        start = time;
        return start;
    }

    public double punchOut(double time){
        double dayHoursWorked = time - start;
        hoursWorked = hoursWorked + dayHoursWorked;
        return hoursWorked;
    }
}
