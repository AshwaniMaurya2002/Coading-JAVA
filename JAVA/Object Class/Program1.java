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
    public int hashCode() {
        return price;
    }

@Override
    public boolean  equals(Object obj){

        if(this==obj)
            return true;

        else if(obj==null || this.getClass()!=obj.getClass())
            return  false;

        else
        {
            Program1 other = (Program1) obj;
            return  this.price==other.price && this.age==other.age && this.name.equals(other.name);
        }
    }

    public static void main(String[] args) {
        Program1 p = new Program1("Ashwani",36,346);
        Program1 p1 = new Program1("Ashwani",536,346);

       boolean res= p.equals(p1);
       System.out.println(res);
        
    }
    
}
