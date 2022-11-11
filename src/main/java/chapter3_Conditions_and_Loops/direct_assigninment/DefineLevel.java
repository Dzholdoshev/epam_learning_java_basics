package chapter3_Conditions_and_Loops.direct_assigninment;

public class DefineLevel {
    public static void main(String[] args) {

       int x =  new DefineLevel().defineLevel("tom");

        System.out.println(x);
    }

    public int defineLevel(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> {System.out.println("s");yield 3;}
            default  -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }

}
