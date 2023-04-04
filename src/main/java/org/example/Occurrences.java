package org.example;

import java.util.HashMap;
import java.util.List;

public class Occurrences {
    private final HashMap<String,Integer> listMap = new HashMap<>();
    private final List<String> list;

    public Occurrences(List<String> list)  {
        this.list = list;
        transfer();
    }
    private void transfer() throws NullPointerException{
        try {
            if(!list.isEmpty()) {
                for (String word : list) {
                    if (word.isEmpty()) {
                        continue;
                    } else if (word.equals("null")) {
                        continue;
                    } else if (!listMap.containsKey(word)) {
                        listMap.put(word, 1);
                        continue;
                    }
                    int count = listMap.get(word);
                    listMap.put(word, count + 1);
                }
            }
            else{
                System.out.println("Переданный список пуст!!!!!!!!!!!!!!!");
            }
        }
        catch (NullPointerException e ){
            System.out.println(e.getMessage() +" " + "Недопустимое значение списка = null!!!!!!!!!!!!");
        }
    }

    public int getSumValues(String word){
        if(listMap.containsKey(word)){
            return listMap.get(word);
        }
        else{
            throw new RuntimeException("Не допустимое значение для колекции или же отсутствие элемента.");
        }
    }
}
