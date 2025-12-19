
class Q8 {

    public static void main(String[] args) {
        SphereDetails(7);
        SphereVolume(7);
        SphereLateralSurfaceArea(7);
        SphereTotalSurfaceArea(7);
    }

    public static void SphereDetails(int radius) {
        System.out.println("Radius of Sphere: " + radius);
    }

    public static void SphereVolume(int radius) {
        float volume = 4 / 3 * 3.14f * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
    }

    public static void SphereLateralSurfaceArea(int radius) {
        float surfaceArea = 4 * 3.14f * radius * radius;
        System.out.println("Surface Area of Sphere: " + surfaceArea);
    }

    public static void SphereTotalSurfaceArea(int radius) {
        float totalSurfaceArea = 4 * 3.14f * radius * radius;
        System.out.println("Total Surface Area of Sphere: " + totalSurfaceArea);
    }

}
