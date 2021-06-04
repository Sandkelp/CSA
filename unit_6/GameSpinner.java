
public class GameSpinner{
    private int sectors;// initalizes the sectors
    public int turnNum;// initalizes the turnNum

    public GameSpinner(){ //gamespinner default obj
        this.sectors = 0;
        this.turnNum = 0;
    }
    public GameSpinner(int NumOfSectors){ //game spinner obj
        this.sectors = NumOfSectors; 
        this.turnNum = 0;
    }
    public int spin(){ //spin method
        this.turnNum++; // adds a turn to turn nums
        return (int) (Math.random() * this.sectors + 1); //gets random num from 1-4
    }
    public int currentRun(){//turnnum method
        return turnNum;
    }
    
}