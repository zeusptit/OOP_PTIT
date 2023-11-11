public class Person implements Comparable<Person>{
    private String name;
    private String dob;

    public Person(String input) {
        int idx = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                idx = i;
                break;
            }
        }
        this.name = input.substring(0, idx);
        this.dob = input.substring(idx + 7) + input.substring(idx + 4, idx + 6) + input.substring(idx + 1, idx + 3);
    }

    @Override
    public int compareTo(Person o) {
        return o.dob.compareTo(dob);
    }

    @Override
    public String toString() {
        return name;
    }
}
