import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoteBookImpl implements NoteBook {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Record [] records = new Record[100];
    int string = 0;
    @Override
    public void modification () throws IOException{
        System.out.println("Выберите строку для изменения");
        getAll();
        int string = Integer.parseInt(reader.readLine());
        System.out.println("Введите новузапись:");
        records[string]= new Record(reader.readLine());
    }

    @Override
    public void getAll() {
        for (int i=0;i<100;i++)
            System.out.println(i+" "+records[i]);
    }

    @Override
    public void insert() throws IOException{
        System.out.println("Введите новую запись:");
        records[string] = new Record(reader.readLine());
        string++;
    }

    @Override
    public void remove() throws IOException {
        System.out.println("Выберите строку для удаления");
        getAll();
        records[Integer.parseInt(reader.readLine())] = null;
    }
}
