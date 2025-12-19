
public class WeaponDriver {

    public static void main(String[] args) {

        Weapon akm = new Weapon();
        akm.name = "AKM";
        akm.damage = 75;
        akm.bullets = 30;
        akm.isAutomatic = true;

        Weapon m16 = new Weapon();
        m16.name = "M16";
        m16.damage = 65;
        m16.bullets = 30;
        m16.isAutomatic = false;

        System.out.println("---------Object1 AKM--------------");
        System.out.println("Weapon: " + akm.name);
        System.out.println("Damage: " + akm.damage);
        System.out.println("Bullets: " + akm.bullets);
        System.out.println("Automatic: " + akm.isAutomatic);

        System.out.println("\n---------Object2 M16--------------");

        System.out.println("\nWeapon: " + m16.name);
        System.out.println("Damage: " + m16.damage);
        System.out.println("Bullets: " + m16.bullets);
        System.out.println("Automatic: " + m16.isAutomatic);

    }
}
