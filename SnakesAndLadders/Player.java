class Player {
    
    String name;
    Integer position;
    public Player(String name) {
        this.name = name;
        this.position = 0;
    }
    
    int turn(int numberOfDice){

        int sum=0;
        for(int i=0;i<numberOfDice;i++){
            sum = sum + 1 + (int)(Math.random() * ((6 - 1) + 1));
        }
        return sum;
        
    }
}
