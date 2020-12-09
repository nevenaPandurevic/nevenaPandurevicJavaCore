package one;

import javax.swing.*;

public class UserLevel {
    public static void main(String[] args) {
        String userLevelText = JOptionPane.showInputDialog("Unesi nivo pristupa");
        int userLevel = Integer.parseInt(userLevelText);
        System.out.println("Regular user level " + (userLevel == 1));
        System.out.println("Admin user level " + (userLevel == 2));
        System.out.println("Super admin user level " + (userLevel == 4));
    }
}
