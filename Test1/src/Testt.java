public class Testt {
    public String getname() {
        return "getname";
    }

    public static class student {
        private String name;
        private int age;
        private String id;
        private double tizon;

        public student(String name, int age, String id, double tizon) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.tizon = tizon;
        }

        public int getAge() {
            return age;
        }

        public String getId() {
            return id;
        }

        public double getTizon() {
            return tizon;
        }

        public String getName() {
            return name;
        }
    }

    public static class phone {
        private String color;
        private String CPU;
        private String neicun;
        private String cuncu;
        private String name;
        private int price;

        public phone(String name, String color, int price, String CPU, String neicun, String cuncu) {
            this.name = name;
            this.color = color;
            this.price = price;
            this.CPU = CPU;
            this.neicun = neicun;
            this.cuncu = cuncu;
        }

        public String getCPU() {
            return CPU;
        }

        public String getNeicun() {
            return neicun;
        }

        public String getCuncu() {
            return cuncu;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }
    }

    static class human {

        public void eat() {
            System.out.println("人要吃饭");
        }

        public void move() {
            System.out.println("人可以走路");
        }

        public void sleep() {
            System.out.println("人要睡觉\n");
        }
    }

    static class animal extends human {
        public void eat() {
            super.eat();
            System.out.println("动物要捕猎");
        }
    }

    static class jiqi {
        public void kaiji() {
            System.out.println("手机开机");
        }

        public void photo() {
            System.out.println("拍照\n ");
        }

        public void call() {
            System.out.println("打电话");
        }
    }
}