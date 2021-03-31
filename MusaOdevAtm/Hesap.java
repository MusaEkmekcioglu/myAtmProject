package MusaOdevAtm;

public class Hesap {

     private String kullaniciAdi;
     private String parola;
     private int bakiye;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public Hesap(){

     }
    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatirma(int tutar){
         this.bakiye=bakiye+tutar;
        System.out.println("yeni bakiyeniz= "+ this.bakiye );

    }
    public void paraCek(int tutar){
         if(tutar>bakiye){
             System.out.println("yeterli bakiye yok");
         }else{
             bakiye=bakiye-tutar;
             System.out.println("yeni bakiye "+bakiye);
         }
    }
}
