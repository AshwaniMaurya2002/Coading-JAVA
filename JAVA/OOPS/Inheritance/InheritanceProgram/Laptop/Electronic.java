



class Electronic extends Product {
        int voltage;
        String chargingType;

    public Electronic() {
    }

    public Electronic(String brand, int id,int voltage, String chargingType) {
       
        super(brand, id);

        this.voltage = voltage;
        this.chargingType = chargingType;
    }

        @Override
    public String toString(){
        return  super.toString()+"voltage is: "+voltage+"\t charging type is: "+chargingType;
    }
        
}
