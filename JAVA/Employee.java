class person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class employees extends person{
    private String employeeID;
    private String department;

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

}

public class Employee {
    public static void main(String[] args) {
        employees e1 = new employees();
        e1.setName("Akshatha");
        e1.setAge(18);
        e1.setEmployeeID("Ak632006");
        e1.setDepartment("Managing");

        System.out.println("Name:" + e1.getName());
        System.out.println("Age:" + e1.getAge());
        System.out.println("Employee ID:" + e1.getEmployeeID());
        System.out.println("Department:" + e1.getDepartment());



    }
}