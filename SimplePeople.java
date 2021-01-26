public class SimplePeople extends Unreal {
    protected static int armDegree;
    protected static boolean visibility;
    protected static String name;



    public SimplePeople(String name, boolean visibility, int armDegree) {
        super(name, visibility, armDegree);
        SimplePeople.armDegree = armDegree;
        SimplePeople.visibility = visibility;
        SimplePeople.name = name;
    }

    public int getArmDegree() {
        return SimplePeople.armDegree;
    }

    public String toString() {
        return "В этом жестоком мире каждый день собираются " + SimplePeople.name + " Сможет ли кто-то их одолеть?";
    }

    public void sink() {
        System.out.println(name + " говорят: " + "\"Вода повсюду! Вытащите нас!\"");
    }

    public void run() {
        System.out.println("Все бегут!!");
    }

    void rush() {
        System.out.println("Все мечутся!");
    }

    void turmoil() {
        System.out.println("Началась какая-то суматоха.");
        rush();
        run();
    }

}
