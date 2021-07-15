public class Carge {
    private final double weight;
    private final String deliveryAdress;
    private final String registrationNumber;
    private final boolean property;
    private final boolean fragile;
    private final Dimensions dimensions;

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isProperty() {
        return property;
    }

    public boolean isFragile() {
        return fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Carge(double weight, String deliveryAdress, String registrationNumber, boolean property, boolean fragile, Dimensions dimensions) {
        this.weight = weight;
        this.deliveryAdress = deliveryAdress;
        this.registrationNumber = registrationNumber;
        this.property = property;
        this.fragile = fragile;
        this.dimensions = dimensions;
    }

    public Carge setdeliveryAdress(String deliveryAdress) {
        return new Carge(weight, deliveryAdress, registrationNumber, property, fragile, dimensions);
    }

    public Carge setdimensions(Dimensions dimensions) {
        return new Carge(weight, deliveryAdress, registrationNumber, property, fragile, dimensions);
    }

    public Carge setweight(double weight) {
        return new Carge(weight, deliveryAdress, registrationNumber, property, fragile, dimensions);
    }
    public String inform(){
        String info = "";
        info = weight +" "+  deliveryAdress  +" "+ registrationNumber  +" " + property +" " + fragile +" " + dimensions.print();
        return info;
    }

}
