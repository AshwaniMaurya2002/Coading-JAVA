class Rectangle{

    int length;
    int breath;

    public void setValue(int l,int b){
        length=l;
        breath=b;
    }

    public void printDetails(){
       System.out.println("THE LENGTH IS : " + length);
       System.out.println("THE BREATH IS :" + breath);   
    }

    public void printArea(){
        System.out.println("Area Is : "+ length*breath);

    }

    public void printPerimeter(){
        int perimeter=2*(length+breath);
        System.out.println("Perimeter IS : "+ perimeter);
    }

    public static void main(String[] args) {

        Rectangle r1=new Rectangle();
        r1.setValue(12, 423);
        r1.printArea();
        r1.printDetails();
        r1.printPerimeter();
        
    }
}