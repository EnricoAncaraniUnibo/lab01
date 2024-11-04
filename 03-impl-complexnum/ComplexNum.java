class ComplexNum {
    /*
     * Inserire qui la dichiarazione dei campi della classe
     */
    double re;
    double mi;

    void build(double re, double im) {
        this.re=re;
        this.mi=im;
    }

    boolean equal(ComplexNum num) {
        /*
         * Implementare il metodo in modo che restituisca true se e solo se il
         * numero complesso è uguale al parametro num passato in input
         */
        return this.re == num.re && this.mi == num.mi;
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
        this.re=this.re+num.re;
        this.mi=this.mi+num.mi;
    }

    String toStringRep() {
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione
         * testuale del numero complesso
         */
        if(this.re>=0) {
            if(this.mi>=0) {
                return "+" + this.re + "+"+this.mi + "I";
            }
            return "+" + this.re + this.mi + "I";
        } else {
            if (this.mi>=0) {
                return this.re + "+" + this.mi+"I";
            }
            return this.re + this.mi + "I";
        }
    }
}