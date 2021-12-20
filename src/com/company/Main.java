package com.company;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


class Disk{
    String artisit;
    String name;
    List<String> songs;

    public Disk(String artisit, String name){
        this.artisit = artisit;
        this.name = name;
        this.songs =  new ArrayList<>();
    }

    @Override
    public String toString(){
        return String.format(
                """
                        %-15s %-15s | %-15s %-15s
                        """,
                "Исполниьель:", this.artisit,
                "Альбом:", this.name
        );
    }

    public void setSongs(List<String> songs){
        this.songs = songs;
    }

}

class CarNote implements Comparable<CarNote>{
    String mark;
    String number;
    String ownerSurname;
    int prodYear;
    int pass;

    public CarNote(String mark, String number, String ownerSurname, int prodYear, int pass){
        this.mark = mark;
        this.number = number;
        this.ownerSurname = ownerSurname;
        this.prodYear = prodYear;
        this.pass = pass;
    }

    @Override
    public String toString(){
        return String.format(
                """
                        %-25s %s
                        %-25s %s
                        %-25s %s
                        %-25s %d
                        %-25s %d
                        """,
                "Марка:", this.mark,
                "Номер:", this.number,
                "Фамилия владельца:", this.ownerSurname,
                "Год выпуска:", this.pass,
                "Пробег:", this.prodYear
        );
    }

    @Override
    public int compareTo(CarNote o) {
        if(this.pass < o.pass)return -1;
        else return 1;
    }
}

public class Main {

    static boolean isReversed(String a, String b){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<a.length();i++){
            stack.push(a.charAt(i));
        }
        for(int i=0; i<b.length();i++){
            Character t = stack.peek();
            stack.pop();
            if(t != b.charAt(i))return false;
        }
        return true;
    }
    public static void main(String[] args) {

	    // task 1
        System.out.println(isReversed("abc", "cba"));

        // task 2
//        Scanner sc = null;
//        try {
//            sc = new Scanner(new FileInputStream("input.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        ArrayDeque<Integer> neg = new ArrayDeque<Integer>();
//        if (sc != null) {
//            while (sc.hasNext()){
//                int temp = sc.nextInt();
//                if (temp < 0) neg.add(temp);
//                else System.out.println(temp);
//            }
//        }
//        while (!neg.isEmpty()){
//            System.out.println(neg.pop());
//        }

        // task 3

//        List<CarNote> notes = new ArrayList<>();
//        notes.add(new CarNote("Toyota", "A345HK", "Криворогов", 2005, 144444));
//        notes.add(new CarNote("Pegeout", "A005AK", "Ровнобыков", 2001, 50000));
//        notes.add(new CarNote("BMW", "O777OO", "Иванов", 2019, 136000));
//        Collections.sort(notes);
//        for(CarNote x: notes)System.out.println(x);


        // task 4
//        HashMap<String,Disk> disks = new HashMap<String,Disk>();
//        disks.put("1", new Disk("Кувалда", "Деликатесы"));
//        disks.get("1").songs.add("На Объекте (пролог)");
//        disks.get("1").songs.add("Бетономешалка");
//        disks.get("1").songs.add("Картофельный Комбайн");
//        disks.get("1").songs.add("Лесная");
//        disks.get("1").songs.add("Твой След Обнаружен");
//        disks.get("1").songs.add("Каток");
//        disks.get("1").songs.add("Я Ваш Мясник!");
//        disks.get("1").songs.add("Повар");
//        disks.get("1").songs.add("Выворотное Меню");
//        disks.get("1").songs.add("Песня Про Сварного");
//        disks.get("1").songs.add("Die Liebe");
//        disks.get("1").songs.add("Дебош");
//        disks.get("1").songs.add("Зуб Дуплович");
//        disks.get("1").songs.add("Мясо");
//        disks.get("1").songs.add("Чудо-Остров");
//        disks.get("1").songs.add("Мозги С Дефектом");
//        disks.get("1").songs.add("Сдача Объекта (эпилог)");
//        disks.get("1").songs.add("Бетономешалка (Dance Mix)");
//        disks.put("2", new Disk("Sexy Sushi", "marre marre marre"));
//        disks.put("3", new Disk("Кровосток", "ЧБ"));
//        disks.put("4", new Disk("Нервы", "Нервы"));
//        Scanner sc = null;
//        boolean isInsideDisc = false;
//        String choosenDisk = "";
//        try {
//            sc = new Scanner(System.in);
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }
//        /* -----------------------------------------------------------
//        * ls        - показывает список элементов текущей директории
//        * cd        - выбирает новую директорию
//        * add       - добавить элемент в директорию
//        * remove    - удалить элемент из директории
//        ----------------------------------------------------------- */
//        while (sc.hasNext()){
//            String _input = sc.nextLine();
//            String[] splitedCommands = _input.split(" ");
//            if(Objects.equals(splitedCommands[0], "ls") && !isInsideDisc){
//                disks.forEach((x, y)->System.out.printf("%-3s | %s", x, y));
//            }
//            if(Objects.equals(splitedCommands[0], "ls") && isInsideDisc){
//                disks.get(choosenDisk).songs.forEach((System.out::println));
//            }
//            if(Objects.equals(splitedCommands[0], "cd") && Objects.equals(splitedCommands[1], "../")){
//                isInsideDisc = false;
//            }
//            if(Objects.equals(splitedCommands[0], "cd") && !Objects.equals(splitedCommands[1], "../")){
//                choosenDisk = splitedCommands[1];
//                isInsideDisc = true;
//            }
//            if(Objects.equals(splitedCommands[0], "add") && !isInsideDisc){
//                String newIndex = String.valueOf(disks.size()+1);
//                disks.put(newIndex, new Disk(splitedCommands[1], splitedCommands[2]));
//            }
//            if(Objects.equals(splitedCommands[0], "add") && isInsideDisc){
//                disks.get(choosenDisk).songs.add(splitedCommands[1]);
//            }
//            if(Objects.equals(splitedCommands[0], "remove") && !isInsideDisc){
//                String newIndex = String.valueOf(disks.size()+1);
//                disks.remove(splitedCommands[1]);
//            }
//            if(Objects.equals(splitedCommands[0], "remove") && isInsideDisc){
//                disks.get(choosenDisk).songs.remove(splitedCommands[1]);
//            }
//
//        }
//


    }
}
