import java.io.IOException;

public interface NoteBook {
    void getAll();
    void insert() throws IOException;
    void modification() throws IOException;
    void remove() throws IOException;

}
