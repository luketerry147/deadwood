public class Player implements Dice{
   
   public Player(){
   }
   private int rank;
   private int money;
   private int credits;
   private boolean acting = false;
   private int rehearsalcount;
   private Room position;
   private boolean turnOver = false;

   public int getRank(){
      return rank;
   }
   private void setRank(newrank){
      this.rank = newrank;
   }

   }
   public int addMoney(int pay){
      return (this.money + pay);
   }
   public int addCredit(int pay){
      return (this.credits + pay);
   }
   public boolean isActing(){
      return acting;
   }
   public int rehearse(){
      turnOver = true;
      return (rehearsalcount + 1);      
   }
   public void move(){
      string input;
      boolean inputGood = false;
      turnOver = true;
      Room[] moveOptions = position.getAdjacentRooms();
      int numAdjRooms = moveOptions.length();
      System.out.println("The rooms you can go to are:")
      for(int i = 0; i < numAdjRooms; i++){
         System.out.println( "\t", moveOptions[i].getName())
      }
      //ask which rooms to go to
      while(!inputGood){
         for(int i = 0; i < numAdjRooms; i++){
            if(strcmp(input, moveOptions[i].getName())){
               inputGood = true;
            }
         }
         System.out.println("That wasn't good input, the adjacent rooms to choose from are:")
         for(int i = 0; i < numAdjRooms; i++){
            System.out.println("\t", moveOptions[i].getName());
         }
      }
      this.position = moveOptions[i];
      if(strcmp(this.position.getRoomType(), "Scene")){
         Role roleTaken = chooseRole(this.position);
      }
   }
   public int upgrRank(int newrank){
      int inputGood = 1;
      if(this.position == castingOffice){
        System.out.println("Do you want to pay for your new rank with money or credit?");
        while(inputGood){
          //get player input
          if(strcmp(input, "money") && (this.money > this.position.rankCostMoney[newrank])){
            setRank(newrank);
            inputGood = 0;
          }else if(strcmp(input, "credit") && (this.credits > this.position.rankCostCredits[newrank])){
            setRank(newrank);
            inputGood = 0;
          }else if(strcmp(input, "quit"){
            inputGood = 0;
          }else if(!strcmp(input, "credit") || !strcmp(input, "money"){
            System.out.println("Wrong input! Please input either money or credit for your preferred method of payment!");
          }else{
            System.out.println("You don't have sufficient money/credit for that! Please choose a different payment method or type quit to stop");
          }
        }
    }
  }
   public int rollDice(int numDice){
      
   }
   
   
}
