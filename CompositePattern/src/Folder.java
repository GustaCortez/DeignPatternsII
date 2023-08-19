import java.util.ArrayList;
import java.util.List;

// Compuesto
class Folder implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public void printInfo() {
        System.out.println("Folder: " + name);
        for (FileSystemElement element : elements) {
            element.printInfo();
        }
    }
}