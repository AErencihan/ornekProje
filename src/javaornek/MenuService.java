package javaornek;

import java.util.Map;
import java.util.Scanner;

public class MenuService {

    public void menu(Map<Integer,ProductInfo> productInfoMap){
        System.out.println("1. ürün ekle");
        System.out.println("2. ürün sil");
        System.out.println("3. ürün listele");

        Scanner input = new Scanner(System.in);
        int islem;

        System.out.println("seçmek istediğiniz işlem ?");
        islem = input.nextInt();

        if(islem == 1){
            ProductSaveService productSaveService = new ProductSaveService(this);
            productSaveService.recordProduct(input, productInfoMap);

        }else if (islem == 2){
            System.out.println("silinecek ürünün id'sini giriniz");
            int productId = input.nextInt();
            DeleteProductService deleteProductService = new DeleteProductService(this);
            deleteProductService.deleteProduct(productInfoMap, productId);
            menu(productInfoMap);

        }else if (islem == 3){
            ProductListService productListService = new ProductListService(this);
            productListService.products(productInfoMap);

        }else{
            System.out.println("doğru işlem seçiniz");
        }

    }

}
