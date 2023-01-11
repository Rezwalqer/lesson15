package driver;

public enum Counter {
    COUNTER(15, 5);
    private int start;
    private final int step;

    Counter(int start, int step) {
        this.start = start;
        this.step = step;
    }

    public int getStart() {
        return start;
    }

    public static void timer() {
        COUNTER.start += COUNTER.step;
    }
}
