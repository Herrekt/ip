import java.util.ArrayList;
import java.util.List;

interface Timetable {
    List<Timetable> thingsToDo = new ArrayList<>();

    String getDescription();
    void finishTask();

    static void addTasks(Timetable task) {
        thingsToDo.add(task);
        System.out.println("  " + task.toString());
    }

    static void getTasks() {
        System.out.println("Here are the tasks in your list:");
        for (int i = 0; i < thingsToDo.size(); i++) {
            System.out.println((i + 1) + ". " + thingsToDo.get(i).toString());
        }
    }

    static List<Timetable> getThingsToDo() {
        return thingsToDo;
    }

    static int size() {
        return thingsToDo.size();
    }
}
