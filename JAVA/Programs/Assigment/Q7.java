
class Q7 {

    public static void main(String[] args) {

        CylinderDetails(7, 10);
        CylinderVolume(7, 10);
        CylinderLateralSurfaceArea(7, 10);
        CylinderTotalSurfaceArea(7, 10);
    }

    public static void CylinderDetails(int radius, int height) {
        System.out.println("Radius of Cylinder: " + radius);
        System.out.println("Height of Cylinder: " + height);
    }

    public static void CylinderVolume(int radius, int height) {
        float volume = 3.14f * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    public static void CylinderLateralSurfaceArea(int radius, int height) {
        float lateralSurfaceArea = 2 * 3.14f * radius * height;
        System.out.println("Lateral Surface Area: " + lateralSurfaceArea);
    }

    public static void CylinderTotalSurfaceArea(int radius, int height) {
        float totalSurfaceArea = 2 * 3.14f * radius * (radius + height);
        System.out.println("Total Surface Area : " + totalSurfaceArea);
    }

}
