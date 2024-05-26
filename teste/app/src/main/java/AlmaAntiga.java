public class AlmaAntiga {
    public static String AlmaAntiga(int cvmp, int namp, int nimp, int nemp, int cfmp, int cpmp, int ccmp, int djm, int dam, int dmm, int ppmp, int spmp, int tpmp, int qpmp){
         StringBuffer texto = new StringBuffer();
         float nov = 0;
         float soma = 14;
         boolean sim = false;
         int[] v = new int[14];
        v[0] = cvmp;
        v[1] = namp;
        v[2] = nimp;
        v[3] = nemp;
        v[4] = cfmp;
        v[5] = cpmp;
        v[6] = ccmp;
        v[7] = djm;
        v[8] = dam;
        v[9] = dmm;
        v[10] = ppmp;
        v[11] = spmp;
        v[12] = tpmp;
        v[13] = qpmp;
        
        if (v[7] == 0 || v[8] == 0 || v[9] == 0){
            sim = true;
        }

        for (int i = 0; i < 14; i++) {
            if (v[i] == 9) {
                nov = nov + 1;
            }
        }
        nov = (nov / soma) * 100;
        if (nov >= 21){sim = true;}
        
        if (sim == false) {texto.append("\nEste mapa não é alma antiga.");}
        if (sim == true) {texto.append("\nEste mapa é alma antiga.");}
        
         return texto.toString();
    }
    
}
