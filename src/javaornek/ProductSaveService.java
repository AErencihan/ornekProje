package javaornek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductSaveService {
    private final MenuService menuService ;

    public ProductSaveService(MenuService menuService) {
        this.menuService = menuService;
    }

    public void recordProduct(Scanner input, Map<Integer,ProductInfo> productInfoMap){

        System.out.println("eklenecek ürünün adını giriniz:");
        String productName = input.next();
        System.out.println("eklenecek ürünün ID'sini giriniz:");
        int productId = input.nextInt();
        System.out.println("eklenecek ürünün fiyatını giriniz");
        int productPrice = input.nextInt();

        ProductInfo productInfo = ProductInfo.record()
                .addProductName(productName)
                .addProductId(productId)
                .addProductPrice(productPrice)
                .recorder();

        saveProduct(productInfo,productInfoMap);
        menuService.menu(productInfoMap);
    }

    public void saveProduct(ProductInfo product, Map<Integer,ProductInfo> productInfoMap){
        productInfoMap.put(product.productId, product);

    }


}
