public class DataDosen13 {
    DOSEN13 dataDosen[] = new DOSEN13[5];
    int idx;

    void tambah(DOSEN13 d){
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

    void tampilPosisi(double x, int pos){
        if (pos !=-1){
            System.out.println("data dosen dengan usia :" + x + "ditemukan pada indeks " + pos);
        } 
        else {
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1){
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + dataDosen[pos].nama);
            System.out.println("jenis kelamin\t : " + dataDosen[pos].jenisKelamin != null ? "laki laki" : "perempuan" );
            System.out.println("usia\t : " +x);
        } 
        else {
            System.out.println("Data dosen dengan usia " +x+ "tidak ditemukan");
        }
    }
    int PencarianDataSequential(double cari){
        int posisi = -1;
        int count = 0;
        for (int j=0; j< dataDosen.length;j++){
            if (dataDosen[j].usia == cari){
                if (posisi == -1){
                    posisi = j;
                }
                count++;
            }
        }

        if (count > 1){
            System.out.println("PERINGATAN!: DITEMUKAN LEBIH DARI SATU DOSEN DENGAN USIA " + cari);
        }
        return posisi;
    }

    int findBinarySearch(double cari2, int left, int right){
        int mid;
        if (right>=left){
            mid = (left + right)/2;
            if (cari2 == dataDosen[mid].usia){
                return (mid);
            }
            else if (dataDosen[mid].usia > cari2){
                return findBinarySearch(cari2, left, mid-1);
            }
            else {
                return findBinarySearch(cari2, mid+1, right);
            }
        }
        return -1;
    }

    void sortingASC(){
        for(int i = 0; i < dataDosen.length - 1; i++){
            for(int j = 0; j < dataDosen.length - i - 1; j++){
                if(dataDosen[j].usia > dataDosen[j + 1].usia){
                    DOSEN13 temp = dataDosen[j];
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
            DOSEN13 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        tampil();
    }

    void insertionSort(){
        for(int i=1; i<idx;i++){
            DOSEN13 temp = dataDosen[i];
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
