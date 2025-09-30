public class RunMyProject {



    public static void main(String[] args) {
        RunMyProject rmp = new RunMyProject();

    }

    public RunMyProject(){

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(1000 * Math.random()+1);

            System.out.println(array[i]);
        }

        System.out.println("------------------------------");

        int x = 0;

        while(Math.abs(array[x] - array[x+1]) < 500){
            System.out.println(array[x] - array[x+1]);

            x++;
        }
    }
}
