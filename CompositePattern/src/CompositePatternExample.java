import java.util.ArrayList;
import java.util.List;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Crear archivos
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // Crear carpetas
        Folder folder1 = new Folder("Folder 1");
        Folder folder2 = new Folder("Folder 2");

        // Agregar archivos a las carpetas
        folder1.addElement(file1);
        folder2.addElement(file2);

        // Agregar carpetas a una carpeta superior
        Folder rootFolder = new Folder("Root");
        rootFolder.addElement(folder1);
        rootFolder.addElement(folder2);

        // Imprimir la estructura completa
        rootFolder.printInfo();
    }
}
