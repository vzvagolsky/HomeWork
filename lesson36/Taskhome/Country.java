import java.util.*;


    class Country {
        private String name;

        public Country(String name) {
            this.name = name;
        }

        // Геттер для имени страны
        public String getName() {
            return name;
        }

        // Переопределение методов equals() и hashCode()
        // (необходимо для корректной работы HashMap)
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Country country = (Country) obj;
            return Objects.equals(name, country.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }


