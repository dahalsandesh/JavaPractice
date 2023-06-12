//Computer Has a Storage Composition Problem
class Storage{
    private String type;
    private int capacity;
 
    public Storage(String type,int capacity){
        this.type=type;
        this.capacity=capacity;
    }

    public String toString(){
        return "Type="+this.type+" "+"Capacity="+this.capacity;
    }
}

class Computer{
    private String brand;
    private int price;
    private Storage stor;
 
    public Computer(String brand,int price,Storage stor){
        this.brand=brand;
        this.price=price;
        this.stor=stor;
    }

    public String toString(){
        return"Brand="+this.brand+" "+"Price="+this.price+" "+this.stor;
    }
}

class CompositionProblem {
 public static void main(String[] args) {
    Storage s= new Storage("SSD", 512);
    Computer c=new Computer("Dell",55000 , s);
    System.out.println(c);
 }    
}
