public class CuddlyToy {
    // main grandparent class
    protected String size;
    protected String color;
    protected String job;
    
    public CuddlyToy(String size, String color, String job) {
        this.size = size;
        this.color = color;
        this.job = job;
    }

    public void show() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Job: " + job);
    }
    
    public void describe() {
        System.out.println("I am a " + color + " toy");
        System.out.println("I am " + size + " in size"); 
        System.out.println("My job is " + job + " toy");
    }

    public void MakeNoise() {
        System.out.println(); 
    }
}
// sub parent class of CuddlyToy 
class Teddy extends CuddlyToy { 
    public Teddy(String size, String color, String job) {
         super(size, color, job);
    
    }
}

// sub parent class of cuddlyToy
class Bunny extends CuddlyToy {
    public Bunny(String size, String color, String job) {
        super(size, color, job);
    }
}
// first child class of Teddy
class EngineDriver extends Teddy {
      public EngineDriver() {
        super("2 Feet", "Green", "Driver");
      }
      // using override to add diffrent noises in makeNoise method
      @Override
      public void MakeNoise() {
        System.out.println("Vroom! Vroom!");
      }
      // using override to add diffrent description in describe method
      @Override
      public void describe() {
        System.out.println("I am a " + color + " Engine Driver toy");
        System.out.println("I am " + size + " in size");
        System.out.println("My job is to drive the Drive engines!");
      }
}
// second child class of Teddy
class Gardner extends Teddy {
    public Gardner() {
        super("1 Feet", "Brown", "Gardner");
    }

    @Override
    public void MakeNoise() {
        System.out.println("Chop! Chop!");
}
    
    @Override
    public void describe() {
        System.out.println("I am a " + color + " Gardner toy");
        System.out.println("I am " + size + " in size");
        System.out.println("My job is to plant trees in the garden!");
    }
}
// first child class of Bunny
class Clown extends Bunny {
    public Clown() {
        super("3 Feet", "Red", "Clown");
    }
    
    @Override
    public void MakeNoise() {
        System.out.println("Peek-a-boo!");
    }
    
    @Override
    public void describe() {
        System.out.println("I am a " + color + " Clown toy");
        System.out.println("I am " + size + " in size");
        System.out.println("My job is make jokes and do majic!");
    }
}
// second child class of Bunny
class BankManager extends Bunny {
    public BankManager() {
        super("2 Feet", "Blue", "Bank Manager");
    }
    
    @Override
    public void MakeNoise() {
        System.out.println("Ting! Ting!");
    }
    
    @Override
    public void describe() {
        System.out.println("I am a " + color + " Bank Manager toy");
        System.out.println("I am " + size + " in size");
        System.out.println("My job is to manage the bank!");
    }
  }





