
class Q11 {

    public static void main(String[] args) {
        CubeDetails(4);
        CubeVolume(4);
        CubeLateralSurfaceArea(4);
        CubeTotalSurfaceArea(4);

    }

    public static void CubeDetails(int side) {
        System.out.println("Side of Cube: " + side);
    }

    public static void CubeVolume(int side) {
        int volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    public static void CubeLateralSurfaceArea(int side) {
        int lateralSurfaceArea = 4 * side * side;
        System.out.println("Lateral Surface Area of Cube: " + lateralSurfaceArea);
    }

    public static void CubeTotalSurfaceArea(int side) {
        int totalSurfaceArea = 6 * side * side;
        System.out.println("Total Surface Area of Cube: " + totalSurfaceArea);
    }
}
