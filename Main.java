import java.util.*;

// ================= MAIN =================
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String file = "crew.txt";

        CrewList crew = new CrewList();
        MissionQueue mq = new MissionQueue();
        EmergencyStack es = new EmergencyStack();

        crew.loadFromFile(file);

        int ch;

        do {

            System.out.println("\n===== SPACE MISSION CONTROL =====");
            System.out.println("1. Add Astronaut");
            System.out.println("2. Display Crew");
            System.out.println("3. Sort Crew");

            System.out.println("4. Add Mission");
            System.out.println("5. Launch Mission");
            System.out.println("6. Show Missions");

            System.out.println("7. Add Emergency");
            System.out.println("8. Resolve Emergency");
            System.out.println("9. Show Emergencies");

            System.out.println("10. Save Crew");

            System.out.println("0. Exit");

            System.out.print("Choice: ");

            try {

                ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {

                    case 1:
                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Experience: ");
                        int exp = sc.nextInt();

                        crew.add(name, exp);
                        break;

                    case 2:
                        crew.display();
                        break;

                    case 3:
                        crew.sort();
                        break;

                    case 4:
                        System.out.print("Mission: ");
                        String m = sc.nextLine();

                        mq.add(m);
                        break;

                    case 5:
                        mq.launch();
                        break;

                    case 6:
                        mq.display();
                        break;

                    case 7:
                        es.showKeywords();
                        System.out.print("Choose: ");
                        int e = sc.nextInt();

                        es.add(e);
                        break;

                    case 8:
                        es.resolve();
                        break;

                    case 9:
                        es.display();
                        break;

                    case 10:
                        crew.saveToFile(file);
                        break;

                    case 0:
                        crew.saveToFile(file);
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Invalid input.");
                sc.nextLine();
                ch = -1;
            }

        } while (ch != 0);

        sc.close();
    }
}
