public class Driver {
    
  
    public static void main(String[] args) {

        
        Vehicle v= Game.selectVehicle();
        if( v instanceof  Bus b)
        {
            System.out.println(b.a);
            System.out.println(b.x);
        }
        else if(v instanceof Car){
            Car c=(Car)v;
        }

        else if(v instanceof Bike)
        {
            System.out.println(v.a);
            System.out.println(((Bike) v).z);

        }


    }
}
