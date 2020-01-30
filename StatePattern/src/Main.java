public class Main
{
    public static void main(String args[])
    {
        // Create Style Object that holds the current state of Megaman
        // When Megaman uses the same form of attack he will level up
        // Megaman will change to a different Style if he is currently not on that Style and attacks
        //      Style Context member : currentState is then updated to the proper Concrete State
        // When calling Style methods, Style Context is passed into the current referenced Concrete State
        // Using the currentState, we can call the interface StyleState's method using polymorphism and call
        //      proper Concrete State
        // With the passed in Style Context the Concrete State can update Style Context currentState
        // This allows Style Context to change depending on which current StyleState it contains
        // And also allows the Concrete State to call its own methods
        Style megaman = new Style("Megaman.exe");   //**Normal Style Discovered**
        megaman.useBttlChip();                         //**Custom Style Discovered**
                                                       //Evolving to Custom Style LVL1
        megaman.normalOpertion();                      //Evolving to Normal Style LVL2
        megaman.naviCustBug();                         //**Bug Style Discovered**
                                                       //Evolving to Bug Style LVL1
        megaman.normalOpertion();                      //Evolving to Normal Style LVL3
        megaman.normalOpertion();                      //Normal Style LVL4
    }
}