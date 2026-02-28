package capgemeini_training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SMS_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();
        Set<String> login = new HashSet<>();
        Map<String, Integer> marks = new HashMap<>();
        Map<String, Boolean> pdfStatus = new HashMap<>();

        while (true) {
            System.out.println("1 Registration");
            System.out.println("2 Login");
            System.out.println("3 Open PDF");
            System.out.println("4 Close PDF");
            System.out.println("5 Total Marks");
            System.out.println("6 Exit");
            System.out.print("Choose option: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter numbers only");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter username: ");
                    String regUser = sc.nextLine();
                    System.out.print("Enter password: ");
                    String regPass = sc.nextLine();

                    users.put(regUser, regPass);
                    marks.put(regUser, 0);
                    pdfStatus.put(regUser, false);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter password: ");
                    String pwd = sc.nextLine();

                    if (users.containsKey(uname) && users.get(uname).equals(pwd)) {
                        login.add(uname);
                    }
                    break;

                case 3:
                    System.out.print("Enter username: ");
                    String pdfOpen = sc.nextLine();

                    if (login.contains(pdfOpen)) {
                        pdfStatus.put(pdfOpen, true);
                    }
                    break;
                case 4:
                    System.out.print("Enter username: ");
                    String pdfClose = sc.nextLine();

                    if (login.contains(pdfClose)) {
                        pdfStatus.put(pdfClose, true);
                    }
                    break;

                case 5:
                    System.out.print("Enter username- ");
                    String markUser = sc.nextLine();

                    System.out.print("Enter marks to add- ");
                    try {
                        int newMarks = Integer.parseInt(sc.nextLine());
                        marks.put(markUser, marks.get(markUser) + newMarks);
                        System.out.println("Total Marks- " + marks.get(markUser));
                    } catch (Exception e) {
                        System.out.println("Invalid marks");
                    }
                    break;

                case 6:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Choose correct option");
            }
        }
    }
}
