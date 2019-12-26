package trainingday4.by.epam.training.task3.entities;

public class TextHandler {

    public String[] changekElementToSymbol(String[] str,int kElement, char symbolFoChange){
        String [] forReturn = str;
        char[] word;
        for(int i = 0;i < forReturn.length;i++){
            if(forReturn[i].length() > kElement){
                word = forReturn[i].toCharArray();
                word[kElement-1] = symbolFoChange;
                    forReturn[i] = String.copyValueOf(word);
            }
        }
        return forReturn;
    }

    public void changeTheMistakenlyPrintedLetterA( String[] str ){

        for(int i = 0;i<str.length;i++) {


        }

    }

    public void printResultingString(String[] str){
        for(String a : str){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args){
        String test = "Мама не мыла раму";
        String task2 = "Маpapapapa p a ps prff  p a";

        TextHandler tr = new TextHandler();
        //tr.printResultingString(tr.changekElementToSymbol(test,2,'o'));
        System.out.println();
        //tr.changeTheMistakenlyPrintedLetterA(task2,"pa","po");
    }
}
