import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//Task 2:
//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.
public class Task2_RevertLinkedList {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> originLinkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            originLinkedList.add(random.nextInt(1, 10));
        }
        System.out.println("Первичный список: " + originLinkedList.toString());

        List<Integer> ReversedLinkedList = new LinkedList<>();

        for (int i = originLinkedList.size() - 1; i >= 0; i--) {
            ReversedLinkedList.add(originLinkedList.get(i));
        }
        System.out.println("Перевёрнутый LinkedList: " + ReversedLinkedList.toString());
    }
}
