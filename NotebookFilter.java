import java.util.List;
import java.util.stream.Collectors;

public class NotebookFilter {
    public static List<Notebook> filterByMinimumRam(List<Notebook> notebooks, int minRam) {
        return notebooks.stream()
                .filter(notebook -> notebook.getRam() >= minRam)
                .collect(Collectors.toList());
    }

    public static List<Notebook> filterByMinimumStorage(List<Notebook> notebooks, int minStorage) {
        return notebooks.stream()
                .filter(notebook -> notebook.getStorage() >= minStorage)
                .collect(Collectors.toList());
    }

    public static List<Notebook> filterByOperatingSystem(List<Notebook> notebooks, String operatingSystem) {
        return notebooks.stream()
                .filter(notebook -> notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem))
                .collect(Collectors.toList());
    }

    public static List<Notebook> filterByColor(List<Notebook> notebooks, String color) {
        return notebooks.stream()
                .filter(notebook -> notebook.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }    
}