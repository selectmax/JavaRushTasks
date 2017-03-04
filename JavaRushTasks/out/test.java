package out;

class Main
{
    public int count = 0;     //объявили переменную класса

    public void run()
    {
        count = 15;           //обращение к переменной класса
        int count = 10;       //объявили локальную переменную метода
        count ++;
        System.out.println(count);//обращение к переменной метода
    }

    System.out.println(count); /
}