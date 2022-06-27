

public class Main {
    public static void main(String[] args) {
        int answer = 0;

            for(int i = 0; i <9; i++) {
                int n = args;
                answer += args % 10;
                args /= 10;
            }

       System.out.println(answer);

    }
}