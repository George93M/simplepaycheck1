package PaycheckCalc;

import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {

    // 1 -> >
    // 0 -> =
    // -1 -> <

    @Override
    public int compare(Entity entity1, Entity entity2) {
//        if (entity1.amountReceived() == entity2.amountReceived()) {
//            return 0;
//        } else if (entity1.amountReceived() > entity2.amountReceived()){
//            return 1;
//        } else {
//            return -1;
//        }

        // mai simplu
       return Double.compare(entity1.amountReceived(),entity2.amountReceived());
    }
}
