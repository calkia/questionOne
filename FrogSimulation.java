/**
 * Kiana Tjon | 4/16/2026 | Frog Simulation
 */

public class FrogSimulation{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
        return 10; //placeholder number
    }
    public boolean simulate(){
        int frogPos = 0;
        int hops = 0;
        while(frogPos>=0 && frogPos<goalDistance && hops<maxHops){
            frogPos += hopDistance();
            hops++;
        }
        if(frogPos>=goalDistance){
            return true;
        }
        else{
            return false;
        }
    }
    public double runSimulations(int num){
        int pass = 0;
        for(int i = 0; i<num; i++){
            if(simulate()){
                pass++;
            }
        }
        return pass/num;
    }
}