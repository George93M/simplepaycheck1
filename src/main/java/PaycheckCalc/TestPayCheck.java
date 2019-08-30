package PaycheckCalc;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPayCheck {

    public static void main(String[] args) {

        List<Entity> entityList = createEntityList();
        List<Entity> rearreangedEntityList = rearrangeEntities(entityList);

         double salaryFromCluj = computeAmountReceivedPerCity(entityList,"Cluj-Napoca");
        System.out.println("Salariul din Cluj-Napoca este:" + salaryFromCluj);

        System.out.println(rearreangedEntityList);


    }

    public static List<Entity> createEntityList() {

        Professor professor = new Professor("Cluj-Napoca", 2500);
        Professor professor2 = new Professor("Dej", 3500);
        Professor professor3 = new Professor("Targu-Mures", 2100);
        Professor professor4 = new Professor("Timisoara", 2800);

        Student student = new Student("Cluj-Napoca", 800);
        Student student2 = new Student("Arad", 1100);
        Student student3 = new Student("Iasi", 1400);
        Student student4 = new Student("Cluj-Napoca", 1200);
        Student student5 = new Student("Cluj-Napoca", 800);
        Student student6 = new Student("Cluj-Napoca", 700);

        List<Entity> entities = new ArrayList<>();
        entities.add(professor);
        entities.add(professor2);

        entities.add(student);
        entities.add(student2);

        return entities;
    }


    public static List<Entity> rearrangeEntities(List<Entity> entities) {
        List<Entity> students = new ArrayList<>();
        List<Entity> professors = new ArrayList<>();
        for (Entity e : entities) {
            if (e instanceof Student) {
                students.add(e);
            } else if (e instanceof Professor) {
                professors.add(e);
            }
        }
        Collections.sort(students, new EntityComparator());
        Collections.sort(professors, new EntityComparator());
        Collections.reverse(professors);
        entities.clear();
        entities.addAll(professors);
        entities.addAll(students);
        return entities;
    }

    public static double computeAmountReceivedPerCity(List<Entity> entities, String city) {
        double sum = 0;
        for (Entity e : entities) {
            if (e.getCity().equals(city)) {
                sum = sum + e.amountReceived();
            }

        }
        return sum;
    }
}



