public class Main {
    public static void main(String[] args) {
        NotebookStore store = new NotebookStore();

        store.addNotebook(new Notebook("Lenovo", "Windows", "black", 8, 256));
        store.addNotebook(new Notebook("HP", "Windows", "pink", 16, 512));
        store.addNotebook(new Notebook("Dell", "Linux", "blue", 8, 512));
        store.addNotebook(new Notebook("Asus", "Windows", "red", 16, 1024));
        store.addNotebook(new Notebook("Acer", "Linux", "green", 4, 256));
        store.addNotebook(new Notebook("Apple", "macOS", "grey", 8, 256));

        store.askFilterCriteriaAndShowResults();
    }
}