public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] found = new int[10];
        int count;
        System.out.print("You array is: ");
        for(int i = 0; i < 10; i++){
            array[i] = random();
            System.out.print(array[i] + " ");
        }
        System.out.println(".\n");
        for(int i = 0; i < array.length; i++){
            count = 0;
            if(!alreadyFound(array[i], found)){
                for(int j = i; j < array.length; j++){
                    if (array[i] == array[j])
                        count++;
                }
                if(count > 1)
                    System.out.println(array[i] + " occurs " + count + " times!");
                found[i] = array[i];
            }

        }
    }
    public static boolean alreadyFound(int current, int[] found){
        for (int i : found) {
            if (current == i)
                return true;
        }
        return false;
    }
    public static int random(){
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
}