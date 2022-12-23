public class homeWork {
    public static void main (String [] args){




int num = 0;
while (num < 10){
    num++;
    System.out.print(num + " ");

}
        System.out.println();

for (int i = 10; i > 0; i-- ){
    System.out.print(i + " ");
}
        System.out.println();

int day = 5;
for (int d = day; d <= 31; d+=7 ){

        System.out.println( "today is friday " + d + " need your report" );
    }

int currentYear = 2021;

int start = currentYear - 200;
int end = currentYear + 100;
for (int year = start; year < end; year ++){
    if (year % 79 == 0){
        System.out.println(year);

    }
}





    }

}
