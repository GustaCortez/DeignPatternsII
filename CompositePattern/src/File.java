// Hoja
class File implements FileSystemElement {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("File: " + name);
    }
}