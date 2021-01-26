public abstract class Object {
    protected static String name;
    protected static boolean v2;
    protected static double v3;

    static{
        name = "John Do";
    }

    public Object(String name) {
        Object.name = name;
    }

    public Object(String name, boolean v2, double v3) {
        Object.name = name;
        Object.v2 = v2;
        Object.v3 = v3;
    }

}
