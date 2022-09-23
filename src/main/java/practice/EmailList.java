package practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> treeSet = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-])?\\.\\w{2,4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            treeSet.add(email.toLowerCase());
        } else {
            System.out.println("Неверный формат email");
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        for (String email : treeSet) {
            System.out.println(email);
        }
        return new ArrayList<>(treeSet);
    }

}
