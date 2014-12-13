/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadachagradove;
import java.util.Random;

/**Решение на задачата чрез автоматично извеждане на произволен брой до 50 имена
 * на
 * градове, предварително зададени като стрингов масив.
 *
 * @author tan4ett
 */
public class Gradove_Variant2 {
    public static void main(String[] args){
    String towns [] = {"Пловдив","София", "Варна","Бургас" ,"Габрово", "Добрич", "Търговище", "Хасково","Стамболово","Куртово Конаре", "Оряхово", "Михайлово", "Калояново", "Аспарухово", "Павликени", "Войводиново", "Момчилград", "Първомай", "Садово", "Търново", "Ахелой", "Карлово", "Сопот", "Ловеч", "Троян", "Трявна", "Асеновград", "Свиленград", "Казанлък", "Перник", "Елхово", "Елена", "Ботевград", "Враца", "Видин", "Дупница", "Стрелча","Стара Загора", "Ямбол", "Русе", "Смолян", "Ахматово", "Любимец", "Лесово", "Поповица", "Стражица", "Чирпан", "Своге"};
    
    Random rand = new Random();
        
    int i=rand.nextInt(50)+1;
    int n=rand.nextInt(50)+1;
    String newTowns [] = new String [n];
    for(i=0; i<n; i++){
        
        newTowns[i]= towns[i];
        System.out.println(newTowns [i]);
    }
        System.out.println("От изброените " + n + " градa,");
        завършващиНаОво(newTowns, "ово");
        
    }   
       public static void завършващиНаОво(String m[], String search){
          System.out.println("на " + search + " завършват:");
          for(int i=0;i<m.length;i++)
          if(m[i].toLowerCase().endsWith(search.toLowerCase()))
          System.out.println(m[i]);
    
    }
}

