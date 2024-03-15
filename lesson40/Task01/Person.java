import java.util.List;

public class Person {

        private String name;
        private int age;
        private List<String> skills;

        public Person(String name, int age, List<String> skills) {
            this.name = name;
            this.age = age;
            this.skills = skills;
        }

        public int getAge() {
            return age;
        }

        public List<String> getSkills() {
            return skills;
        }
    }


