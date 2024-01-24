public class Movie {
    String title = "Glass Onion";
    Person protagonist = new Person();
    int lengthInMinutes = 139;
    boolean releasedInTheatres = true;  
  
    public void makeChange(){
      /*Call one of the change methods below and give it an instance variable as an argument.
      Determine if the original instance variable changed or not!*/
      
      //////////////////////YOUR CODE HERE
      
    }
  
    public void changeTitle(String t){
      t = "Glass Garlic";
    }
  
    public void changeName(Person p){
      p.name = "Bignet";
    }
  
    public void changeLength(int l){
      l = 100;
    }
  
    public void changeRelease(boolean r){
      r = false;
    }
    
      public void printStatus(){
        String rel;
        if(releasedInTheatres == true){
          rel = "was";
        }
        else{
          rel = "was not";
        }
        System.out.println("\nCurrently, the movie called " + title +
                          "\nfeatures a protagonist called " + protagonist.name +
                           ".\nThe movie runs for " + lengthInMinutes +
                           " minutes\nand " + rel + " released in theatres.\n");
      }
  }