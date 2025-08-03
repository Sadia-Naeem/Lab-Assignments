public class ToyMain {
    public static void main(String[] args) {
        // Create instances of CuddlyToy subclasses
        EngineDriver engineDriver = new EngineDriver();
        engineDriver.show();
        engineDriver.describe();
        engineDriver.MakeNoise();
       
        Gardner gardner = new Gardner();
        gardner.show();
        gardner.describe();
        gardner.MakeNoise();

        Clown clown = new Clown();
        clown.show();
        clown.describe();
        clown.MakeNoise();
        
        BankManager bankManager = new BankManager();
        bankManager.show();
        bankManager.describe();
        bankManager.MakeNoise();
   }
} 