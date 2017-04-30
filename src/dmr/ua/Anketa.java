package dmr.ua;

import java.util.Arrays;

/**
 * Created by DmRG on 04.03.2017.
 */
public class Anketa {
    private String name;
    private String surname;
    private int age;
    private String sex;
    private String married;
    private String travel;
    private String[] music;

    public Anketa(String name, String surname, int age, String sex, String married, String travel, String[] music) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.married = married;
        this.travel = travel;
        this.music = music;
    }

    public Anketa() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String[] getMusic() {
        return music;
    }

    public void setMusic(String[] music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "Anketa{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", married='" + married + '\'' +
                ", relaxTravel='" + travel + '\'' +
                ", music=" + Arrays.toString(music) +
                '}';
    }
}
