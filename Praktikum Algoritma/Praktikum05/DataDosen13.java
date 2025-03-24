public class DataDosen13 {
    Dosen13 dataDosen[] = new Dosen13[5];
    int idx;

    void tambah(Dosen13 d){
        if(idx < dataDosen.length){
            dataDosen[idx] = d;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(int i = 0; i < dataDosen.length; i++){
            dataDosen[i].tampilInformasi();
        }

    }

    void sortingASC(){
        for(int i = 0; i < dataDosen.length - 1; i++){
            for(int j = 0; j < dataDosen.length - i - 1; j++){
                if(dataDosen[j].usia > dataDosen[j + 1].usia){
                    Dosen13 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                    }
                }
            }
            tampil();
        }
        
    void SortingDSC(){
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen13 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        tampil();
    }

    void insertionSort(){
        for(int i=1; i<idx;i++){
            Dosen13 temp = dataDosen[i];
            int j = i;
            while(j>0 && dataDosen[j-1].usia > temp.usia){
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
        tampil();
    }
}
