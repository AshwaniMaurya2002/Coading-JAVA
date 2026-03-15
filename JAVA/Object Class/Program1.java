public class Program1 {
    String name;
    int price;
    int age;

    public Program1() {
    }

    public Program1(String name, int price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    
@Override
    public boolean  equals(Object obj){

        if(this==obj)
            return true;

        else if(obj==null || this.getClass()!=obj.getClass())
            return  false;

        else
            
            return  this.price==obj.price &&

    }      
    


    public static void main(String[] args) {

        Program1 p=new Program1();
        Program1 p1=new Program1();
        


        }
        


    }
    
}
