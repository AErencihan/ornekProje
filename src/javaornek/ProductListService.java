package javaornek;

import java.util.Map;

public class ProductListService {
    private final MenuService menuService;

    public ProductListService(MenuService menuService) {
        this.menuService = menuService;
    }

    public void products(Map<Integer, ProductInfo> productInfoMap){
        productInfoMap.forEach((key, value) -> {
            System.out.println("ürün ID : " + key);
            System.out.println("ürün Name : " + value.productName);
        });
        menuService.menu(productInfoMap);
    }
}
