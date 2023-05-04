/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_java;
import java.util.ArrayList;

/**
 *
 * @author melek
 */
public class Arraylist_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //koleksiyonlar=arraylist
//ArrayListi ilk oluşturduğumuzda boyut belirtmeyiz


   
        int[] sayi=new int[]{1,2,3};
        //sayilar[3]=4 dersek ouofboundexception hatası alırız
        sayi=new int[4];
        System.out.println(sayi[0]); //0 değeri döndürecek en son tanımladığımız newden önceki new geçersiz olur
        //yeni newde indislere değer atamadığımız için int tipinin default değerini döndürdü
        //koleksiyonlar arka planda bir diziyi yönetirler.
        //yeni bir eleman eklediğimizde önceden eklenen ilk 3 elemanı yedekler 
        //4.eleman dediğimizde ilk 3 elemanı oraya yerleştirir.ardından dördüncü elemanı yerleştirir
        //---------------------------------------------------------------------------------------------//
        ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        System.out.println(sayilar.size());
        sayilar.add("ankara");
        //arrayliste parametre olarak obje göndeririz.int class string vs eklenebilir
        System.out.println(sayilar.get(2));//ikinci indexteki değeri getirir
        sayilar.set(2,100);//arraylistte indexi verilen elemanı değiştirir
        System.out.println(sayilar.get(2));
        sayilar.remove(0);//verilen indexteki değeri siler
        System.out.println(sayilar.get(0));//10 değerini döndürecek
        sayilar.clear(); //tüm elemanları siler
        System.out.println(sayilar.get(0)); //listede hiç eleman olmayaacağı için hata verir

       



    }
}
       
        
 

    

