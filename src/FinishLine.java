public class FinishLine {
    private int randNum;
    private int randNum2;
    private int pos1=1;
    private int pos2=1;
    public FinishLine(int pos){
        this.pos1=pos1;
        this.pos2=pos2;
    }

    public int randNum(){
        int randNum = (int)(Math.random()*6)+1;
        return randNum;
    }
    public int pos2() {
    return pos2;
    }
    public int pos1() {
        return pos1;
    }
    public int determineWin(){
        while(pos1<=10||pos2<=10) {
            int dice = randNum();
            int dice2 = randNum();
            System.out.println("Dice: " + dice);
            System.out.println("Dice2: " + dice);
            if (dice + dice2 == pos1||dice==pos1||dice2==pos1) {
                pos1++;
            }
            System.out.println("Position 1: " + pos1);
           if(pos1==10){
                endGame();
                break;
            }

            int d1 = randNum();
            int d2 = randNum();
            System.out.println("Dice: " + dice);
            System.out.println("Dice2: " + dice);
            if (d1 + d2 == pos2||d1==pos2||d2==pos2) {
                pos2++;
            }
            System.out.println("Position 2: " + pos2);
           if(pos2==10){
                endGame();
                break;
            }
        }
        return pos2;

    }


    public void endGame(){
        if(pos1==10){
            System.out.println( "player 1 wins!");

        }
        if(pos2==10){
            System.out.println("player 2 wins!");

        }

    }

}
