package Jobsheet11;

public class Cinema03 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";
                System.out.printf(
                    "%s\t%s\n" +
                    "%s\t%s\n" +
                    "%s\t%s\n" +
                    "%s\t%s\n",
                    audience[0][0], audience[0][1],
                    audience[1][0], audience[1][1],
                    audience[2][0], audience[2][1],
                    audience[3][0], audience[3][1]
                );
 
        for (String[] i : audience) {
            System.out.println("Lenght of row: " + i.length);
        }

        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in the row: " + (i + 1) + " " + String.join(",", audience[i]));
        }
        
    }
}

