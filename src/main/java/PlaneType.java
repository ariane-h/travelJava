public enum PlaneType {
    BOEING747(10, 30),
    AIRBUS3000(20, 50),
    PRIVATEPLANE(2, 10);


    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){return capacity;}
    public int getTotalWeight(){return totalWeight;}
}
