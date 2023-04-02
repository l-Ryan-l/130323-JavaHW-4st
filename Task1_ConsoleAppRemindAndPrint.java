import java.util.LinkedList;
import java.util.Scanner;

// Task 1:
// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была
// первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task1_ConsoleAppRemindAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> inputLinkedList = new LinkedList<>();

        System.out.println("""
                Введите значение для строки.
                Для выхода введите 'exit'
                Для удаления предыдущего введенного значения введите 'revert'""");

        while (true) {
            String userInput = sc.nextLine();

            if (userInput.length() == 0) {
                System.out.println("Строка не может быть пустой");
                continue;
            }
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
            if (!userInput.equalsIgnoreCase("revert") &
                    !userInput.equalsIgnoreCase("print")) {
                inputLinkedList.addFirst(userInput);
            }
            if (userInput.equalsIgnoreCase("revert")) {
                inputLinkedList.removeFirst();
            }
            if (userInput.equalsIgnoreCase("print")) {
                System.out.println(inputLinkedList);
            }
        }
        sc.close();
    }
}
