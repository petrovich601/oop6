public class PaintBuilder {
    private static PaintBuilder instance = null;
    Paint obj;

    private PaintBuilder() {

    }

    public static PaintBuilder getInstance() {
        if (instance == null)
            instance = new PaintBuilder();
        instance.obj = new Paint();

        return instance;
    }
    public PaintBuilder setName(String name) {
        obj.setName(name);
        return this;
    }
    public PaintBuilder setType(String type) {
        obj.setType(type);
        return this;
    }
    public PaintBuilder setStructure(String structure) {
        obj.setStructure(structure);
        return this;
    }
    public PaintBuilder setColor(String color) {
        obj.setColor(color);
        return this;
    }
    public PaintBuilder setWeight(int weight) {
        obj.setWeight(weight);
        return this;
    }
    public PaintBuilder setCost(int cost) {
        obj.setCost(cost);
        return this;
    }
    public PaintBuilder setDate(long date) {
        obj.setDate(date);
        return this;
    }
    public Paint build() {
        return obj;
    }
}
