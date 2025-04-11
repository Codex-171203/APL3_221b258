class Main {     
    public static void main(String args[]) {         
        Offering offering1 = new Coffee();         
        offering1 = new Rum(offering1);         
        offering1 = new Gin(offering1);  
        System.out.println(offering1.getName() + " " + offering1.getPrice());  
        Offering offering2 = new IceCream();         
        offering2 = new Rum(offering2);         
        offering2 = new Gin(offering2);  
        System.out.println(offering2.getName() + " " + offering2.getPrice());
        Offering offering3 = new Juice();         
        offering3 = new Rum(offering3);         
        offering3 = new Gin(offering3);  
        System.out.println(offering3.getName() + " " + offering3.getPrice());
        Offering offering4 = new Tea();         
        offering4 = new Rum(offering4);         
        offering4 = new Gin(offering4);  
        System.out.println(offering4.getName() + " " + offering4.getPrice());
    } 
}





