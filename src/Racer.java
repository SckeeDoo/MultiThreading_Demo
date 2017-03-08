/**
 * Created by schiduvasile on 3/8/17.
 */
public class Racer implements Runnable {
    public static String winner;

    public void race() {
        for(int step = 1 ; step <= 100 ; step++) {
            System.out.println("Step made by " + Thread.currentThread().getName()+". Until now " + step + " steps.");
            boolean isRaceWon = this.isRaceWon(step);

            if(isRaceWon) {
                break;
            }
        }

    }


    public boolean isRaceWon(int totalDistanceCovered) {
        boolean isRaceWon = false;

        if(Racer.winner == null && totalDistanceCovered == 100) {
            String winnerName = Thread.currentThread().getName();
            Racer.winner = winnerName;
            System.out.println("The winner is " + Racer.winner);
            isRaceWon = true;
        }
        else if(Racer.winner == null) {
            isRaceWon = false;
        }
        else  if(Racer.winner != null) {
            isRaceWon = true;
            }
    return isRaceWon;
    }

    @Override
    public void run() {
        this.race();
    }
}
