package homework4;

/*
7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */
class Park {
    class Attraction {
        private String name;
        private String openingHours;
        private double cost;

        public Attraction(String name, String openingHours, double cost) {
            this.name = name;
            this.openingHours = openingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getOpeningHours() {
            return openingHours;
        }

        public double getCost() {
            return cost;
        }
    }
}
