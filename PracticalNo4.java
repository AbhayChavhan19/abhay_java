public class PracticalNo4 {

    public static void main(String[] args) {
        
        printName("  Bill Joy  ");
    }

    public static void printName(String name) {
        
        name = name.trim();
        
      
        String[] parts = name.split("\\s+");
        String firstName = parts[0];
        String lastName = parts[parts.length - 1];

        StringBuilder formattedName = new StringBuilder();
        formattedName.append(lastName).append(",").append(firstName);

       
        System.out.println(formattedName.toString());
    }
}
