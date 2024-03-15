import java.util.*;

/*

Создать отображение HashMap, где ключом является объект класса Country,
	а значением - список строк
        (названия городов в этой стране).
		Затем добавить несколько городов для каждой страны и
		вывести все страны на консоль в алфавитном порядке.
 */
public class Task19 {

        public static void main(String[] args) {
            // Создание отображения HashMap
            Map<Country, List<String>> countries = new HashMap<>();

            // Добавление городов для каждой страны
            addCity(countries, new Country("USA"), "New York");
            addCity(countries, new Country("USA"), "Los Angeles");
            addCity(countries, new Country("USA"), "Chicago");

            addCity(countries, new Country("UK"), "London");
            addCity(countries, new Country("UK"), "Manchester");
            addCity(countries, new Country("UK"), "Birmingham");

            // Вывод всех стран на консоль в алфавитном порядке
            List<Country> sortedCountries = new ArrayList<>(countries.keySet());
            Collections.sort(sortedCountries, Comparator.comparing(Country::getName));
            for (Country country : sortedCountries) {
                System.out.println(country.getName() + ": " + countries.get(country));
            }
        }

        // Метод для добавления города для указанной страны
        private static void addCity(Map<Country, List<String>> countries,
                                    Country country, String city) {
            // Получение списка городов для указанной страны
            List<String> cities = countries.getOrDefault(country, new ArrayList<>());
            // Добавление нового города в список
            cities.add(city);
            // Помещение списка обратно в отображение
            countries.put(country, cities);
        }
    }



