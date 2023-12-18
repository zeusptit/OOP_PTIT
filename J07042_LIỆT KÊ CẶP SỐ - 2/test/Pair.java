    package test;
    import java.io.*;

    public class Pair implements Serializable, Comparable<Pair> {
        private int first, second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

        @Override
        public int compareTo(Pair o) {
            return this.first - o.first;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
