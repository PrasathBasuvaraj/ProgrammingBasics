public class ForEachSampleOne {
    public static void main(String[] args) {
        String[] coders = {"Karthick", "Lokesh", "Prasath", "Anonymous"};
        for(String coder : coders ) {
            System.out.println("Identified new coder :" + coder);
        }

        for (int index = 0; index < coders.length ; index++) {
            coders[index] = "Dummy Coder";
            System.out.println("Identified new coder at position :" + index);
            System.out.println("Identified new coder :" + coders[index]);
        }
    }
}
