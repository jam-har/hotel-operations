public class Employee { //should be private
    String employeeID; // int
    String name;
    String department;
    double payRate;
    double hoursWorked;

    public double getTotalPay() {
        return payRate * hoursWorked; //consider overtime pay (if, else-if)
        //return (getRegularHours() * payRate) + ((getRegularHours() * payRate) * 1.5)
    }

    public double regularHours() {
        double regHours = 40;
        if (hoursWorked <= 40) {
            regHours = hoursWorked;
        }
        return regHours; //no need for separate variable. use if and return hoursWorked else return 40
    }

    public double overtimeHours () {
        double otHours = 0;
        if(hoursWorked > 40) {
            otHours = hoursWorked - 40;
        }
        return otHours; // same as above no need for separate hours variable
    }
}
