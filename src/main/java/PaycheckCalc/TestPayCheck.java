package PaycheckCalc;

import java.util.ArrayList;
import java.util.List;

public class TestPayCheck {

    public static void main(String[] args) {


        Professor professor = new Professor("Cluj-Napoca", 2500);
        Professor professor2 = new Professor("Dej", 3500);

        Student student = new Student("Zalau", 800);
        Student student2 = new Student("Arad", 1100);

        

        List<Entity> entities = new ArrayList<>();

        entities.add(student);
        entities.add(student2);
        entities.add(professor);
        entities.add(professor2);


        int i;
        for (i=0; i<4; i ++){
            System.out.println(entities.get(i) + " ");
        }


    }
}
