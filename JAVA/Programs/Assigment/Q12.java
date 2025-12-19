
class Q12 {

    public static void main(String[] args) {
        CuboidDetails(4, 5, 6);
        CuboidVolume(4, 5, 6);
        CuboidLateralSurfaceArea(4, 5, 6);
        CuboidTotalSurfaceArea(4, 5, 6);

    }

    public static void CuboidDetails(int length, int breadht, int height) {
        System.out.println("Length of Cuboid: " + length);
        System.out.println("Breadth of Cuboid: " + breadht);
        System.out.println("Height of Cuboid: " + height);
    }

    public static void CuboidVolume(int length, int breadht, int height) {
        int volume = length * breadht * height;
        System.out.println("Volume of Cuboid: " + volume);
    }

    public static void CuboidLateralSurfaceArea(int length, int breadht, int height) {
        int lateralSurfaceArea = 2 * height * (length + breadht);
        System.out.println("Lateral Surface Area of Cuboid: " + lateralSurfaceArea);
    }

    public static void CuboidTotalSurfaceArea(int length, int breadht, int height) {
        int totalSurfaceArea = 2 * (length * breadht + breadht * height + height * length);
        System.out.println("Total Surface Area of Cuboid: " + totalSurfaceArea);
    }

}
