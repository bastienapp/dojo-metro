class Metro {

    public static int count(int[] metro, int max, int waiting) {
        int nbEntree = 0;
        for (int i = 0; i < metro.length && waiting >= 0; i++) {
            int cap = max - metro[i]; // places restantes
            cap = Math.min(cap, waiting); // min entre places restantes et file d'attente
            nbEntree += cap; // augmente le nombre de personne entrées dans le métro
            waiting -= cap; // on diminue le nombre de personne dans la file d'attente
        }
        return nbEntree;
    }
}
