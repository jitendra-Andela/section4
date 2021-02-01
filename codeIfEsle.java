public class codeIfEsle {
    public static void main(String[] args) {
        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;
//        if(score<4000&&score>1000) {
//            System.out.println("your score will be 5000 not 4000");
//        }
//        else if(score<1000){
//            System.out.println("your score was less than 1000");
//        }
//        else {
//            System.out.println("this was executed");
//        }

//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score" + finalScore);
//
//
//            int savedFinalScore = finalScore;
//            System.out.println("savedFinalScore=" + savedFinalScore);
//        }
        boolean newGameOver=true;
        int newscore=10000;
        int newlevelCompleted=8;
        int newbonus=200;
        if(newscore==10000)
            System.out.println("printed information is true");
        if(newGameOver==true){
            int finalScore=newscore+(newlevelCompleted*newbonus);
            System.out.println("finalScore="+finalScore);
        }

    }
}
