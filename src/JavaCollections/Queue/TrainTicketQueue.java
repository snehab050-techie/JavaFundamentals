package JavaCollections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TrainTicketQueue {
    static void main() {
        Queue<Integer> passengerId = new PriorityQueue<>();
        passengerId.add(12);

        System.out.println(passengerId);

    }
}
