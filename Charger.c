public class Charger {
    
    public static void main(String[] args) {
        
        int chargerwireless = 249;
        int charger = 199;

        if(chargerwireless > charger) {
            System.out.println("charger wireless lebih mahal dari charger biasa");
        }
        else if(charger > chargerwireless){
            System.out.println("charger biasa lebih murah dari charger wireless ");
        }
        else {
            System.out.print("charger wireless dan charger biasa berfungsi sama");
        }
        
    }
}
