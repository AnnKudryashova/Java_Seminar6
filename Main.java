import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notebook NoteList []= new Notebook[10];
        NoteList[0] = new Notebook("Budget", "Irbis", "NB256" , 10000.00,
                      new CPU("Intel", "Celeron", "N3350"),
                      new RAM("LPDDR4", 4 ),
                      new HardDisc("eMMC", 64));
        NoteList[1] = new Notebook("Budget", "Irbis", "NB71" , 15000.00,
                      new CPU("Intel", "Atom", "Z3735F"),
                      new RAM("DDR3L", 2),
                      new HardDisc("eMMC", 32));
        NoteList[2] = new Notebook("Budget", "Irbis", "NB700" , 20000.00,
                      new CPU("Intel", "Celeron", "N4020"),
                      new RAM("LPDDR3", 4),
                      new HardDisc("eMMC", 128));
        NoteList[3] = new Notebook("Budget", "Digma", "ES1052EW" , 25000.00,
                      new CPU("Intel", "Atom", "x5-Z8350"),
                      new RAM("DDR3", 2),
                      new HardDisc("eMMC", 64));
        NoteList[4] = new Notebook("Ultrabook", "Honor", "NBR-WAI9" , 30000.00,
                      new CPU("Intel", "i3", "10110U"),
                      new RAM("DDR4", 8),
                      new HardDisc("SSD", 256));
        NoteList[5] = new Notebook("Ultrabook", "Lenovo", "14ARE05" , 50000.00,
                      new CPU("AMD", "A9", "9420e"),
                      new RAM("LPDDR4X", 16),
                      new HardDisc("SSD", 512));
        NoteList[6] = new Notebook("Ultrabook", "Acer", "NX.AC3ER.002" , 60000.00,
                      new CPU("AMD ", "Ryzen 5", "5500U"),
                      new RAM("LPDDR4X", 8),
                      new HardDisc("SSD", 512));
        NoteList[7] = new Notebook("Workstation", "ASUS", "GV601RW-M6065W" , 70000.00,
                      new CPU("AMD", "Ryzen 9", "6900HS"),
                      new RAM("DDR5", 64),
                      new HardDisc("M.2", 1024));
        NoteList[8] = new Notebook("Workstation", "ASUS", "W7600H3A-L2025W" , 80000.00,
                      new CPU("Intel", "i7", "11800H"),
                      new RAM("DDR4", 32),
                      new HardDisc("SSD", 1024));
        NoteList[9] = new Notebook("Workstation", "HP", "6M883EA" , 90000.00,
                      new CPU("Intel", "i7", "12700H"),
                      new RAM("DDR5", 16),
                      new HardDisc("SSD", 1024));

/// Тестирование фильтров ///
        System.out.println("TEST: Прошу отфильтровать ноутбуки с типом 'Workstation'");
        Notebook.FilterByType(NoteList,"Workstation", "type");
        System.out.println("TEST: Прошу отфильтровать ноутбуки компании 'Irbis'");
        Notebook.FilterByType(NoteList,"Irbis", "company");
        System.out.println("TEST: Прошу отфильтровать ноутбуки компании 'Intel'");
        Notebook.FilterByType(NoteList,"Intel", "cpu_company");
        System.out.println("TEST: Прошу отфильтровать ноутбуки с CPU типа 'A9'");
        Notebook.FilterByType(NoteList,"A9", "cpu_type");
        System.out.println("TEST: Прошу отфильтровать ноутбуки с  ROM типа 'SSD'");
        Notebook.FilterByType(NoteList,"SSD", "rom_type");


    }
}