public class Main {
    public static String result ="", alphabet="", temp="", tempArray;
    public static char[] morseCode, alphaCode;
    public static void main(String[] args) {
        // tempArray =".... . .-.. .-.. ---";
        morseToAlphaConverter();
        result = "";
        alphaToMorseConverter();     
    }

    public static void morseToAlphaConverter() {

        tempArray =".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
        morseCode = tempArray.toCharArray();
        for (int i=0; i<tempArray.length(); i++) {
            temp = String.valueOf(morseCode[i]);
            //System.out.println(temp);
            if(temp.equals("/") || temp.equals(" ")) {
                result = result + findAlphaString(alphabet);
                alphabet = "";
            } else {
                alphabet = alphabet + String.valueOf(morseCode[i]);
                System.out.println(alphabet);
                if(i== (tempArray.length() - 1)) {
                    result = result + findAlphaString(alphabet);
                }
            }
        }
        System.out.println(result);

    }




    public static void alphaToMorseConverter() {

        tempArray ="ANIRUDH IS A GOOD BOY";
        tempArray.toUpperCase();
        alphaCode = tempArray.toCharArray();
        for (int i=0; i<tempArray.length(); i++) {
            temp = String.valueOf(alphaCode[i]);
            //System.out.println(temp);
            if(temp.equals(" ")) {
                result = result + "/";
                // alphabet = "";
            } else {
                result = result + findMorseString(temp);
                result = result + " ";
                // alphabet
                // alphabet = alphabet + String.valueOf(morseCode[i]);
            }
        }
        System.out.println(result);

    }



    public static String findAlphaString(String alphabet) {
        if(alphabet.equals(".-")) {return "A";}
        else if(alphabet.equals("-...")) {return "B";}
        else if(alphabet.equals("-.-.")) {return "C";}
        else if(alphabet.equals("-..")) {return "D";}
        else if(alphabet.equals(".")) {return "E";}
        else if(alphabet.equals("..-.")) {return "F";}
        else if(alphabet.equals("--.")) {return "G";}
        else if(alphabet.equals("....")) {return "H";}
        else if(alphabet.equals("..")) {return "I";}
        else if(alphabet.equals(".---")) {return "J";}
        else if(alphabet.equals("-.-")) {return "K";}
        else if(alphabet.equals(".-..")) {return "L";}
        else if(alphabet.equals("--")) {return "M";}
        else if(alphabet.equals("-.")) {return "N";}
        else if(alphabet.equals("---")) {return "O";}
        else if(alphabet.equals(".--.")) {return "P";}
        else if(alphabet.equals("--.-")) {return "Q";}
        else if(alphabet.equals(".-.")) {return "R";}
        else if(alphabet.equals("...")) {return "S";}
        else if(alphabet.equals("-")) {return "T";}
        else if(alphabet.equals("..-")) {return "U";}
        else if(alphabet.equals("...-")) {return "V";}
        else if(alphabet.equals(".--")) {return "W";}
        else if(alphabet.equals("-..-")) {return "X";}
        else if(alphabet.equals("-.--")) {return "Y";}
        else if(alphabet.equals("--..")) {return "Z";}
        else {return " ";}
        // else {return "NUll";}

    }


    public static String findMorseString(String alphabet) {
        if(alphabet.equals("A")) {return ".-";}
        else if(alphabet.equals("B")) {return "-...";}
        else if(alphabet.equals("C")) {return "-.-.";}
        else if(alphabet.equals("D")) {return "-..";}
        else if(alphabet.equals("E")) {return ".";}
        else if(alphabet.equals("F")) {return "..-.";}
        else if(alphabet.equals("G")) {return "--.";}
        else if(alphabet.equals("H")) {return "....";}
        else if(alphabet.equals("I")) {return "..";}
        else if(alphabet.equals("J")) {return ".---";}
        else if(alphabet.equals("K")) {return "-.-";}
        else if(alphabet.equals("L")) {return ".-..";}
        else if(alphabet.equals("M")) {return "--";}
        else if(alphabet.equals("N")) {return "-.";}
        else if(alphabet.equals("O")) {return "---";}
        else if(alphabet.equals("P")) {return ".--.";}
        else if(alphabet.equals("Q")) {return "--.-";}
        else if(alphabet.equals("R")) {return ".-.";}
        else if(alphabet.equals("S")) {return "...";}
        else if(alphabet.equals("T")) {return "-";}
        else if(alphabet.equals("U")) {return "..-";}
        else if(alphabet.equals("V")) {return "...-";}
        else if(alphabet.equals("W")) {return ".--";}
        else if(alphabet.equals("X")) {return "-..-";}
        else if(alphabet.equals("Y")) {return "-.--";}
        else if(alphabet.equals("Z")) {return "--..";}
        else {return " ";}
        // else {return "NUll";}

    }

}