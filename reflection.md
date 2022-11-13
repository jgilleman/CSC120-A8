Use this file to record your reflection on this assignment.

- Tell me about your class! What does it represent?

    I have two classes, a bird and a worm (right now it's called object because I didn't know if rewriting that object as "Worm" would mess up the connection to the interface).
    Each worm object has a name, size, and favorite hat. The bird can grab(store in beak), drop(remove from beak), examine(returns name, size, and favorite hat of the worm), and use (prints something ridiculous cause I didn't really know how you would "use" a worm) the worms. The bird can also walk(increments location (x,y) depending on direction inputted), fly(does something similar but on it's own coordinate axis (xUp, yUP)), rest (prints that you take a little rest), and undo(removes everything from your beak and resets location).


- What additional methods (if any) did you implement alongside those listed in the interface?

    I didn't implement any other methods.

    Note: I intentionally used objects instead of strings in my methods since Jordan told us in class that that was ok for this assignment, and that he would post a second version for those of us who want to use objects. I think he forgot to do this so I just changed my own version, which I hope is ok.

- What worked, what didn't, what advice would you give someone taking this course in the future?

    Initially I wanted shrink() and grow() to take in integers, but I wasn't sure if my program would still fit the contract interface if I did that, so I just hardcoded a value instead.

    Although I believe I correctly and fully implemented the interface, the idea of my game requires some functionality I didn't have the time to complete. I'll list this stuff below and their implications: 

    - Some functionality doesn't quite make sense in my code. For example, boolean walk() and boolean fly() just always report back "true", because I didn't have time to implement a cage condition like I wanted to where if the bird was in a cage, false would be returned instead of true and you couldn't increment your location (got this idea from Jordan). 

    - Also, for some reason in my walk() method, the else condition always triggers in addition to whatever string I put in (like "North" or "South").

    - I also never overwrote the toString() method to return names instead of hashcodes. 

    -Finally, I learned that in order to implement the interface methods, you have to declare all the methods public. I find this strange since I don't understand why they would default to private if I told the JVM at the top that I'll be implementing an interface.
