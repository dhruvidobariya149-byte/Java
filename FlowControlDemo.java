public class FlowControlDemo {

    public static void main(String[] args) {

        // if-else Demo
        int age = 18;

        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }

        // switch Demo
        int day = 2;

        switch(day){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        // for loop Demo
        System.out.println("For Loop:");

        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        // while loop Demo
        System.out.println("While Loop:");

        int j = 1;

        while(j <= 3){
            System.out.println(j);
            j++;
        }

        // do-while loop Demo
        System.out.println("Do While Loop:");

        int k = 1;

        do{
            System.out.println(k);
            k++;
        }
        while(k <= 3);

        // break Demo
        System.out.println("Break Example:");

        for(int x=1; x<=5; x++){

            if(x == 3){
                break;
            }

            System.out.println(x);
        }

        // continue Demo
        System.out.println("Continue Example:");

        for(int y=1; y<=5; y++){

            if(y == 3){
                continue;
            }

            System.out.println(y);
        }

    }
}