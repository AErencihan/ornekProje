package javaornek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public ProductInfo product;
    Map <Integer, ProductInfo> urunBilgisi = new HashMap<>();


    public void recordProduct(Scanner input){

        System.out.println("eklenecek ürünün adını giriniz:");
        String productName = input.next();
        System.out.println("eklenecek ürünün ID'sini giriniz:");
        int productId = input.nextInt();
        System.out.println("eklenecek ürünün fiyatını giriniz");
        int productPrice = input.nextInt();

        product = ProductInfo.record()
                .addProductName(productName)
                .addProductId(productId)
                .addProductPrice(productPrice)
                .recorder();

        saveProduct(product);
        menu();
    }

    public void saveProduct(ProductInfo product){
        urunBilgisi.put(product.productId, product);

    }

    public void deleteProduct(Map<Integer, ProductInfo> urunBilgisi, int productId){
        if(urunBilgisi.containsKey(productId)){
            urunBilgisi.remove(productId);
            System.out.println("ürün silindi");
            this.urunBilgisi.forEach((key, value) -> {
                System.out.println("ürün Id : " + key);
                System.out.println("ürün name : " + value.productName);
            });
            return;
        }
        System.out.println("ürün bulunamadı ");
        menu();
    }

    public void products(){
            Map<Integer, ProductInfo> map = this.urunBilgisi;
            map.forEach((key, value) -> {
                System.out.println("ürün ID : " + key);
                System.out.println("ürün Name : " + value.productName);
            });
        menu();
    }


    public void menu(){
        System.out.println("1. ürün ekle");
        System.out.println("2. ürün sil");
        System.out.println("3. ürün listele");

        Scanner input = new Scanner(System.in);
        int islem;

        System.out.println("seçmek istediğiniz işlem ?");
        islem = input.nextInt();

        if(islem == 1){
            recordProduct(input);

        }else if (islem == 2){
            System.out.println("silinecek ürünün id'sini giriniz");
            int productId = input.nextInt();
            deleteProduct(this.urunBilgisi, productId);
            menu();

        }else if (islem == 3){
            products();

        }else{
            System.out.println("doğru işlem seçiniz");
        }

    }


    public static void main(String[] args) {
        Main main = new Main();
        main.menu();


    }
}