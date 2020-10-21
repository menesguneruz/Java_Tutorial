public class Main {

    public static void main(String[] args) {
        //DortIslem dortIslem = new DortIslem();
        //int sonuc1 = dortIslem.Topla(7, 5);
        //int sonuc2 = dortIslem.Bol(8,2);

        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 30;
        
        System.out.println(product.name);
    }
}
