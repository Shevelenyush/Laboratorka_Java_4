public class Watcher extends Real {
    protected int count;
    protected String name;
    protected Condition condition;
    protected Position position;

    posterAction posterize = new posterAction() {
        @Override
        public void seePoster() {
            System.out.println("Все " + count + " зрителей увидели афишу.");
            position = Position.STAND;
            if (count > 1) {
                System.out.println("Зрители " + position.returnThePosition(count) + " и внимательно изучают её.");
            }
        }

        @Override
        public void processPosterInfo() {
            System.out.println("Всем понравилось описание фильма и цена на билет, поэтому зрители решили пойти на этот фильм.");
            position = Position.GOTOCHAIR;
            if(count > Subjects.Cinema.placesNumber) {
                run();
            }
            System.out.println(position.returnThePosition(count));
        }
    };
    public Watcher(String name, int count) {
        super(name);
        this.name = name;
        this.count = count;
    }


    void run() {
        System.out.println("Зрители побежали занимать места, так как было очевидно, что на всех людей их не хватит");
    }

    void takePlace() {
        System.out.println("Зрители расселись по своим местам.");
        if (count > Subjects.Cinema.placesNumber) {
            System.out.println("Но к сожалению не всем людям хватило места, так как их всего " + Subjects.Cinema.placesNumber);
        }
    }

    void goSleep(Watcher watcher) throws MyException{
        if (watcher.condition == Condition.TIRED) {
            System.out.println(condition.returnTheCondition());
        } else {
            throw new MyException(Condition.NOTTIRED.returnTheCondition());
        }
    }

    static class MyException extends Exception {
        MyException(String message) {
            super(message);
        }
    }
}
