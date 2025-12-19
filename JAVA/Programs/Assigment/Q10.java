
class Q10 {

    public static void main(String[] args) {
        ConeDetails(5, 12);
        ConeVolume(5, 12);
        ConeLateralSurfaceArea(5, 12);
        ConeTotalSurfaceArea(5, 12);

    }

    public static void ConeDetails(int radius, int height) {
        System.out.println("Radius of Cone: " + radius);
        System.out.println("Height of Cone: " + height);
    }

    public static void ConeVolume(int radius, int height) {
        float volume = 1 / 3f * 3.14f * radius * radius * height;
        System.out.println("Volume of Cone: " + volume);
    }

    public static void ConeLateralSurfaceArea(int radius, int height) {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        float lateralSurfaceArea = (float) (3.14f * radius * slantHeight);
        System.out.println("Lateral Surface Area of Cone: " + lateralSurfaceArea);
    }

    public static void ConeTotalSurfaceArea(int radius, int height) {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        float totalSurfaceArea = (float) (3.14f * radius * (radius + slantHeight));
        System.out.println("Total Surface Area of Cone: " + totalSurfaceArea);
    }

}       
