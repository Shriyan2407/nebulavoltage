import java.io.FileWriter;

// ================= STACK =================
class EmergencyStack {

    String stack[] = new String[20];
    int top = -1;

    String keywords[] = {
            "ENGINE_FAIL","FUEL_LEAK","COMM_LOSS",
            "NAV_ERROR","OXYGEN_DROP","POWER_FAIL"
    };

    void log(String msg) {
        try {
            FileWriter fw = new FileWriter("emergency.txt", true);
            fw.write(msg + "\n");
            fw.close();
        } catch (Exception e) {}
    }

    void showKeywords() {
        for (int i = 0; i < keywords.length; i++) {
            System.out.println((i + 1) + ". " + keywords[i]);
        }
    }

    void add(int choice) {
        if (top == stack.length - 1) {
            System.out.println("Stack full.");
            return;
        }

        stack[++top] = keywords[choice - 1];
        System.out.println("Emergency: " + stack[top]);

        log("Added: " + stack[top]);
    }

    void resolve() {
        if (top == -1) {
            System.out.println("No emergencies.");
            return;
        }

        String e = stack[top--];
        System.out.println("Resolved: " + e);

        log("Resolved: " + e);
    }

    void display() {
        if (top == -1) {
            System.out.println("No emergencies.");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
