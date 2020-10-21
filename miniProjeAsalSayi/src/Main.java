public class Main {


    public static void main(String[] args) {

        int a = 7, b = -1;

        AsalMi(b);

    }

    public static void AsalMi(int sayi){
        boolean asalMi = true;

        if(sayi == 2 && sayi == 1){
            System.out.println("Sayi asaldir.");
            return;
        }else if(sayi < 1){
            System.out.println("Gecersiz sayi");
            return;
        }

        for (int i = 2; i < sayi; i++){
            if(sayi % i == 0){
                asalMi = false;
            }
        }

        if(asalMi){
            System.out.println("Sayi asaldir.");
        }
        else{
            System.out.println("Sayi asal degildir.");
        }


    }
}
