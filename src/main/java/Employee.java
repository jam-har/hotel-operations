public class Employee {
    String employeeID;
    String name;
    String department;
    double payRate;
    double hoursWorked;

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double regularHours() {
        double regHours = 40;
        if (hoursWorked <= 40) {
            regHours = hoursWorked;
        }
        return regHours;
    }

    public double overtimeHours () {
        double otHours = 0;
        if(hoursWorked > 40) {
            otHours = hoursWorked - 40;
        }
        return otHours;
    }
}
