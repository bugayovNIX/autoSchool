package com.nixsolutions.autoschool.bugayov.task5_2;

import com.nixsolutions.autoschool.bugayov.task2_5.ArrayHelper;

import java.time.LocalDate;
import java.util.*;

class CollectionsHelper {

    private String[] arrayOfStrings;
    private Set<String> setOfStrings;
    private List<String> listOfStrings;
    private Map<String, String> mapOfStrings;
    private ArrayHelper consoleReader = new ArrayHelper();

    /**
     * print out of a collection in a console
     *
     * @param map               a collection to be printed
     * @param entryItemsToPrint specifies which of a collection entry's members to be printed:
     *                          0 - the whole mapped pair (both key and value);
     *                          1 - only a key;
     *                          2 - only a value;
     */
    private void printoutCollection(Map<String, String> map, int entryItemsToPrint) {

        for (Map.Entry<String, String> mappedPair : map.entrySet()) {
            switch (entryItemsToPrint) {
                case 0:
                    System.out.printf("\n%s - %s", mappedPair.getKey(), mappedPair.getValue());
                    break;
                case 1:
                    System.out.printf("\n%s", mappedPair.getKey());
                    break;
                case 2:
                    System.out.printf("\n%s", mappedPair.getValue());
                    break;
                default:
                    System.out.println("Invalid case");
                    break;
            }
        }
    }

    //      Задачи на HashSet

    // 1. HashSet из растений 
    // Создать коллекцию HashSet с типом элементов String.  
    // Добавить в неё 10 строк:
    // арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель.  
    // Вывести содержимое коллекции на экран", "каждый элемент с новой строки. 
    // Посмотреть", "как изменился порядок добавленных элементов.

    void setOfGreens() {
        arrayOfStrings = new String[]{"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        setOfStrings = new HashSet<>(Arrays.asList(arrayOfStrings));

        Iterator<String> setOfGreensIterator = setOfStrings.iterator();
        setOfGreensIterator.forEachRemaining(x -> System.out.printf("\n%s", x));
    }

    // 2. HashMap из 10 пар 
    // Создать коллекцию HashMap<String", "String>,
    // занести туда 10 пар строк:
    // арбуз – ягода", "банан – трава", "вишня – ягода", "груша – фрукт", "дыня – овощ", "ежевика – куст", "жень-шень – корень", "земляника – ягода", "ирис – цветок", "картофель – клубень.  
    // Вывести содержимое коллекции на экран", "каждый элемент с новой строки. 
    // Пример вывода (тут показана только одна строка): картофель – клубень

    void mapOfGreens() {

        mapOfStrings = new HashMap<>();
        arrayOfStrings = new String[]{"арбуз – ягода", "банан – трава", "вишня – ягода", "груша – фрукт", "дыня – овощ", "ежевика – куст", "жень-шень – корень", "земляника – ягода", "ирис – цветок", "картофель – клубень"};

        for (String pairToMap : arrayOfStrings) {
            int keyFirstChar = pairToMap.indexOf(' ');
            int valueFirstChar = pairToMap.indexOf(' ') + 3;

            String keyForMap = pairToMap.substring(0, keyFirstChar).trim();
            String valueForMap = pairToMap.substring(valueFirstChar);

            mapOfStrings.put(keyForMap, valueForMap);
        }

        printoutCollection(mapOfStrings, 0);

    }

    // 3. Коллекция HashMap из котов
    //  Есть класс Cat, с полем имя (name, String). 
    // Создать коллекцию HashMap<String, Cat>. 
    //  Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    //  Вывести результат на экран, каждый элемент с новой строки.

    void mapOfCats() {

        Map<String, Cat> mapOfCats = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String nameForCat = "Cat_" + (mapOfCats.size() + 1);
            Cat aCat = new Cat(nameForCat);
            mapOfCats.put(aCat.getName(), aCat);
        }

        for (Map.Entry<String, Cat> mappedPair : mapOfCats.entrySet()) {
            System.out.printf("\n%s %s", mappedPair.getKey(), mappedPair.getValue().getName());
        }

    }

    // 4. Вывести на экран список ключей 
    // Есть коллекция HashMap<String, String>,
    // туда занесли 10 различных строк. 
    // Вывести на экран список ключей, каждый элемент с новой строки.

    void namesOfNumbers() {

        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        mapOfStrings = new HashMap<>();

        for (String aName : numberNames) {
            String aKey = mapOfStrings.size() + "";
            mapOfStrings.put(aKey, aName);
        }

        printoutCollection(mapOfStrings, 1);

    }

    // 5. Вывести на экран список значений 
    // Есть коллекция HashMap<String, String>,
    // туда занесли 10 различных строк.  
    // Вывести на экран список значений, каждый элемент с новой строки.

    void printOfMappedPairs() {

        printoutCollection(mapOfStrings, 0);
    }

