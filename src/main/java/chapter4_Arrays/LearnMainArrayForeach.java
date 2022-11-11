package chapter4_Arrays;

public class LearnMainArrayForeach {
    public static void main(String[] args) {

        String [] strings = {"Java", "Oracle", "<epam>"};

        for (String str: strings) {
            str+=11; //it can't reassign value.
            // there is an inability to change the value of the array elements
            // (for primitive and immutable reference data types).
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i]+=11;
        }

        for (String elem: strings) {
            System.out.println(elem);
        }
        StringBuilder[] stringBuilders = new StringBuilder[3];
        stringBuilders[0]=new StringBuilder("Java");
        stringBuilders[1]=new StringBuilder("Oracle");
        stringBuilders[2]=new StringBuilder("<epam>");

        for (StringBuilder elem:stringBuilders) {
            elem.append(11);
        }
        for (StringBuilder elem:stringBuilders) {

            System.out.println(elem);
        }

    }
}
