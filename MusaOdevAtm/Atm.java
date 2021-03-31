package MusaOdevAtm;

import java.util.Scanner;

public class Atm {

   public void calis(Hesap hesap1){
    Login login=new Login();

       Scanner scan =new Scanner(System.in);
       System.out.println("=======================");
       System.out.println("hosgeldin");
       System.out.println("=======================");
       System.out.println("kullanici adininiz= ");
       int giris=3;

       while(true){
           if(login.login(hesap1)){
               System.out.println("basarili");
               break;
           }
           else{
               System.out.println(":giris bassaarisiz");
               giris-=1;
           }
           if(giris==0){
               System.out.println("kilit");
                return;
           }
       }
       System.out.println("============");
       String islemler= "1. bakiye goruntule/n"
                         + "2. para yatirma /n"
                         + "3. para cekme/n"
                          +"4. cikis q";
       System.out.println(islemler);


       while(true){
           System.out.println("islemi sec");
           String islem= scan.nextLine();
           if(islem.equals("q")){
               break;
           }
           else if(islem.equals("1")){
               System.out.println(hesap1.getBakiye());
           }
           else if(islem.equals("2")){
               System.out.println("kac para yatircan");
               int tutar= scan.nextInt();
               hesap1.paraYatirma(tutar);
           }
           else if(islem.equals("3")){
               System.out.println("kac para yatircan");
               int tutar= scan.nextInt();
               hesap1.paraCek(tutar);
           }else{
               System.out.println("gecersiz islem");
           }


       }
   }



}
