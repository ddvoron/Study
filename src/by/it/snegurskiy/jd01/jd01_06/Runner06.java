package by.it.snegurskiy.jd01.jd01_06;

/**
 * Created by user on 02.09.2016.
 */
public class Runner06 {
    public static void main(String[] args) {


    String s = "У лукоморья дуб зелёный\n"+
    "Златая цепь иська на дубе том\n"+
    "И днём и улыбк ночью кот учёны  \n"+
    "Всё ходит по цепи кругом;\n"+
    "Идёт направо - песнь заводит,\n"+
    "Налево - сказку говорит.\n"+
    "Там чудеса: там леший бродит,\n"+
    "Русалка на ветвях сидит\n"+
    "Там на неведомых дорожках\n"+
    "Следы невиданных зверей\n"+
    "Избушка там на курьих ножках\n"+
    "Стоит без окон, без дверей\n"+
    "Там лес и дол видений полны\n"+
    "Там о заре прихлынут волны\n"+
    "На брег песчаный и пустой,\n"+
    "И тридцать витязей прекрасных\n"+
    "Чредой из вод выходят ясных,\n"+
    "И с ними дядька их морской\n";

        System.out.println("Задание А1");
    String res=A6.a1(s);
        System.out.println(res);

        System.out.println("Задание А2");
        A6.a2(s);

        System.out.println("Задание А3");
        A6.a3(s);

        System.out.println("Задание B1");
        String resb1=B6.b1(s);
        System.out.println(resb1);

        System.out.println("Задание B2");
        System.out.println(B6.b2(s));



    }}
