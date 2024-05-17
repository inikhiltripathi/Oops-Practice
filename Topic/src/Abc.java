public class Abc {
        int age;
        String name;

        void setData() {
            age = 23;
            name = "Ram";
            System.out.println("Age=" + age);
            System.out.println("Name=" + name);
        }

        void getData(String n, int a){
            //name = n;
            //age = a;
            System.out.println("Age=" + a);
            System.out.println("Name=" + n);
        }

        int setAge() {
            return 12;
        }

        String setName(String name) {
            //String n = name;
            return name;
        }

        public static void main(String args[]) {
            Abc m = new Abc();
            m.setData();
            m.getData("Shyam", 29);
            //int i = m.setAge();
            System.out.println(m.setAge());
            //String q = m.setName("Nikhil");
            System.out.println("Name=" + m.setName("Nikhil"));
        }
    }

