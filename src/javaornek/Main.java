package javaornek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final MenuService menuService = new MenuService();
    private final ProductSaveService productSaveService = new ProductSaveService(menuService);
    private final ProductListService productListService = new ProductListService(menuService);
    private final DeleteProductService deleteProductService = new DeleteProductService(menuService);



    public Map <Integer, ProductInfo>  productInfoMap = new HashMap<>();


    public void init(){
         Scanner scanner = new Scanner(System.in);
         productSaveService.recordProduct(scanner,productInfoMap);

     }

    public static void main(String[] args) {
        Main main = new Main();
        main.init();


    }
}