public class Main {

    public static void main(String[] args) {

        String message = "It's sunny today."; //String bir char arraydir.
        System.out.println(message);

        /*System.out.println("Eleman sayısı : " + message.length());
        System.out.println("6. eleman : " + message.charAt(5));
        System.out.println(message.concat("Let's walk together!")); //Message değişkeninin değerini değiştirmez.
        System.out.println(message.startsWith("I")); //True döndürür.
        System.out.println(message.endsWith("E")); // False döndürür.

        char [] characters = new char[5];
        message.getChars(0,5,characters,0);

        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf("nny"));*/

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(3,12)); //3. ve 12. indexler arasını kes.


    }
}
