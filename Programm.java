public class Programm {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint = PaintBuilder.getInstance().setName("HAMMERITE").setColor("red").setWeight(3).build();
        var paint2 = PaintBuilder.getInstance().setName("Ultima").setType("outdoor work").setColor("blue").
                setWeight(2).setDate(122022).setStructure("water base").setCost(350).build();
        System.out.println(paint);
        System.out.println(paint2);
    }
}
