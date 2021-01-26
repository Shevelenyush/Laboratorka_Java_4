public class Subjects extends Object{

    public Subjects(String name) {
        super(name);
    }

    public static class Cinema {
        protected static int placesNumber = 60;
        protected boolean lights = true;
        protected boolean screen = false;
        protected String poster;


        void screenOn() {
            if (screen) {
                Film.startFilm();
            }
        }

        void createPoster() {
            poster = Film.name + Film.content + "\nЖанр: " + Film.genre + "\nЦена билета: 200 рублей\n Начало в " + Film.time;
        }

        void getPosterInfo() {
            createPoster();
            System.out.println(poster);

        }

        void switchOffTheLights() {
            lights = false;
            System.out.println("Свет погас...");
            screen = true;
            screenOn();
        }
    }

    public static class Film {
        public static String name = "Убийство на дне моря";
        protected static String genre = "Ужасы";
        protected static String time = "19:00";
        protected static String content ="\nУбийство на дне моря, или Кровавый знак. \nНовый захватывающий кинофильм из жизни преступного мира с убийствами, \nограблениями, утоплениями, бросаниями под поезд и растерзаниями диких зверей. \nТолько в нашем кинотеатре. Спешите видеть!";
        static SimplePeople victims = new SimplePeople("Преступники", true, 6);
        static Policeman policemen = new Policeman("Полицейские", false, 6);


        static void startFilm() {
            System.out.println("Фильм начинается...\n\n");
            System.out.println(victims.toString());
            victims.turmoil();
            policemen.appear();
            victims.run();

            policemen.follow();
            victims.sink();
            policemen.drown();
            policemen.fallThrough();
            policemen.fight();
            endFilm();
        }

        static void endFilm() {
            System.out.println("И начались титры...");
        }


    }
}
