
class Size {

    public static void main(String[] args) {
//         byte b = 128; // Compilation error: incompatible types: possible lossy conversion from int to byte
//         System.out.println("Byte value: " + b);

//         System.out.println("Size of byte: " + Byte.BYTES + " bytes");
// H0W TO FORCEFULLY CONVERT INT TO BYTE 
        byte b = (byte) 520;
        byte c = (byte) 644;
        byte d = (byte) 1028;
        byte e = (byte) 600;
        byte f = (byte) 300;
        byte g = (byte) 370;
        byte h = (byte) -500;
        byte i = (byte) -200;
        byte j = (byte) -400;

        System.out.println("Byte value b: " + b);
        System.out.println("Byte value c: " + c);
        System.out.println("Byte value d: " + d);
        System.out.println("Byte value e: " + e);
        System.out.println("Byte value f: " + f);
        System.out.println("Byte value g: " + g);
        System.out.println("Byte value h: " + h);
        System.out.println("Byte value i: " + i);
        System.out.println("Byte value j: " + j);

    }
}
