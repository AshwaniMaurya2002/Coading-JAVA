import java.util.ArrayList;
import java.util.List;

public class Driver {

    
    public static void main(String[] args) {
        List<Shirts> shirts=new ArrayList<>();
        
        Shirts s1=new Shirts("arrow","red",2434,432);
        shirts.add(s1)  ;
        shirts.add(new Shirts("Polo  ", "Blue", 2700.25, 34));
        shirts.add(new Shirts("VanH ", "White", 2200.75, 32));
        shirts.add(new Shirts("LouisP", "Black", 2700.25, 36));
        shirts.add(new Shirts("ParkA", "Grey", 2400.0, 34));
        shirts.add(new Shirts("AllenS", "Green", 2600.5, 38));
        shirts.add(new Shirts("Raymond", "Yellow", 2100.0, 32));
        
      
        // System.out.println(shirts);
        for (Object elem : shirts) {
            System.out.println(elem);
            
        }


        shirts.sort((a,b)->a.size-b.size);


    }
}
