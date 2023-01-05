import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album discotecha = new Album();
        discotecha.setArtist("YMCA");
        discotecha.setId(1);
        discotecha.setGenre("disco");
        discotecha.setSales(29);
        discotecha.setName("YMCA");
        discotecha.setRelease_date(1999);
        Quote kafka = new Quote();
        kafka.setContent("A first sign of the beginning of understanding is the wish to die");
        kafka.setAuthor_id(1);
        kafka.setId(1);
        Authors twain = new Authors();
        twain.setFirst_name("Mark");
        twain.setId(1);
        twain.setFirst_name("Twain");
        ArrayList <Quote> quotes = new ArrayList<>();
        quotes.add(kafka);
        Quote aurelius = new Quote();
        aurelius.setId(2);
        aurelius.setContent("You have power over your mind - not outside events");
        aurelius.setAuthor_id(2);
        quotes.add(aurelius);
        for (int i = 0; i < quotes.size(); i++) {
            System.out.println(quotes.get(i).getId());
            System.out.println(quotes.get(i).getAuthor_id());
            System.out.println(quotes.get(i).getContent());
        }
    }
}
