public class Main {
        // İstediğim kadar sayıyı toplama örneği (Variable arguments)
    public static void main(String[] args) {

        System.out.println(Topla(2,3,4,5));
    }

    public static int Topla(int... sayilar ){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
