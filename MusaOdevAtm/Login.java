package MusaOdevAtm;

import java.util.Scanner;

public class Login {
    String kullaniciAdi;
    String parola;

    public boolean login(Hesap hesap){
        Scanner scan = new Scanner(System.in);
        System.out.println("kullanici adiniz ne ");
        kullaniciAdi=scan.nextLine();
        System.out.println("parola nedir ");
        parola=scan.nextLine();


        if(kullaniciAdi.equals(hesap.getKullaniciAdi()) && parola.equals(hesap.getParola())){
            System.out.println("dogru girdin ");
            return true;
        }else{

            System.out.println("yanlis girdin \\ kalan hakkin= ");
            return false;
            }

        }


    }

