// ================= QUEUE =================
class MissionQueue {

    String queue[] = new String[20];
    int front = -1, rear = -1;

    void add(String m) {
        if (rear == queue.length - 1) {
            System.out.println("Queue full.");
            return;
        }

        if (front == -1) front = 0;

        queue[++rear] = m;
        System.out.println("Mission added.");
    }

    void launch() {
        if (front == -1 || front > rear) {
            System.out.println("No missions.");
            return;
        }

        System.out.println("Launching: " + queue[front]);

        front++;
        if (front > rear) front = rear = -1;
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue empty.");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}
