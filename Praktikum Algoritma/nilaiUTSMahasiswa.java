package minggu5;

public class nilaiUTSMahasiswa {
     
    //tertinggi
    int nilaiUTStertinggi(int[] nilaiUTS, int l, int r){
        if (l==r){
            return nilaiUTS[l];
        }

        int mid = (l+r) / 2;
        int ltertinggi = nilaiUTStertinggi(nilaiUTS,l,mid);
        int rtertinggi = nilaiUTStertinggi(nilaiUTS,mid+1,r);

        if (ltertinggi > rtertinggi){

            return ltertinggi;
        }else {

            return rtertinggi;
        }
    }

    //terendah
    int nilaiUTSterendah(int[] nilaiUTS, int l, int r){
        if (l == r){
            return nilaiUTS[l];
        }

        int mid = (l+r) / 2;
        int lterendah = nilaiUTSterendah(nilaiUTS,l,mid);
        int rterendah = nilaiUTSterendah(nilaiUTS,mid+1,r);

        if (lterendah < rterendah){
            return lterendah;
        }else {
            return rterendah;
        }
    }

    //ratarataUTS
    double rataRata(int[] nilaiUTS){
        int total = 0;
        for (int i = 0;i < nilaiUTS.length;i++){
            total += nilaiUTS[i];
        }
        return total / nilaiUTS.length;
    }

    //ratarataUAS
    double rataRataUAS(int[] nilaiUAS){
        int total = 0;
        for (int i = 0;i < nilaiUAS.length;i++){
            total += nilaiUAS[i];
           
        }
        return total / nilaiUAS.length;
    }



    
}
