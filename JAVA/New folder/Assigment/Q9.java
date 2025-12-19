
class Q9 {

    public static void main(String[] args) {
        HemisphereDetails(7);
        HemisphereVolume(7);
        HemisphereTotalSurfaceArea(7);
        HemisphereCurvedSurfaceArea(7);

    }

    public static void HemisphereDetails(int radius) {
        System.out.println("Radius of Hemisphere: " + radius);
    }

    public static void HemisphereVolume(int radius) {
        float volume = 2 / 3.0f * 3.14f * radius * radius * radius;
        System.out.println("Volume of Hemisphere: " + volume);
    }

    public static void HemisphereTotalSurfaceArea(int radius) {
        float totalSurfaceArea = 3 * 3.14f * radius * radius;
        System.out.println("Total Surface Area of Hemisphere: " + totalSurfaceArea);
    }

    public static void HemisphereCurvedSurfaceArea(int radius) {
        float curvedSurfaceArea = 2 * 3.14f * radius * radius;
        System.out.println("Curved Surface Area of Hemisphere: " + curvedSurfaceArea);
    }
}
