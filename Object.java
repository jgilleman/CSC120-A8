public class Object {

    public String name;
    public int size;
    public String favHat;
    
    /*Constructor makes a worm 
     * @param name
     * @param size
     * @param favHat
    */
    public Object(String name, int size, String favHat) {
        System.out.println("A worm named " + name + " of size " + size + 
        " has spawned on the ground. You telepathically understand his favorite" +
        " hat to be the " + favHat + ".");
        this.name=name;
        this.size=size;
        this.favHat=favHat;
    }
}