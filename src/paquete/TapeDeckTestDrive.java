package paquete;

class TapeDeck{

    boolean canRecord= false;
    
    void playTape(){
     System.out.println("Tape Playing");
    }
    
    void recordTape(){
     System.out.println("tape recording");
    }

}

class TapeDeckTestDrive{
    
    public static void main(String[] args){
        TapeDeck t= new TapeDeck (); // hay que crear el objeto t para que se ejecute lo que sigue.
        t.canRecord =true;
        t.playTape();
        
        if (t.canRecord==true){
            t.recordTape();
        }
    }
}



