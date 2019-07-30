package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan() {



        String Wunumbers = "";
        for (int x = 1; x < 16; x++) {

            if ((x % 3 == 0) && (x % 5 == 0)) {
                Wunumbers += "WuTang Forever";
            }
                else if (x % 3 == 0) {
                    Wunumbers += "Wu\n";
                }
               else if (x % 5 == 0) {
                    Wunumbers += "Tang\n";

                } else{
                   Wunumbers += x + "\n";
            }


            }

        return Wunumbers;
    }
}




