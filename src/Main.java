import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> jobTable = new MyHashTable<MyTestingClass , String>();
        Random random = new Random();
        for (int i = 1; i < 10000; i++) {
            String value = "value_";
            MyTestingClass key = new MyTestingClass("key_" + random.nextInt(100));
            jobTable.put(key, value);
        }

        for(int i =0;i<jobTable.getM();i++) {
            System.out.println(jobTable.countElements(i));
        }

    }
}