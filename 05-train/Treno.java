public class Treno {
    private int nTotSeats; //(Numero dei posti totali del treno)
    private int nFirstClassSeats; //(Numero dei posti in prima classe)
    private int nSecondClassSeats; //(Numero dei posti in seconda classe)
    private int nFirstClassReservedSeats; //(Numero dei posti in prima classe già prenotati)
    private int nSecondClassReservedSeats; //(Numero dei posti in seconda classe già prenotati)

    public Treno(int postiTot, int postPrima, int postSeconda, int postPrimaPre, int postSecondaPre) {
        this.nTotSeats=postiTot;
        this.nFirstClassSeats=postPrima;
        this.nSecondClassSeats=postSeconda;
        this.nFirstClassReservedSeats=postPrimaPre;
        this.nSecondClassReservedSeats=postSecondaPre;
    }

    public void reserveFirstClassSeats(int numeroDaRiservare) {
        if(nFirstClassSeats-nFirstClassReservedSeats < numeroDaRiservare) {
            throw new IllegalArgumentException();
        }
        nFirstClassReservedSeats=nFirstClassReservedSeats + numeroDaRiservare;
    }
    public void reserveSecondClassSeats(int numeroDaRiservare) {
        if(nSecondClassSeats - nSecondClassReservedSeats < numeroDaRiservare) {
            throw new IllegalArgumentException();
        }
        nSecondClassReservedSeats=nSecondClassReservedSeats+numeroDaRiservare;
    }
    public double getTotOccupancyRatio() {
        int somma = nFirstClassReservedSeats+nSecondClassReservedSeats;
        double percentuale = (double)somma / (double)nTotSeats*100;
        return percentuale;
    }
    double getFirstClassOccupancyRatio() {
        return (double)nFirstClassReservedSeats/(double)nFirstClassSeats*100;
    }
    double getSecondClassOccupancyRatio() {
        return (double)nSecondClassReservedSeats/(double)nSecondClassSeats*100;
    }
    void deleteAllReservations() {
        nFirstClassReservedSeats=0;
        nSecondClassReservedSeats=0;
    }
}
