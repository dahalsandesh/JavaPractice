class Employee{
    String name;
    int id,mSal;

    public Employee(String name,int id,int mSal){
        this.id=id;
        this.name=name;
        this.mSal=mSal;
    }
     public int getYearlySalary(){
      return this.mSal*12;
      }
    public String getDetails(){
        return("Name="+this.name+" "+"Salary="+this.mSal+" "+"id="+this.id+" "+"yearlySalary="+this.getYearlySalary());
    } 
}
class Teacher extends Employee{
    int numSub;

   public Teacher(String name,int id,int mSal,int numSub){
    super(name, id, mSal);
    this.numSub=numSub;
   } 

   //override
   public int getYearlySalary(){
    return super.getYearlySalary()+this.numSub*1000;
}
   public String getDetails(){
    return super.getDetails()+" "+"No. of Sub="+this.numSub;
   }
}
public class InheritanceProblem {
public static void main(String[] args) {
    Teacher t=new Teacher("Ram", 10, 40000, 6);
    Employee e=new Employee("Hari", 2, 25000);
    System.out.println(t.getDetails());
    System.out.println(e.getDetails());
}    
}
