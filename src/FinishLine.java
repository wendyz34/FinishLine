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
                break;
            }
            //return pos1;
            int d1 = randNum();
            int d2 = randNum();
            System.out.println("Dice: " + dice);
            System.out.println("Dice2: " + dice);
            if (d1 + d2 == pos2||d1==pos2||d2==pos2) {
                pos2++;
            }
            System.out.println("Position 2: " + pos2);
            if(pos1==10){
                break;
            }
        }
        return pos2;

    }
    /*public int determineWin(){
        while(pos1!=10) {
            int dice = randNum();
            int dice2 = randNum();
            System.out.println("Dice: " + dice);
            System.out.println("Dice2: " + dice);
            if (dice + dice2 == pos1||dice==pos1||dice2==pos1) {
                pos1++;
            }
            System.out.println("Position 1: " + pos1);
        }
            return pos1;


    }
    public int determineWin2(){
        while(pos2!=10) {
            int dice = randNum();
            int dice2 = randNum();
            System.out.println("Dice: " + dice);
            System.out.println("Dice2: " + dice);
            if (dice + dice2 == pos2||dice==pos2||dice2==pos2) {
                pos2++;
            }
            System.out.println("Position 2: " + pos2);
        }
        return pos2;
    }*/
    public String endGame(){
        if(pos1==10){
            return "player 1 wins!";
            //System.exit(0);
        }
        if(pos2==10){
            return "player 2 wins!";
            //System.exit(0);
        }
        return "tie";
    }

}
