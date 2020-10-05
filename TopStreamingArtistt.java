/*
 * Samantha Persad
 */
package topstreamingartist;

// TopStreamingArtist class
public class TopStreamingArtist {

    private Artist first;

    private Artist last;

    // inner class Artist
    class Artist {

        // data fields
        private String name;

        private Artist next;

        // constructor for Artist class
        public Artist(String name) {

            this.name = name;

            this.next = null;

        }

    }

    // constructor for TopStreamingArtist class
    public TopStreamingArtist() {

        // initializing first and last to null
        first = null;

        last = null;

    }

    // isEmpty method
    public boolean isEmpty() {

        return (first == null);

    }

    // insert method
    void insert(String name) {

        // creating new artist object
        Artist newArtist = new Artist(name);

        if (this.isEmpty()) {

            // if this list is empty
            // setting first and last to newArtist
            first = newArtist;

            last = newArtist;

        } else {

            // otherwise setting last.next to newArtist
            last.next = newArtist;

            // last to newArtist
            last = newArtist;

        }

    }

    // sortList ...to sort names
    public void sortList() {

        // initialising current and index
        Artist current = first, index = null;

        String temp; // to store temporary name

        if (this.isEmpty()) {

            // if empty return
            return;

        } else {

            // otherwise
            while (current != null) {

                // setting index to current -> next
                index = current.next;

                while (index != null) {

                    // if current ->name is alphabetically higher then index->name the swap them
                    if (current.name.compareTo(index.name) > 0) {

                        temp = current.name;

                        current.name = index.name;

                        index.name = temp;

                    }

                    index = index.next; // increment index

                }

                current = current.next; // increment current

            }

        }

    }

    // displayNames() method
    public void displayNames() {

        // setting current to first
        Artist current = first;

        this.sortList(); // calling sortList to sort it

        if (this.isEmpty()) {

            // if empty print message and return
            System.out.println("List is empty");

            return;

        }

        while (current != null) {

            // other while current is not null
            // print the names
            System.out.println(current.name);

            current = current.next; // inrement current

        }

    }

    public static void main(String[] args) {

        // creating object of TopStreamingArtist class
        TopStreamingArtist artistNames = new TopStreamingArtist();

        // adding some names
        artistNames.insert("Mood (feat Ian Dior) by 24kGolden");

        artistNames.insert("Wap (feat Megan The Stallion) by Card B");

        artistNames.insert("Lemonade (feat Gunna, Don Toliver & NAV) by Internet Money");

        artistNames.insert("Hawai by Maluma");

        artistNames.insert("Dynamite by BTS");

        artistNames.insert("Holy (feat Chance the rapper) by Justin Bieber");

        artistNames.insert("Blinding Lights by the Weekend");

        artistNames.insert("Watermelon Sugar by Harry Styles\n" +
"");

        artistNames.insert("For the Night(feat DaBaby and Lil Baby) by Pop smoke");
         artistNames.insert("Savage Love (Laxed - Siren Beat) by Jawsh 385, Jason Derulo");
          artistNames.insert("Laugh now cry later( feat Lil Durk) by Drake");
          artistNames.insert("Rockstar( feat Roddy Rich)by. Dababy");
          artistNames.insert("Head and heart( feat MNEK) y Joel Corry");

        // calling displauyNames ot print them
        artistNames.displayNames();

    }

}


