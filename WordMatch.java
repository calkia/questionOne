import javax.net.ssl.SSLServerSocketFactory;

//Kiana T - 4/14/26
//hellooo

public class WordMatch{
    private String secret;
    public WordMatch(String word){
        secret = word;
    }

    public int scoreGuess(String guess){
        int occurences = 0;
        for(int i = 0; i<secret.length(); i++){
            if(secret.substring(i, i+ guess.length()).equals(guess)){
                occurences++;
            }
        }
        return occurences*guess.length()*guess.length();
    }

    public String findBeterGuess(String guess1, String guess2){
        int value1 = scoreGuess(guess1);
        int value2 = scoreGuess(guess2);
        if(value1>value2){
            return guess1;
        }
        else if(value2 > value1){
            return guess2;
        }
        else{
            if(guess1.compareTo(guess2) == -1 ){
                return guess1;
            }
            else{
                return guess2;
            }
        }
    }
}