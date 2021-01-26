public enum Position {
    SITINCAR{
        public String returnThePosition(int count) {
            if (count > 1) return "сели в машину и поехали от преследователей";
            else return "сел в машину и поехал от преследователей";
        }
    },
    STAND {
        public String returnThePosition(int count) {
            if (count > 1) return "стоят";
            else return "стоит";
        }
    },
    GOTOCHAIR{
        public String returnThePosition(int count) {
            if (count > 1) return "Они идут к местам";
            else return "Он идёт к месту";
        }
    };

    public abstract String returnThePosition(int count);
}
