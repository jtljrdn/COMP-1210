public class LabProgram {

    public static String checkCharacter(String input, int index){
        String output;
        char character = input.charAt(index);
        if (Character.isWhitespace(character)) {
            output = "Character ' ' is a white space";
        } else if (Character.isLetter(character)){
            output = "Character '" + character + "' is a letter";
        } else if (Character.isDigit(character)) {
            output = "Character '" + character + "' is a digit";
        } else {
            output = "Character '" + character + "' is unknown";
        }
        return output;
    }
    public static void main(String[] args){

        System.out.println(checkCharacter("happy birthday", 2));
        System.out.println(checkCharacter("happy birthday", 5));
        System.out.println(checkCharacter("happy birthday 2 you", 15));
        System.out.println(checkCharacter("happy birthday!", 14));

    }
}
