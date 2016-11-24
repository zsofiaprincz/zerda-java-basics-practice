/**
 * Created by zsofiaprincz on 21/11/16.
 */
public class Tree extends Plant {

    public Tree (String color) {
        super(color,0);
    }

    @Override
    public boolean isThirsty() {
        return currentWaterAmount <10;
    }

    @Override
    public void water(int waterPerPlant) {
        currentWaterAmount += (int) ((float)waterPerPlant*0.4);
    }


}
