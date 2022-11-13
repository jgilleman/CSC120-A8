import java.util.ArrayList;

public class Bird implements Contract
{
    /*Attributes */
    public ArrayList<Object> beak = new ArrayList<Object>(); // Create an ArrayList object
    public int location;
    public Object worm;
    public int xGround;
    public int yGround;
    public String name;
    public int weight;

    /*Constructor makes bird 
     * @param String name
    */
    public Bird(String name) {
        System.out.println("Your name is " + name + 
        ", a bird who can grab, drop, examine, use, walk, fly, rest, and undo.");
        this.name = name;
    }

    /* Method Grabs a worm off the ground 
     *@param Object item
    */
    public void grab(Object item) {
        beak.add(item);
        System.out.println("You grabbed a worm off the ground with your beak. His name is " + item.name + ".");
        System.out.println("You now are carrying" + this.beak + ".");
    }

    /* Method Removes worm from beak 
     *@param Object item
     *@return String
    */
    public String drop(Object item) {
        if (beak.contains(item)){
            beak.remove(item);
            System.out.println("You dropped " + item + " :O");
            System.out.println("You now are carrying" + this.beak + ".");
        } else {
            System.out.println(item + " is not in beak. Try something else.");
        }
        return ""; //How do I get it to return the above strings instead?
    }
    
    /* Method Examine the worm's size and texture 
     * @param Object item
    */
    public void examine(Object item) {
        System.out.println(item.name + " is size " + item.size + ", is " + item.favHat + 
        " and is noticeably a worm.");
    }

    /* Method Use the worm 
     * @param Object item
    */
    public void use(Object item) {
        if (beak.contains(item)) {
            System.out.println("You ponder what it means to use a worm. You end up deconstructing " + item.name + 
            " into atoms and rearrange him into a computer which you then use to play a better game" +
            " than this weird one about worms and birds.");
            beak.remove(item);
        } else {
            System.out.println("Cannot use " + item + " since he's not in the beak. Try again.");
        }
    }

    /* Method Walk 
     * @param String direction
     * @return boolean
    */
    public boolean walk(String direction) {
        if (direction == "North") {
            yGround=+1;
        } if (direction == "South") {
            yGround=-1;
        } if (direction == "East") {
            xGround=+1;
        } if (direction == "West") {
            xGround=-1;
        } else { //Why is this one always triggering even when I write the correct string?
            System.out.println("Didn't enter one of the options. You can walk North, South, East, or West.");
        }
        System.out.println(this.name + " walked and is now at location " + xGround + ", " + yGround + ".");
        return true;
    }

     /* Method Fly
      * @param Int xUp
      * @param int yUP
      * @return boolean
     */
    public boolean fly(int x, int y) {
        this.weight=0;
        //all the worm weights added up
        for(int i=0; i<beak.size(); i++) {
            this.weight += beak.get(i).size;
            System.out.println("This worm's size is :" + beak.get(i).size + ". The total weight now reads " + this.weight);
        }
        if (this.weight>25) {
            System.out.println("The worms are too heavy to fly with!");
        } if ((this.weight<25)) {
            System.out.println(this.name + " flew and is now at location " + x + ", " + y + "."); //doesn't work for more than one fly request
        }
        return true;
    }

    /* Mtehod Shrinks the worm 
     * @return Number
    */
    public Number shrink() {
        for(int i=0; i<beak.size(); i++) {
            beak.get(i).size -= 10;
        }
        System.out.println("The worms have all shrunk in size by this many cm: " + 10);
        return 10;
    }

    /* Method Grows the worm 
     * @return Number
    */
    public Number grow() {
        for(int i=0; i<beak.size(); i++) {
            beak.get(i).size += 10;
        }
        System.out.println("The worms have all grown in size by this many cm: " + 10);
        return 10;
    }

    /* Method Gives bird a rest */
    public void rest() {
        System.out.println("You have gone too fast. It's time for a lil break to rest your lil feets/wings.");
    }

    /*Method Undo*/
    public void undo() {
        this.xGround=0;
        this.yGround=0;
        for(int i=0; i<beak.size(); i++) { //for some reason it leaves a single worm
            beak.remove(i);
        }
        System.out.println("You, a sweet little bird boy, wish to start anew. Reseting location to zero. Dropping all worms.");
        System.out.println(this.name + " is now at location " + this.xGround + ", " + this.yGround + ". You check your beak: " + this.beak + ". It has no worms (theoretically).");
    }
    
    /*Main for Testing */
    public static void main(String[]args) {
        System.out.println("----START---GAME----");
        Bird myBird = new Bird("Gerald");
        Object tony = new Object("Tony", 20, "top hat");
        Object wormelda = new Object("Wormelda", 10, "baseball cap");
        Object billy = new Object("Billy", 20, "beret");
        System.out.println("-------");

        myBird.grab(tony);
        myBird.grab(wormelda);
        myBird.grab(billy);
        myBird.drop(tony);
        System.out.println("-------");

        myBird.walk("North");
        myBird.grow();
        myBird.fly(4,5);
        System.out.println("-------");

        myBird.shrink();
        myBird.fly(4,5);
        System.out.println("-------");

        myBird.use(wormelda);
        System.out.println("-------");
        
        myBird.rest();
        myBird.undo();

        System.out.println("----END---GAME----");
    }

}
