package Lesson_4;

public class Park {
    public static void printPark() {
        System.out.println("Добро пожаловать в Гомельский парк аттракционов!");
        System.out.println("У нас вы сможете прокатиться на следующих видах аттракцонов: ");
    }
    public class Attraction{
        private String name;

        private int time;
        private double price;
        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", time=" + time +
                    ", price=" + price +
                    '}';
        }

        public Attraction(String name, int time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

    }

}
