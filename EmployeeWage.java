public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("welcome to Employee wage program");
        int employeeCheck = (int)Math.floor(Math.random()*10)%2;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if (employeeCheck==1){
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Employee wage is " + dailyWage);
    }}