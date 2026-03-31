import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// ================= LINKED LIST =================
class CrewList {

    AstronautNode head;

    void loadFromFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) return;

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String parts[] = line.split(",");
                add(parts[0], Integer.parseInt(parts[1]));
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }

    void saveToFile(String path) {
        try {
            FileWriter fw = new FileWriter(path);

            AstronautNode temp = head;
            while (temp != null) {
                fw.write(temp.data.name + "," + temp.data.experience + "\n");
                temp = temp.next;
            }

            fw.close();
            System.out.println("Crew saved.");

        } catch (IOException e) {
            System.out.println("File error.");
        }
    }

    void add(String name, int exp) {
        AstronautNode newNode = new AstronautNode(new Astronaut(name, exp));

        if (head == null) head = newNode;
        else {
            AstronautNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("No astronauts.");
            return;
        }

        AstronautNode temp = head;
        while (temp != null) {
            System.out.println(temp.data.name + " - " + temp.data.experience + " yrs");
            temp = temp.next;
        }
    }

    // SORT (Selection Sort)
    void sort() {
        for (AstronautNode i = head; i != null; i = i.next) {

            AstronautNode max = i;

            for (AstronautNode j = i.next; j != null; j = j.next) {
                if (j.data.experience > max.data.experience)
                    max = j;
            }

            Astronaut temp = i.data;
            i.data = max.data;
            max.data = temp;
        }

        System.out.println("Crew sorted by experience.");
    }
}
