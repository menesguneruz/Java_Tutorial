public class Main {

    public static void main(String[] args) {

        int[] numbers = new int [] {1,5,9,7,0,8};
        int wanted = 12;
        boolean isThere = false;

        for (int number : numbers)
        {
            if(number == wanted){
                isThere = true;
                break;
            }
        }

        if(isThere){
            System.out.println("Sayi bulundu");
        }else{
            System.out.println("Sayi bulunamadı");
        }
    }
}
