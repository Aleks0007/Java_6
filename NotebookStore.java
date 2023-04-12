import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class NotebookStore {
    private Set<Notebook> notebooks;

    public NotebookStore() {
        notebooks = new HashSet<>();
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public void askFilterCriteriaAndShowResults() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteria = scanner.nextInt();

        List<Notebook> filteredNotebooks;

        switch (criteria) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int minRam = scanner.nextInt();
                filteredNotebooks = NotebookFilter.filterByMinimumRam(new ArrayList<>(notebooks), minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minStorage = scanner.nextInt();
                filteredNotebooks = NotebookFilter.filterByMinimumStorage(new ArrayList<>(notebooks), minStorage);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String operatingSystem = scanner.next();
                filteredNotebooks = NotebookFilter.filterByOperatingSystem(new ArrayList<>(notebooks), operatingSystem);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filteredNotebooks = NotebookFilter.filterByColor(new ArrayList<>(notebooks), color);
                break;
            default:
                System.out.println("Неверный критерий");
                filteredNotebooks = new ArrayList<>();
        }

        System.out.println("Список подходящих ноутбуков:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }

        scanner.close();
    }
}