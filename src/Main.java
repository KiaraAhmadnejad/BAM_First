import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello world!");
        Friend aFriend = new Friend();
        Friend myFriend = new Friend("Kiara");
        Friend falseFriend = new Friend("hej", true);

        System.out.println("afriend has " + aFriend.getHp());
        System.out.println("how much damage?");
        int damage = myScanner.nextInt();
        /*aFriend.hp = 70;
        System.out.println("afriend has " + aFriend.hp);*/


        aFriend.hit(damage);
        System.out.println("afriend has " + aFriend.getHp());

        drawWindow();

        System.out.println(aFriend);

    }

    public static void drawWindow() {
        JFrame frame = new JFrame("Healthbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Healthbar healthbar = new Healthbar();
        healthbar.setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(healthbar);
        frame.pack();
        frame.setVisible(true);
    }


}