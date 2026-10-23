public class AllSwitchTypes {
    
    enum Day {
        MONDAY, TUESDAY
    }

    public static void main(String[] args) {

        // int switch
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("int: One");
                break;
            case 2:
                System.out.println("int: Two");
                break;
        }


        // byte switch
        byte b = 10;
        switch (b) {
            case 10:
                System.out.println("byte: Ten");
                break;
        }


        // short switch
        short s = 20;
        switch (s) {
            case 20:
                System.out.println("short: Twenty");
                break;
        }


        // char switch
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("char: Excellent");
                break;
            case 'B':
                System.out.println("char: Good");
                break;
        }


        // String switch
        String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("String: Stop");
                break;
            case "Green":
                System.out.println("String: Go");
                break;
        }


        // enum switch
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum: Monday");
                break;
            case TUESDAY:
                System.out.println("enum: Tuesday");
                break;
        }
    }
}