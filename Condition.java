public enum Condition {
    SCARED {
        public String returnTheCondition() {
            return "Зрители очень испугались!";
        }
        },
    HAPPY {
        public String returnTheCondition(){
            return "Зрители очень обрадовались!";
        }
    },
    SURPRISED {

        public String returnTheCondition() {
            return "Зрители очень сильно удивились!";
        }
    },
    TIRED {
        public String returnTheCondition() {
            return "Все зрители очень устали... Именно поэтому все дружно пошли по своим кроватям и мирно уснули, видя сны о прекрасном фильме, которых заставил их дрожать и визжать...";
        }
    },
    NOTTIRED {
        public String returnTheCondition() {
            return "Зрители бодрячком!";
        }
    };


    public abstract String returnTheCondition();
}

