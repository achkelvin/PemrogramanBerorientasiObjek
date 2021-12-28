public class Lampu {
        String namaLampu;
        boolean menyala;
    
        //konstruktor
        Lampu(String namaLampu){
        this.namaLampu = namaLampu;
        this.menyala = false;
        }
    
        //membuat koondisi lampu menyala
        void on(){
        System.err.println(this.namaLampu + " dinyalakan");
        this.menyala = true;
        }
    
        //membuat kondisi lampu mati
        void off(){
        System.out.println(this.namaLampu + " dimatikan");
        this.menyala = false;
        }
    
        void statusLampu(){
        System.out.println("Objek " + this.namaLampu + ". ");
        System.out.println("Lampu menyala? " + menyala);
        }
    