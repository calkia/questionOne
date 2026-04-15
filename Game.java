public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level LevelThree;

    public Game(Level l1, Level l2, Level l3){
        levelOne = l1;
        levelTwo = l2;
        LevelThree = l3;
    }

    public boolean isBonus(){
        return true;
    }
    public void play(){}

    public int getScore(){
        int sum = 0;
        if(levelOne.goalReached()){
            sum+= levelOne.getPoints();
            if(levelTwo.goalReached()){
                sum+= levelTwo.getPoints();
                if(LevelThree.goalReached()){
                    sum+= LevelThree.getPoints();
                }
            }
        }
        if(isBonus()){
            sum *= 3;
        }
        return sum;
    }

}
