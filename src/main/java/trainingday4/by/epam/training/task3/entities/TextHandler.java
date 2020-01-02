package trainingday4.by.epam.training.task3.entities;

/**
 * Task 3
 * Программа обработки текста, который может быть получен как с консоли, так и с файла.
 * 1. В каждом слове k-ю букву заменить заданным символом. Если k больше длины слова,
 * корректировку не выполнять.
 * 2. В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А // как определить что ОШИБОЧНО?
 * вместо О. Внести исправления в текст.                                                 // или любую А менять на О?
 * 3. В тексте слова заданной длины заменить указанной подстрокой, длина которой может
 * не совпадать с длиной слова.
 * 4. Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
 * Между последовательностями подряд идущих букв оставить хотя бы один пробел.
 * 5. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 */

public class TextHandler {

    public String[] changekElementToSymbol(String[] sentence, int kElement, char symbolFoChange) {
        String[] forReturn = sentence;
        char[] word;
        for (int i = 0; i < forReturn.length; i++) {
            if (forReturn[i].length() > kElement) {
                word = forReturn[i].toCharArray();
                word[kElement - 1] = symbolFoChange;
                forReturn[i] = String.copyValueOf(word);
            }
        }
        return forReturn;
    }

    public String[] changeTheMistakenlyPrintedLetterA(String[] sentence) {
        String[] changed = sentence;
        for (int i = 0; i < changed.length; i++) {
            String change = changed[i];
            char[] word = change.toCharArray();
            for (int y = 0; y < word.length - 1; y++) {
                if (word[y] == 'р') {
                    if (word[y + 1] == 'а') {
                        word[y + 1] = 'о';
                    }
                }
            }
            changed[i] = new String(word);
        }
        return changed;
    }

    public String[] substitutionWordForSubstring(String[] sentence, String change, int lenthWordsToReplace) {
        String[] changed = sentence;
        for (int i = 0; i < changed.length; i++) {
            if (changed[i].length() == lenthWordsToReplace) {
                changed[i] = change;
            }
        }
        return changed;
    }

    public String[] deleteAllButLetters(String[] mustChange) {
        String[] forReturn = mustChange;
        if (mustChange.length == 1) {
            return mustChange;
        }
        for (int i = 0; i < forReturn.length; i++) {
            String str = forReturn[i].replaceAll("[\\d\\W]", "");
            char[] ch = str.toCharArray();
            char[] with = new char[ch.length * 2];
            int count = 0;
            for (int y = 0; y < ch.length; y++) {
                with[count] = ch[y];
                with[count + 1] = ' ';
                count += 2;
            }
            forReturn[i] = new String(with);
        }
        return forReturn;
    }

    public String[] wordsGivenLengthStartingWithVowel(String[] mustChange,int lenthWordWithVowel){
        String[] forReturn = mustChange;
        for(int i =0;i<forReturn.length;i++){
            if(forReturn[i].length() == lenthWordWithVowel){
                char first = forReturn[i].charAt(0);
                if(first == 'а' || first == 'о' || first == 'у' || first == 'ы' || first == 'и' || first == 'э' || first == 'я' || first == 'ю' || first == 'е' || first == 'ё'){
                    forReturn[i] = "";
                }
                if(first == 'А' || first == 'О' || first == 'У' || first == 'И' || first == 'Э' || first == 'Я' || first == 'Ю' || first == 'Е' || first == 'Ё'){
                    forReturn[i] = "";
                }
            }
        }

        return forReturn;
    }

    public static void main(String[] args) {

    }
}
