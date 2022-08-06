package javaornek;

import java.util.Map;

public class DeleteProductService {
    private final MenuService menuService;

    public DeleteProductService(MenuService menuService) {
        this.menuService = menuService;
    }

    public void deleteProduct(Map<Integer, ProductInfo> urunBilgisi, int productId){
        if(urunBilgisi.containsKey(productId)){
            urunBilgisi.remove(productId);
            System.out.println("ürün silindi");
            urunBilgisi.forEach((key, value) -> {
                System.out.println("ürün Id : " + key);
                System.out.println("ürün name : " + value.productName);
            });
            return;
        }
        System.out.println("ürün bulunamadı ");
        menuService.menu(urunBilgisi);
    }
}
