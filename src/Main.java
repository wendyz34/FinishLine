public class Main {
    public static void main(String[] args) {
        FinishLine player1 = new FinishLine(1);
        FinishLine player2 = new FinishLine(1);
        System.out.println("Roll the dice to see which player wins");
        while (player1.determineWin() <= 9) {
            player1.determineWin();
            if (player1.pos1() == 10) {
                System.out.println("player 1 wins");
                break;
            }
            if (player2.pos2() == 10) {
                System.out.println("player 2 wins");
                break;
            }
        }


    }
    }
