public abstract class Unreal extends Creature {


    public Unreal(String v1, boolean v2, double v3) {
        super(v1, v2, v3);
    }

    public int hashCode() {
        return (int)(Unreal.v3 * 10);
    }

    void appear() {
        System.out.println(name + " говорят: " + "\"Мы появились!\"");
        Unreal.v2 = true;
        System.out.println("Появились " + name + " и они оснащены на " + hashCode() + " процентов.");
    }


    void fallThrough() {
        System.out.println(name + " говорят: " + "\"Как же так? Мы провалились!\"");
        System.out.println("Воспользовавшись моментом, преступники вылезли из воды и начали драку");
    }

    void sink() {
        System.out.println(name + " говорят: " + "\"Вода повсюду! Вытащите нас!\"");
    }

    void drown() {
        System.out.println(name + " говорят: " + "\"Мы утопим вас во что бы то ни стало!\"");
    }

    void fight() {
        System.out.println(name + " говорят: " + "\"Вы не узнаете себя в зеркале после этого боя!\"");
    }


}
