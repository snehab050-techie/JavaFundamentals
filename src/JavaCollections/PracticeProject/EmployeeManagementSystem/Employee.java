package JavaCollections.PracticeProject.EmployeeManagementSystem;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Iterator;

public class Employee {

    private int empId;
    private String name;
    private String department;
    private int salary;

    List<Employee> list = new ArrayList<>();

    public Employee() {
    }

    public Employee(int empId, String name, String department, int salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, department, salary);
    }

    public void createEmployees(){

        list.add(new Employee(1,"Sneha","IT",80000));
        list.add(new Employee(2,"Suhas","Sales",95000));
        list.add(new Employee(3,"Janaki","Infra",75000));
        list.add(new Employee(4,"Priya","IT",65000));
    }

    public void viewAllEmployees(){
       Iterator<Employee> emp = list.iterator();
       while(emp.hasNext()){
           System.out.println(emp.next());
       }
    }

    public void removeEmployee(int salary){
       Iterator<Employee> it =  list.iterator();
       while (it.hasNext()){
           Employee e = it.next();
           if(e.getSalary() < salary){
               it.remove();
           }
       }
        System.out.println("Curretn employees: "+list);
    }

    public void countEmployeesDeptWise(String dept){
        Iterator<Employee> it =  list.iterator();
        int count = 0;
        while(it.hasNext()){
            Employee e = it.next();
            if(e.getDepartment().equals(dept)){
                count++;
            }
        }
        System.out.println("Emp count in dept: "+dept+" is : "+count);
    }

    public void findEmpWithMaxSalary(){
        Iterator<Employee> it =  list.iterator();
        int max = list.getFirst().getSalary();
        while(it.hasNext()){
            Employee e = it.next();
            if(e.getSalary() > max){
                max = e.getSalary();
            }
        }
        for(Employee e : list){
            if(e.getSalary() == max){
                System.out.println("Employee with max salary: "+e);
            }
        }
    }

    public void viewEmployeesWithStr(String letter){
        Iterator<Employee> it =  list.iterator();
        while(it.hasNext()){
            Employee e = it.next();
            if(e.getName().startsWith(letter)){
                System.out.println("Employees name starting with letter: "+letter+" is: "+e);
            }
        }
    }
}

class Execution{

    static void main() {

        Employee emp = new Employee();
        emp.createEmployees();
        emp.viewAllEmployees();
        emp.removeEmployee(70000);
        emp.countEmployeesDeptWise("IT");
        emp.findEmpWithMaxSalary();
        emp.viewEmployeesWithStr("S");
    }
}
