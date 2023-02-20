public class Main {
    public static void main(String[] args) {
        FinishLine player1 = new FinishLine(1);
        //FinishLine player2 = new FinishLine(1);
        boolean turn = true;
        boolean turn2 = false;
        System.out.println("Roll the dice to see which player wins");
        while(player1.determineWin()<=10){
            player1.determineWin();
        }
        player1.endGame();
        //player2.endGame();


    }
}