import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello world!");
        Friend aFriend = new Friend ();
        Friend myFriend = new Friend ("Aleks");
        Friend falseFriend = new Friend("hej", true);

        System.out.println("afriend has " + aFriend.getHp());
        System.out.println("how much damage?");
        int damage= myScanner.nextInt();
        /*aFriend.hp = 70;
        System.out.println("afriend has " + aFriend.hp);*/


        aFriend.hit(damage);
        System.out.println("afriend has " + aFriend.getHp());

        System.out.println(aFriend);

    }
}