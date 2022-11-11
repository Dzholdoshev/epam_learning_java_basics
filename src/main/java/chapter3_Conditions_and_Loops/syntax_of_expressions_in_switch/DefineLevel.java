package chapter3_Conditions_and_Loops.syntax_of_expressions_in_switch;

public class DefineLevel {
    public static void main(String[] args) {

    }

    public int defineLevel(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
             yield -1;
            }
        };
    }

}
