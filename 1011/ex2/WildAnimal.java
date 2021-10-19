public enum WildAnimal {
    MONKEY("banana", 5),
    ELEPHANT("raspberries", 30),
    GIRAFFE("apples", 10),
    RACOON("walnuts", 20);

    private final String food;
    private final int amount;

    WildAnimal(String food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public static String listAllAnimals() {
        StringBuilder sb = new StringBuilder();
        WildAnimal arrOfWild[] = WildAnimal.values();
        for (WildAnimal animal : arrOfWild) {
            sb.append(animal.ordinal()) .append(": ");
            sb.append(animal.name());
            sb.append(" desires eating ").append(animal.amount * 7).append(" ");
            //sb.(System.lineSeparator());
        }
        return sb.toString();
    }
    public String toString() {
        return "a(n) " + name() + " eats " + amount + " food " + food;
    }
}