public class Main {
    public static void main(String[] args) {
        /*int clientOS=0;
        int yearOfProduct=2014;
        if (yearOfProduct>=2015) {
            System.out.println("применяется стандартная установка,установка по ссылке, ждите;");
        } else {
            System.out.println("Применяется упрощённая установка облегчённого в-та ОС,установить по ссылке, ждите");
        }
        if (clientOS<=0) {
            System.out.println("К установке подлежит iOS: установка по ссылке, ждите...");
        }else {
            System.out.println("Установить/по тех. условиям/ -Android; установка по ссылке, ждите...");
        }
        System.out.println("Выще написан код 1й задачи");

        System.out.println("Комбинированное решение задач1й и 2й");
*/
        System.out.println("Решение 3й задачи");
        int year=2022;
        int proverka=(year%4);
        if (proverka==0||proverka==100) {
          System.out.println("Год високосный!!!");
        }else if (proverka==25||proverka!=0){
            System.out.println("Год-ОБЫЧНЫЙ.");
        }
    }
}