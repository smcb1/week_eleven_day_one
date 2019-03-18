public class Printer {

    private int paperSheets;
    private int tonerLevel;

    public Printer(int paperSheets, int tonerLevel) {
        this.paperSheets = paperSheets;
        this.tonerLevel = tonerLevel;
    }

    public int getPaperSheets() {
        return paperSheets;
    }

    public void setPaperSheets(int paperSheets) {
        this.paperSheets = paperSheets;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int fillPaperTray() {
        this.paperSheets = 20;
        return paperSheets;
    }

    public void printQueue(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= getPaperSheets() && totalPages <= getTonerLevel()) {
            this.paperSheets -= totalPages;
            this.tonerLevel -= totalPages;
        } else {
            getPaperSheets();
        }
    }
}
