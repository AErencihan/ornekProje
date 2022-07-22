package javaornek;

public class ProductInfo{

    public String productName;
    public int productId;
    public int productPrice;

    public ProductInfo(String productName, int productId, int productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public static Record record(){
        return new Record();
    }

    public static final class Record{
        public String productName;
        public int productId;
        public int productPrice;

        public Record() {

        }

        public Record(String productName, int productId, int productPrice) {
            this.productName = productName;
            this.productId = productId;
            this.productPrice = productPrice;
        }



        public Record addProductName(String productName){
            this.productName = productName;
            return this;
        }

        public Record addProductId(int productId){
            this.productId = productId;
            return this;
        }

        public Record addProductPrice(int productPrice){
            this.productPrice = productPrice;
            return this;
        }
        public ProductInfo recorder(){
            return new ProductInfo(productName, productId, productPrice);
        }

    }







    public void showInfo(){
        System.out.println("urunun adı :" +this.productName);
        System.out.println("urunun Id'si : "+this.productId);
        System.out.println("urunın fiyati : "+this.productPrice);

    }









}

