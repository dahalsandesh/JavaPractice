//program to demonstrate abstrate class 
abstract class Athlete {
    String name,country;
public Athlete(String name,String country ){
    this.name=name;
    this.country=country;
}
abstract void showStats(){

}
}
class Cricket extends Athlete{
    int runs;
    public Cricket(String name,String country,int runs){
        super(name, country);
        this.runs=runs;
    }
    @Override
    void showStats(){
        System.out.println("Player Name: "+super.name+"\t"+ "Country: " +super.country+"\t"+"Score: "+this.runs);
    }
}
class AbstractClass{
    public static void main(String[] args) {
        Cricket c=new Cricket("Virat", "India", 170000);
        c.showStats();
    }
}