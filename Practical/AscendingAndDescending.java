import java.util.*;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] inputs = new Integer[3];

        for(int i = 0; i < inputs.length; ++i)
        {
            System.out.println("Input number " + (i + 1) + ":");
            inputs[i] = scanner.nextInt();
        }

        Arrays.sort(inputs);

        System.out.println(Arrays.asList(inputs));

        Collections.reverse(Arrays.asList(inputs));
        System.out.println(Arrays.asList(inputs));
    }
}