package Alexandr_Nikitchenko;

/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        int count = 0;
        int sum = 0;
        while (true)
        {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1)
            {
                double itog = (double) sum / count;
                System.out.println(itog);
                break; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!выход из цикла
            }
            else
            {
                sum = sum + n;
                count = count + 1;
            }
        }
    }
}
