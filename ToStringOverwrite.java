//to display info by overwiting ToString
class Employee{
String name;
    int salary;

 public Employee(String name,int salary){
    this.name=name;
    this.salary=salary;
 }   
 public String toString(){
    String details="Name="+this.name+"Salary="+this.salary;
    return details;
 }
}
class ToStringOverwrite{
    public static void main(String[] args) {
        Employee e=new Employee("Sandy",55000);
    System.out.println(e);
    }
}    