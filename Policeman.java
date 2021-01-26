public class Policeman extends Unreal{
    protected static Position position;
    protected static double armDegree;
    protected static boolean visibility;
    protected static String name;

    public Policeman(String name, boolean visibility, double armDegree) {
        super(name, visibility, armDegree);
        Policeman.armDegree = armDegree;
        Policeman.visibility = visibility;
        Policeman.name = name;
    }

    double getArmDegree() {
        return Policeman.armDegree;
    }


    public boolean equals(double first, double second) {
        return first == second;
    }

    public void shoot(double armDegree) {
        class Gun {
            protected final double gun = 1;
            public double increaseArmDegree() {
                return armDegree+gun;
            }
        }
        Gun gun = new Gun();
        gun.increaseArmDegree();
        System.out.println("Они взяли пистолеты!");
        System.out.println("Они стреляют в них!");
        System.out.println(Condition.SCARED.returnTheCondition());
        if (Subjects.Film.victims.getArmDegree() > 5 && armDegree < 5) {
            position = Position.SITINCAR;
            System.out.println("Преступники тоже хорошо оснащены, поэтому " + position.returnThePosition(5));
            System.out.println("Но они не заметили крутой поворот и случайно их машина оказалась в воде!");
            System.out.println(Condition.SURPRISED.returnTheCondition());
        }
        else {
            System.out.println("Преступники были плохо оснащены, поэтому им пришлость нырять в воду!");
        }
    }

    public void fight() {
        System.out.println("Драка длилась довольно долго, но в итоге ");
        try {
            numArmDegree(Policeman.armDegree, SimplePeople.armDegree);
        } catch (NotRightArmDegree e) {
            System.out.println(e.getMessage());
            System.out.println("Преступники, несмотря ни на что оказались хитрее, они сбежали оставив за собой только клубок пыли...");
        }
    }

    public void numArmDegree(double arm1, int arm2) throws NotRightArmDegree{
        if (arm1 > arm2) {
            System.out.println("Полицейские героически смогли одолеть безжалостных преступников!");
            System.out.println(Condition.HAPPY.returnTheCondition());
        }
        else {
            throw new NotRightArmDegree("Назойливые преступники смогли вырваться из рук полицейских и скрылись далеко-далеко...");
        }
    }

    public void follow() {
        System.out.println(name + " следят за преступниками");
        if (getArmDegree() > 40 || equals(Policeman.armDegree, SimplePeople.armDegree)) {
            shoot(getArmDegree());
        }
        else {
            fight();
        }
    }

    public void drown() {
        System.out.println("Вы, преступники, за все ответите!");
        System.out.println("И тут Полицейские начали топить преступников.");
    }

    static class NotRightArmDegree extends Exception{
        public NotRightArmDegree(String message) {
            super(message);
        }
    }
}
