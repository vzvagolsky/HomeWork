
    // Класс, представляющий время
   class Time implements Comparable<Time> {
        private int hour;
        private int minute;

        public Time(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d", hour, minute);
        }

        // Реализация метода compareTo интерфейса Comparable для сравнения времени
        @Override
        public int compareTo(Time other) {
            if (this.hour != other.hour) {
                return Integer.compare(this.hour, other.hour);
            } else {
                return Integer.compare(this.minute, other.minute);
            }
        }
    }

