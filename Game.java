public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game(Level l1, Level l2, Level l3){
        levelOne = l1;
        levelTwo = l2;
        levelThree = l3;
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
                if(levelThree.goalReached()){
                    sum+= levelThree.getPoints();
                }
            }
        }
        if(isBonus()){
            sum *= 3;
        }
        return sum;
    }
    public int playManyTimes(int num){
        int highScore = 0;
        for(int i = 0; i<num; i++){
            play();
            if(getScore()>highScore){
                highScore = getScore();
            }
        }
        return highScore;
    }

}
