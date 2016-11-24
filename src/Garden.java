import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 21/11/16.
 */
public class Garden extends ArrayList<Plant> {
    public Garden() {
    }

//    ArrayList<Plant>plants;

//    public Garden() {
//        plants = new ArrayList<>();
//    }

    public String water(int amount) {
        int numberOfThirsty = 0;
        for (Plant p : this) { //en vagyok az array list {
            if (p.isThirsty()) {
                numberOfThirsty++;
            }
        }

        int waterPerPlant = (int) ((float) amount / numberOfThirsty);
        //igy osztjuk el a locsolast a plantek kozott. Mivel hogy itt lehet tort is a vege ezert konvertalni kell double-e.

        for (Plant p : this) {
            if (p.isThirsty()) {
                p.water(waterPerPlant);
            }
        }


        return "watering with " + amount;

    }

    @Override
    public String toString() {
        String result = "";
        for (Plant p : this) {
            result += p.toString() + "\n";
        }

        return result;
    }

}


