import java.util.*;

class Main {
  public static Hashtable<String, Integer> nameToNumber = new Hashtable<String, Integer>();

  public static void main(String[] args) {
    // No we're not going to get all crazy and instantiate this class
    // Having everything static is just fine for this example.
    populateNameToNumberHashMap();
    String numberList = "zero nine five two";
    List<String> listOfNumbersByName = Arrays.asList(numberList.split("\\s"));
    // This actually make Java kina nice!
    Integer average = listOfNumbersByName
      .stream()
      .mapToInt(Main::getNumberByName)
      .sum() / listOfNumbersByName.size();
      
    System.out.println(getNameByNumber(average));
  }

  public static void populateNameToNumberHashMap() {
    nameToNumber.put("zero", 0);
    nameToNumber.put("one", 1);
    nameToNumber.put("two", 2);
    nameToNumber.put("three", 3);
    nameToNumber.put("four", 4);
    nameToNumber.put("five", 5);
    nameToNumber.put("six", 6);
    nameToNumber.put("seven", 7);
    nameToNumber.put("eight", 8);
    nameToNumber.put("nine", 9);
  }

  public static Integer getNumberByName(String name) {
    Integer number = nameToNumber.get(name);
    return number;
  }

  public static String getNameByNumber(Integer num) {
    Hashtable<Integer, String> numberToName = new Hashtable<Integer, String>();
    numberToName.put(0, "zero");
    numberToName.put(1, "one");
    numberToName.put(2, "two");
    numberToName.put(3, "three");
    numberToName.put(4, "four");
    numberToName.put(5, "five");
    numberToName.put(6, "six");
    numberToName.put(7, "seven");
    numberToName.put(8, "eight");
    numberToName.put(9, "nine");

    String name = numberToName.get(num);
    return name;
  }
}
