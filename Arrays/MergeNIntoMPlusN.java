public class MergeNIntoMPlusN {
        public void mergeNintoMPlusN(int MN[], int N[]) {
                        
                        Arrays.sort(MN);
                        //System.out.println(MN);
                        int lm = MN.length;
                        int ln = N.length;
                        int i=ln;
                        int k=0,j=0;
                        while(k<lm){
                                if((i<lm) && (MN[i]<N[j]) || (j==ln)){
                                        MN[k] = MN[i];
                                        i++;
                                        k++;
                                        } else {
                                                MN[k] = N[j];
                                                k++;
                                                j++;
                                        }
                                
                        }
                        for(int b=0;b<MN.length;b++){
                        System.out.print(MN[b]+" ");
                        }
        }
}
