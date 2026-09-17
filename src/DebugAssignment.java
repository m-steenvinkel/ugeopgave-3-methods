public class DebugAssignment {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int a = 7, b = 42;

        //Erklæret int smaller, ellers bliver bliver værdien fra metoden ikke gemt
        int smaller = minimum(a,b);

        // Udskiftet {} med ()
        if (smaller == a) {

            //Udskiftet "a" med a
            System.out.println(a + " is the smallest!");

        //Tilføjet else if med b er smallest
        } else if (smaller == b) {

            System.out.println(b + " is the smallest!");
        }

    }
    //Udskiftet void med int så den kan returnere
    int minimum(int a, int b) {
        //Erklæret smaller
        int smaller = 0;

        if (a < b) {

            // fjernet int da smaller er erklæret
            smaller = a;

        //Tilføjet if efter else
        } else if (a >= b) {

            // fjernet int da smaller er erklæret
            smaller = b;

        }
        // fjernet int da smaller er erklæret
        return smaller;

    }
}
