import java.util.Scanner;

class Game{

    static{

        System.out.println("=========Game Started========");
    }


    public static Weapon selectWeapon(){

        System.out.println("Press 1 for Knife");
        
        System.out.println("Press 2 for Bomb");
        System.out.println("Press 3 for Gun");

        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("You selected Knife");
                Knife k=new Knife();
                return k;

            case 2:
                System.out.println("You selected Bomb");
                Bomb b=new Bomb();
                return  b;

            case 3:
                 System.out.println("You selected Gun");
                 Gun g=new Gun();
                 return g;

                 default:
                     System.out.println("You selected A Invalid Options");
                     return selectWeapon();
        }


    }

}