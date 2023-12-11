public class Employee1 {
    private int empId;
    private String empName;
    private String empAddress;
    private double empSalary;
    public Employee1(int empId, String empName, String empAddress, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary=" + empSalary + "]";
    }
    public void printEmployee() {
        System.out.println(this.toString());
    }
    public static void main(String[] args) {
        // Example usage
        Employee1 employee = new Employee1(1, "John Doe", "123 Main St", 50000.0);
        employee.printEmployee();
    }
}
