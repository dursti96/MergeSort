public class MergeAlgo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int zahlen[] = {66,2,23,17,28,14,22,39,44,26,1,8,39,33,15};

        int[] result = halbieren(zahlen);

        for (int i=0; i < result.length; i++) {
            System.out.print(result[i]+", ");
        }
        System.out.println();


    }

    public static int[] halbieren(int[] x){


        int laenge;


        if(x.length % 2 != 0) {
            laenge = x.length/2 + 1;
        }
        else {
            laenge = x.length/2;
        }


        int[] zahlenH1 = new int[x.length/2];
        int[] zahlenH2 = new int[laenge];



        if(x.length>1) {										// if array.length > 1

            for(int a = 0; a < x.length; a++) {					// schleife zum array teilen

                if(a < (x.length/2)) {							// erste hlfte
                    zahlenH1[a] = x[a];
                }
                else {											// zweite hlfte
                    zahlenH2[a-(x.length/2)] = x[a];
                }
            }





            int zahlenH1halb[] = halbieren(zahlenH1);				// geteilten arrays variablen zuweisen
            int zahlenH2halb[] = halbieren(zahlenH2);
            int[] arrayreturn = new int[zahlenH1halb.length+zahlenH2halb.length];

            int zaehlereins = 0;
            int zaehlerzwei = 0;


            for(int i = 0; i < zahlenH1halb.length + zahlenH2halb.length; i++) {			// schleife fr zuweisen zu neuem array; lnge = lnge beider arrays


                if((zaehlereins<zahlenH1halb.length)&&(zaehlerzwei<zahlenH2halb.length)) {	// if nur ausfhren, wenn zhler kleiner als arraylnge; sonst object out of bounds

                    if(zahlenH1halb[zaehlereins] < zahlenH2halb[zaehlerzwei])  {			// welche zahl im array ist kleiner -> arrayreturn[i]
                        arrayreturn[i] = zahlenH1halb[zaehlereins];
                        zaehlereins++;
                    }
                    else {
                        arrayreturn[i] = zahlenH2halb[zaehlerzwei];
                        zaehlerzwei++;
                    }
                }
                else if(!(zaehlereins<zahlenH1halb.length)) {								// wenn zhler nicht kleiner als arraylnge, dann immer anderes array nehmen
                    arrayreturn[i] = zahlenH2halb[zaehlerzwei];
                    zaehlerzwei++;
                }
                else {
                    arrayreturn[i] = zahlenH1halb[zaehlereins];
                    zaehlereins++;
                }


            }
            return arrayreturn;



        }
        else {
            return x;
        }





    }




}
