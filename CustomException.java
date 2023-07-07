//own custom exception class which object can be thrown when user try to initialize student object with invalid semester
class SemesterException extends Exception{
    public SemesterException(String msg){
        super(msg);
    }
}
class Student{
    String name;
    int sem;
public Student(String name,int sem)throws SemesterException{
    if(sem<1||sem>8){
        throw new SemesterException("Semester must be between 1 & 8");
    }
    this.name= name;
    this.sem= sem;
}
}
public class CustomException {
    public static void main(String[] args) {
        try{
            Student s= new Student("Ram",0);
        }
        catch(SemesterException e){
            System.out.println(e.getMessage());
        }
    }
    
}
