import stringutils.IterLetter;

public class MainIter {
    public static void main(String[] args) {
        IterLetter it = new IterLetter("zaibal");

        it.printNext();
        it.printNext();
        it.printNext();
        
        it.restart();

        while(it.hasNext()) {
            it.printNext();
        }
    }
}