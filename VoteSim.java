 import java.util.Scanner;
public class VoteSim {
    static int bjp = 0, congress = 0, brs = 0, bsp = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of voters: ");
        int totalVoters = sc.nextInt();

        for (int i = 0; i < totalVoters; i++) {
            System.out.print("Voter " + (i + 1) + " - Age: ");
            int age = sc.nextInt();

            if (age < 18) {
                System.out.println("Under 18 - No vote!");
                continue;
            }

            System.out.print("Choose: 1-BJP 2-Congress 3-BRS 4-BSP: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                bjp++;
            } else if (choice == 2) {
                congress++;
            } else if (choice == 3) {
                brs++;
            } else if (choice == 4) {
                bsp++;
            }
        }

        System.out.println("\n=== VOTING RESULTS ===");
        System.out.println("BJP: " + bjp);
        System.out.println("Congress: " + congress);
        System.out.println("BRS: " + brs);
        System.out.println("BSP: " + bsp);
        System.out.println("Total valid votes: " + (bjp + congress + brs + bsp));

        // Winner calculation using if-else only
        System.out.println("\n=== WINNER ===");
        if (bjp >= congress && bjp >= brs && bjp >= bsp) {
            System.out.println("WINNER: BJP");
        } else if (congress >= bjp && congress >= brs && congress >= bsp) {
            System.out.println("WINNER: Congress");
        } else if (brs >= bjp && brs >= congress && brs >= bsp) {
            System.out.println("WINNER: BRS");
        } else {
            System.out.println("WINNER: BSP");
        }

        sc.close();
    }
}