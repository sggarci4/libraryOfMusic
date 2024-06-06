import com.gustavogarcia.libraryofmusic.calculations.CalculatorOfTime;
import com.gustavogarcia.libraryofmusic.models.*;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        // product.setTypeProductConsole();
        product.setName("Pop Gold");
        product.setCreator("Youtube Music");
        product.evaluate(5);
        product.showTechnicalSheet();


        Album album1 = new Album();
        album1.setTypeProduct(album1);
        album1.setName("Pop Gold");
        album1.setCreator("Youtube Music");
        album1.evaluate(5);
        album1.showTechnicalSheet();

        Podcast podcast1 = new Podcast();
        podcast1.setTypeProduct(album1);
        podcast1.setName("Pop Gold");
        podcast1.setCreator("Youtube Music");
        podcast1.evaluate(5);
        podcast1.showTechnicalSheet();

        Playlist playlist1 = new Playlist();
        playlist1.setTypeProduct(playlist1);
        playlist1.addSong("Someone Like You", "Adele", 5, 2000, 20000);
        playlist1.addSong("Thinking out Loud", "Ed Sheeran", 4, 2050, 40000);
        playlist1.addSong("Someone You Loved", "Lewis Capaldi", 3, 40000, 45000);
        playlist1.addSong("Love Me Like You Do", "Ellie Goulding", 4, 100000, 5000);
        playlist1.addSong("As it was", "Harry Styles", 4, 6000, 6000);
        playlist1.setName("Pop Gold");
        playlist1.setCreator("Youtube Music");
        playlist1.evaluate(5);
        playlist1.showTechnicalSheet();
        playlist1.printSongs();
        System.out.println(playlist1.calculateTimeTotal());
//        CalculatorOfTime calculator = new CalculatorOfTime();
//        System.out.println("Total tiempo: " + calculator.getTextTotalTime());

        


    }
}
