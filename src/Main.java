import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Lord of the Rings", "JR Tolken", 10);
        Book b2 = new Book("Harry Potter", "JK Rolling", 15);
        Book b3 = new Book("unpublished book", "Unknown", 0);

        //System.out.println(b1.getBookDetails());

        Book[] bookArray = new Book[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

//        for (int i = 0; i < bookArray.length; i++) {
//            System.out.println(bookArray[i].getName());
//        }

        for (Book b : bookArray) {
            //System.out.println(b.getBookDetails());
        }

        // section 2
        Pokemon p1 = new Pokemon("Pikachu", 3, 1);
        Pokemon p2 = new Pokemon("Eevee", 8, 1);
        Pokemon p3 = new Pokemon("Lucario", 2, 4);

        // System.out.println(p3.getPokemonDetails());

        Pokemon pokemonArray[] = new Pokemon[3];
        pokemonArray[0] = p1;
        pokemonArray[1] = p2;
        pokemonArray[2] = p3;

        for (Pokemon p : pokemonArray) {
            System.out.println(p.getPokemonDetails());
        }

    } // end of Main method
} // end of Main class
