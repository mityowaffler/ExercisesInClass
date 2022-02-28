import java.util.concurrent.ThreadLocalRandom;

public class Lecc2 {

    public static void main(String[] args) {

        /*String name = "Mityo";
        String lastName = new String( "Petkov");

        if (name.equals("Mityo") && lastName.equals("Petkov")) {
            System.out.println("The name is: Mityo Petkov");
        }

        if (name.equals("Mityo")) {
            System.out.println("The name is Mityo");
        } else {
            System.out.println("The name is not Mityo");
        }
        */

        int randomNum = ThreadLocalRandom.current().nextInt(-100,100+1);
        System.out.println(randomNum);

        if (randomNum >0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }

        int ranNum = ThreadLocalRandom.current().nextInt(-100,100+1);
        System.out.println(ranNum);

        String result = (ranNum > 5)? "Show this if positive number" : "If negative you would see that";

        System.out.println(result);


    }
}
