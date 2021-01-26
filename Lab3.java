import java.util.Arrays;

public class Lab3 {

    public static void main(String[] args) throws Watcher.MyException {
        String time = "18:49";
        Subjects.Cinema cinema = new Subjects.Cinema();
        Watcher watchers = new Watcher("Зрители Кинотеатра", 5);
        cinema.getPosterInfo();
        watchers.posterize.seePoster();
        watchers.posterize.processPosterInfo();
        watchers.takePlace();
        cinema.switchOffTheLights();

        watchers.condition = Condition.TIRED;
        watchers.goSleep(watchers);


    }
}
