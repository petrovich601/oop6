public class Paint {
    private String name;
    private String color;
    private int weight;
    private String type;
    private String structure;
    private long date;
    private int cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", structure='" + structure + '\'' +
                ", date=" + date +
                ", cost=" + cost +
                '}';
    }
}
