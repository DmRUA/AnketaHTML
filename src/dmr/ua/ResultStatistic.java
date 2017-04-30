package dmr.ua;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DmRG on 05.03.2017.
 */
public class ResultStatistic {
    public static String info(List<Anketa> list, String filterSex, String filterMarried) {
        boolean f = true;
        Map<String, Integer> mapTravel = new HashMap<>();
        Map<String, Integer> mapMusic = new HashMap<>();
        for (Anketa anketa : list) {
            if (anketa.getSex().equals(filterSex)) {
                if (anketa.getMarried().equals(filterMarried)) {
                    f = false;
                    mapTravel.put(anketa.getTravel(), mapTravel.containsKey(anketa.getTravel()) ? mapTravel.get(anketa.getTravel())+1 : 1);
                    for (int i = 0; i < anketa.getMusic().length; i++) {
                        mapMusic.put(anketa.getMusic()[i], mapMusic.containsKey(anketa.getMusic()[i]) ? mapMusic.get(anketa.getMusic()[i])+1:1);
                    }
                }
            }
        }
        if (f) return "Нету статистики по:" + filterSex + " в браке:" + filterMarried;
         else {
            String beginResult = "Статистика по фильтру: "+ filterSex + " в браке:" + filterMarried + " ";
            String strTravel = "Путешествия:";
            String strTraveltemp = "";
            for (Map.Entry<String, Integer> entry : mapTravel.entrySet()) {
                strTraveltemp +=entry.getKey()+ " проголосовало:" + entry.getValue() + ", ";
            }
            strTravel = strTravel + strTraveltemp;
            String strMusic = "По музыкальным предпочтениям:";
            String strMusicTemp = "";
            for (Map.Entry<String, Integer> entry : mapMusic.entrySet()) {
                strMusicTemp += entry.getKey() + " проголосовало:" + entry.getValue() + ", ";
            }
            strMusic = strMusic + strMusicTemp;
             return (beginResult + strTravel + strMusic);
        }
    }
}
