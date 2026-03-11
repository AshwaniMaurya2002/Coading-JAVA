public class Employ {
    //mandatory
    String name;
    int id;

    int age;
    String address;



    public Employ() {
    }

    public Employ(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employ(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.age = builder.age;
        this.address = builder.address;
    }

    class Builder{

    String name;
    int id;

    int age;
    String address;

        public Builder() {
        }

        public Builder(String name, int id, int age, String address) {
            this.name = name;
            this.id = id;
            this.age = age;
            this.address = address;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Employ build(){
            return new Employ(this);
        }
    }
}
