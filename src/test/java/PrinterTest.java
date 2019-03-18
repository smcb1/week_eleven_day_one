import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 20);
    }

    @Test
    public void getPaperSheets() {
        assertEquals(10, printer.getPaperSheets());
    }

    @Test
    public void getTonerLevel() {
        assertEquals(20, printer.getTonerLevel());
    }

    @Test
    public void fillPaperTray() {
        assertEquals(20, printer.fillPaperTray());
    }

    @Test
    public void printJobSuccess() {
        printer.printQueue(1, 5);
        assertEquals(5, printer.getPaperSheets());
        assertEquals(15, printer.getTonerLevel());
    }

    @Test
    public void printJobFail() {
        printer.printQueue(3, 5);
        assertEquals(10, printer.getPaperSheets());
        assertEquals(20, printer.getTonerLevel());
    }

}
