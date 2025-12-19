
class ProductDriver {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();

        System.out.println(
                "-- -- ---prodcut1 Before INITALIZATION------");
        System.out.println("Object address  " + p1);

        System.out.println("Product name" + p1.name);
        System.out.println("Product Category" + p1.category);
        System.out.println("Product Price" + p1.price);

        System.out.println(
                "-- -- ---Product2 Before INITALIZATION------");
        System.out.println("Object address " + p2);

        System.out.println("Product name" + p2.name);
        System.out.println("Product Category" + p2.category);
        System.out.println("Product Price" + p2.price);

        p1.name = "samsung";
        p1.category = "mobile";
        p1.price = 23999;

        p2.name = "Iphone";
        p2.category
                = "mobile";
        p2.price = 150000;

        System.out.println(
                "-- -- ---prodcut1 After INITALIZATION------");
        System.out.println("Object address " + p1
        );

        System.out.println("Product name" + p1.name);
        System.out.println("Product Category" + p1.category);
        System.out.println("Product Price" + p1.price);

        System.out.println(
                "-- -- ---Product2 After INITALIZATION------");
        System.out.println("Object address " + p1);

        System.out.println("Product name" + p2.name);
        System.out.println("Product Category" + p2.category);
        System.out.println("Product Price" + p2.price);

    }

}
