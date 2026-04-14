public class Feeder{
    private int currentFood;
    public Feeder(int food){
        currentFood = food;
    }

    public void simulateOneDay(int numBirds){
        int conditions = (int)(Math.random()*100)+1;
        if(conditions>95){
            currentFood = 0;
        }
        else{
            int foodAte = (int)(Math.random()*40)+10;
            currentFood -= foodAte*numBirds;
            if(currentFood<0){
                currentFood = 0;
            }
        }
    }

    public int simulateManyDays(int numBirds, int numDays){
        int count = 0;
        while(currentFood != 0 && count <= numDays){
            simulateOneDay(numBirds);
            count++;
        }
        return count;
    }
}