    // 6. Коллекция HashMap из Object
    //  Есть коллекция HashMap<String, Object>,
    // туда занесли 10 различных пар объектов.  
    // Вывести содержимое коллекции на экран, каждый элемент с новой строки. 
    // Пример вывода (тут показана только одна строка):  Sim - 5

    void mapOfStringsAndObjects() {

        Map<String, Object> mapOfStringsAndObjects = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String aKey = (i + 1) + "";
            mapOfStringsAndObjects.put(aKey, new Cat(aKey));
        }

        for (Map.Entry<String, Object> mappedPair : mapOfStringsAndObjects.entrySet()) {
            Cat extractedValue = (Cat) (mappedPair.getValue());
            System.out.printf("\n%s - %s", mappedPair.getKey(), extractedValue.getName());
        }

    }

    //      Создание и использование ArrayList

    // 7. 5 различных строчек в списке
    // 1. Создай список строк. 
    //  2. Добавь в него 5 различных строчек. 
    // 3. Выведи его размер на экран.  
    // 4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки

    void fiveStringsList() {

        listOfStrings = new ArrayList<>(Arrays.asList("seven", "", "five hundred twenty nine", "balloon", "Ohio"));
        System.out.printf("\nA size of the list is %d\n", listOfStrings.size());
        System.out.println("The list is containing following items:");
        for (String anItem : listOfStrings) {
            System.out.println(anItem);
        }

    }

    // 8. Самая длинная строка
    // 1. Создай список строк.  
    // 2. Считай с клавиатуры 5 строк и добавь в список. 
    //  3. Используя цикл, найди самую длинную строку в списке.  
    // 4. Выведи найденную строку на экран. 
    // 5. Если таких строк несколько, выведи каждую с новой строки.

    // 9. Самая короткая строка
    // 1. Создай список строк.  
    // 2. Считай с клавиатуры 5 строк и добавь в список.  
    // 3. Используя цикл, найди самую короткую строку в списке. 
    // 4. Выведи найденную строку на экран. 
    // 5. Если таких строк несколько, выведи каждую с новой строки

    void longestAndShortestLines() {

        listOfStrings = new ArrayList<>();
        int longestString = 0;
        int shortestString = -1;
        System.out.println("\nType 5 random strings of text (confirm each pressing 'Enter'): ");

        for (int i = 0; i < 5; i++) {
            listOfStrings.add(consoleReader.stringConsoleReader());
            if (listOfStrings.get(i).length() > longestString) {
                longestString = listOfStrings.get(i).length();
            }
            if (shortestString == -1) {
                shortestString = listOfStrings.get(i).length();
            } else if (listOfStrings.get(i).length() < shortestString) {
                shortestString = listOfStrings.get(i).length();
            }
        }

        System.out.println("\nThe longest line(-s) in the list:");
        for (String anItem : listOfStrings) {
            if (anItem.length() >= longestString) {
                System.out.printf("'%s'\n", anItem);
            }
        }

        System.out.println("\nThe shortest line(-s) in the list:");
        for (String anItem : listOfStrings) {
            if (anItem.length() <= shortestString) {
                System.out.printf("'%s'\n", anItem);
            }
        }

    }

    // 10. 10 строчек в начало списка
    // 1. Создай список строк в методе main.  
    // 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.  
    // 3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

    void startFromTheBeginning() {

        listOfStrings = new ArrayList<>();
        System.out.println("\nType 10 random lines of text (confirm each pressing 'Enter'): ");

        for (int i = 0; i < 10; i++) {
            listOfStrings.add(0, consoleReader.stringConsoleReader());
        }

        for (String anItem : listOfStrings) {
            System.out.println(anItem);
        }

    }

    // 11. Удали последнюю строку и вставь её в начало
    // 1. Создай список строк.  
    // 2. Добавь в него 5 строчек с клавиатуры.  
    // 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.  
    // 4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки

    void merryGoRound() {

        listOfStrings = new ArrayList<>();
        System.out.println("\nType 5 random lines of text (confirm each pressing 'Enter'): ");

        for (int i = 0; i < 5; i++) {
            listOfStrings.add(consoleReader.stringConsoleReader());
        }

        for (int i = 0; i < 13; i++) {
            int lastItemInList = listOfStrings.size() - 1;
            listOfStrings.add(0, listOfStrings.get(lastItemInList));
            listOfStrings.remove(lastItemInList + 1);
        }

        for (String anItem : listOfStrings) {
            System.out.println(anItem);
        }

    }

    //      Задачи на Set и Map

    //12. Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».

    void lWords() {

        setOfStrings = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            setOfStrings.add("Лень_" + i);
        }

        for (String aWord : setOfStrings) {
            System.out.printf("\n%s", aWord);
        }

    }

    //13. Создать множество чисел(Set<Integer>),
    // занести туда 20 различных чисел.
    //  Удалить из множества все числа больше 10.

    void randomNumbers() {

        Random randomNumber = new Random();
        Set<Integer> setOfRandomNumbers = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            setOfRandomNumbers.add(randomNumber.nextInt(50));
        }

        System.out.print("\nInitial contents of the set:");
        for (Integer aNumber : setOfRandomNumbers) {
            System.out.printf("\n%s", aNumber);
        }

        Iterator<Integer> setOfRandomNumbersIterator = setOfRandomNumbers.iterator();

        System.out.print("\n\nContents after removal of all 'greater than 10' values:");
        setOfRandomNumbersIterator.forEachRemaining(aNumber -> {
            if (aNumber > 10) {
                setOfRandomNumbersIterator.remove();
            } else {
                System.out.printf("\n%s", aNumber);
            }
        });

    }

    //14. Создать словарь (Map<String, String>)
    // занести в него десять записей по принципу «Фамилия» - «Имя».
    // Проверить сколько людей имеют совпадающие с заданным имя или фамилию.

    void mapOfNames() {

        mapOfStrings = new HashMap<>();
        mapOfStrings.put("surname_4", "name_4");
        mapOfStrings.put("surname_7", "name_7");

        for (int i = 0; i < 8; i++) {
            mapOfStrings.put("surname_" + i, "name_" + i);
        }

        System.out.print("\nContents of the map:");
        printoutCollection(mapOfStrings, 0);
        System.out.println("\nThere are no duplicates in the map since one can not contain them by design.");
    }

    //15. Создать словарь (Map<String, LocalDate>) и
    // занести в него десять записей по принципу: «фамилия» - «дата рождения».
    // Удалить из словаря всех людей, родившихся летом.

    void nameAndBirthday() {

        Map<String, LocalDate> nameAndBirthday = new HashMap<>();

        for (int i = 1; i < 11; i++) {
            nameAndBirthday.put("surname_" + i,
                    LocalDate.of(2000 + i, i, i * 2));
        }

        System.out.print("\nInitial contents of the map:");
        Iterator<Map.Entry<String, LocalDate>> nameAndBirthdayIterator = nameAndBirthday.entrySet().iterator();

        nameAndBirthdayIterator.forEachRemaining(mappedPair -> {
            System.out.printf("\n%s - %d-%d-%d",
                    mappedPair.getKey(),
                    mappedPair.getValue().getYear(),
                    mappedPair.getValue().getMonthValue(),
                    mappedPair.getValue().getDayOfMonth());
            if ((mappedPair.getValue().getMonthValue() > 5)
                    && (mappedPair.getValue().getMonthValue() < 9)) {
                nameAndBirthdayIterator.remove();
            }
        });

        System.out.print("\n\nContents after removal summertime birthdays:");

        for (Map.Entry<String, LocalDate> mappedPair : nameAndBirthday.entrySet()) {
            System.out.printf("\n%s - %d-%d-%d",
                    mappedPair.getKey(),
                    mappedPair.getValue().getYear(),
                    mappedPair.getValue().getMonthValue(),
                    mappedPair.getValue().getDayOfMonth());
        }
    }

    //16. Создать словарь (Map<String, String>)
    // занести в него десять записей по принципу «фамилия» - «имя».
    // Удалить людей, имеющих одинаковые имена.

    void mapWithValueDuplicates() {

        List<String> valuesToCompare = new ArrayList<>();
        Set<String> setOfDups = new HashSet<>();
        mapOfStrings = new HashMap<>();
        mapOfStrings.put("surname_11", "name_4");
        mapOfStrings.put("surname_12", "name_4");

        for (int i = 1; i != 10; i++) {
            mapOfStrings.put("surname_" + i, "name_" + i);
        }

        System.out.print("\nContents of the map:");
        printoutCollection(mapOfStrings, 0);
        Iterator<Map.Entry<String, String>> mapOfStringsIterator = mapOfStrings.entrySet().iterator();

        printoutCollection(mapOfStrings, 2);

        for (int i = 0; i < valuesToCompare.size() - 1; i++) {
            String valueToCompare = valuesToCompare.get(i);
            for (int j = valuesToCompare.size() - 1; j > i + 1; j--) {
                String isDup = valuesToCompare.get(j);
                if (valueToCompare.equals(isDup)) {
                    setOfDups.add(valueToCompare);
                }
            }
        }

        if (setOfDups.size() > 0) {
            mapOfStringsIterator.forEachRemaining(mappedPair -> {
                for (String dupValue : setOfDups) {
                    if (mappedPair.getValue().equals(dupValue)) {
                        mapOfStringsIterator.remove();
                    }
                }
            });
        }

        System.out.print("\n\nContents after removal entries with name duplicates:");
        printoutCollection(mapOfStrings, 0);
    }

//    //17.
//    //1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя». 
//    // 2. Пусть среди этих 10 человек есть люди с одинаковыми именами. 
//    // 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. 
//    // Обратить внимание на количество записей в получившейся коллекции. 
//    // 4. Вывести содержимое Map на экран.
}
