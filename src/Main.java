import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> arrayList = new ArrayList<>();
        Random ran = new Random();
        arrayList.add(new City(ran.nextInt(10), "Moscow"));
        arrayList.add(new City(ran.nextInt(10), "Bishkek"));
        arrayList.add(new City(ran.nextInt(10), "Osh"));
        arrayList.add(new City(ran.nextInt(10), "Batken"));
        arrayList.add(new City(ran.nextInt(10), "Naryn"));
        arrayList.add(new City(ran.nextInt(10), "Talas"));
        arrayList.add(new City(ran.nextInt(10), "Yssyk-kol"));
        arrayList.add(new City(ran.nextInt(10), "Jalal-abad"));
        arrayList.add(new City(ran.nextInt(10), "Chui"));
        arrayList.add(new City(ran.nextInt(10), "New York"));

        for (City city : arrayList) {
            System.out.println(city);
        }
        System.out.println();

        TreeSet<City> treeCity = new TreeSet<>(City.cityGetCode);
        for (City city1 : arrayList) {
            if (city1.getCode() % 2 != 0){
                treeCity.add(city1);
            }
        }
        treeCity.forEach(System.out::println);

    }
}