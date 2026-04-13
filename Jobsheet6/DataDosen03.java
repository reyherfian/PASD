public class DataDosen03{
    Dosen03[] dataDosen = new Dosen03[10];
    int idx = 0;

    void tambah(Dosen03 dsn) {
    if (idx < dataDosen.length) {
        dataDosen[idx] = dsn;
        idx++;
    }
}

void tampil() {
    for (int i = 0; i < idx; i++) {
        dataDosen[i].tampil();
    }
}

void sortingASC() {
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 1; j < idx - i; j++) {
            if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                Dosen03 tmp = dataDosen[j];
                dataDosen[j] = dataDosen[j - 1];
                dataDosen[j - 1] = tmp;
            }
        }
    }
}

void sortingDSC() {
    for (int i = 0; i < idx - 1; i++) {
        int idxMax = i;
        for (int j = i + 1; j < idx; j++) {
            if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                idxMax = j;
            }
        }

        Dosen03 tmp = dataDosen[idxMax];
        dataDosen[idxMax] = dataDosen[i];
        dataDosen[i] = tmp;
    }
}
}