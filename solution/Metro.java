class Metro {

    public static int count(int[] metro, int max, int waiting) {
        int start = waiting;
        for (int i = 0; i < metro.length && waiting >= 0; i++) {
            waiting -= (max - metro[i]);
        }
        return waiting >= 0 ? start - waiting : start;
    }
}
