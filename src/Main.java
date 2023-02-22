public class Main {
    public static void main(String[] args) {
        FinishLine player1 = new FinishLine(1);
        FinishLine player2 = new FinishLine(1);
        boolean turn = true;
        boolean turn2 = false;
        System.out.println("Roll the dice to see which player wins");
        while (player1.determineWin() <= 9) {
            player1.determineWin();
            // player1.endGame();
            if (player1.pos1() == 10) {
                System.out.println("player 1 wins");
                break;
            }
            if (player2.pos2() == 10) {
                System.out.println("player 2 wins");
                break;
            }
        }


        //player2.endGame();

    }
    }
