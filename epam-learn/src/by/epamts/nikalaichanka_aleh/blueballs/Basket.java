package by.epamts.nikalaichanka_aleh.blueballs;

import java.util.ArrayList;

public class Basket {
    ArrayList<Ball> list = new ArrayList<Ball>();

    public Basket() {
    }

    public void throwToBasket(Ball b){
        list.add(b);
    }

    public int blueBallCounter(){
        this.list = list;
        int blueBallCounter = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getColor().equals("blue")){
                blueBallCounter ++;
            }
        }
        return blueBallCounter;
    }

    public int totalBallWeight() {
        this.list = list;
        int totalBallWeight = 0;

        for (int i = 0; i < list.size(); i++) {
            totalBallWeight += list.get(i).getWeight();
        }
        return totalBallWeight;
    }



}
