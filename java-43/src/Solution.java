import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {

    private Queue<Student> queue;

    public Priorities() {
        queue = new PriorityQueue<>(Comparator
            .comparing(Student::getCgpa).reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getId));
    }

    public List<Student> getStudents(List<String> events) {
        events.stream().forEach(item -> {
            String data[] = item.split(" ");
            switch (data[0]) {
                case "ENTER":
                    String name = data[1];
                    double cgpa = Double.valueOf(data[2]);
                    int id      = Integer.valueOf(data[3]);
                    queue.add(new Student(id, name, cgpa));
                    break;
                case "SERVED":
                    queue.poll();
                    break;
            }
        });

        List<Student> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}