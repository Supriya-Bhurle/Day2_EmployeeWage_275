public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage program");
        int employeeCheck = (int)Math.floor(Math.random()*10)%2;
        System.out.println(employeeCheck);
        if (employeeCheck==1){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }}