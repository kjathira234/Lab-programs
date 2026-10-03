public class StringManipulation {
    public static void main(String[] args) {
        // 1. Basic String Methods
        String text = "   Learning Java is Fun!   ";
        
        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: " + text.trim());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Length: " + text.length());
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace 'Fun' with 'Awesome': " + text.replace("Fun", "Awesome"));

        // 2. Extracting Data
        String sentence = "The quick brown fox";
        String sub = sentence.substring(4, 9); // Extracts "quick"
        System.out.println("\nSubstring (index 4-9): " + sub);

        // 3. Using StringBuilder (Efficient for heavy modifications)
        StringBuilder sb = new StringBuilder("Reverse Me");
        sb.reverse();
        sb.append(" - Added");
        System.out.println("\nStringBuilder Result: " + sb.toString());

        // 4. Splitting a String (Parsing CSV-style data)
        String csvData = "Apple,Banana,Orange,Mango";
        String[] fruits = csvData.split(",");
        
        System.out.println("\nSplit Results:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
