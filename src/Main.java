public class Main {
    public static void main(String args[]){
        Dimensions dimensions = new Dimensions(3,6,8);
        Carge carge = new Carge(13,"Adress1","5673857gddj",true,false,dimensions);
        dimensions.setHeight(5);
        System.out.println(carge.inform());
        carge.setdeliveryAdress("Adress2");
        System.out.println(carge.getDeliveryAdress());




    }
}
