package MusaOdevAtm;

public class Ana {
    public static void main(String[] args) {
        Atm atm =new Atm();
        Hesap hesap1=new Hesap("musa ekmek","3434",4000);

        atm.calis(hesap1);
        System.out.println("programdan cikiliyor");


    }




}
