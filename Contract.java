public interface Contract {

    void grab(Object item);
    String drop(Object item);
    void examine(Object item);
    void use(Object item);
    boolean walk(String direction);
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest();
    void undo();

}