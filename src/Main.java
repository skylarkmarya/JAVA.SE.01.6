import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NoteBook notebook = new NoteBookImpl();

        menu();
        int k = 5;
        do  {
            k = Integer.parseInt(reader.readLine());
            if (k == 0) {
                notebook.getAll();
                System.out.println();
                menu();
            }
            if (k == 1) {
                notebook.insert();
                System.out.println();
                menu();
            }
            if (k == 2) {
                notebook.modification();
                System.out.println();
                menu();
            }
            if (k == 3) {
                notebook.remove();
                System.out.println();
                menu();
            }

        }while (k!=4);

    }
    private static void menu() {
        System.out.println("Выберите:");
        System.out.println("0-просмотр");
        System.out.println("1-новая запись");
        System.out.println("2-изменение");
        System.out.println("3-удаление");
        System.out.println("4-закончить");
    }
}
