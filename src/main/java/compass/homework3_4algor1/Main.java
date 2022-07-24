package compass.homework3_4algor1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringList stringList = new StringListImpl();
        stringList.add("test 1");
        stringList.add("test 3");
        stringList.add("test 5");
        stringList.add("test 7");
        stringList.add("test 9");

        stringList.remove(1);


        System.out.println(Arrays.toString(stringList.toArray()));

        stringList.clear();
        System.out.println(stringList.size());

    }
}
}
