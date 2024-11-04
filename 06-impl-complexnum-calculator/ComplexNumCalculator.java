public class ComplexNumCalculator {
    private int n0peDone;
    private ComplexNum lastRes;

    public void Build() {

    }

    ComplexNum add(ComplexNum primo, ComplexNum secondo) {
        ComplexNum somma=new ComplexNum();
        somma.build(0, 0);
        somma.re=primo.re+secondo.re;
        somma.mi=primo.mi+secondo.mi;
        return somma;
    }
    ComplexNum sub(ComplexNum primo, ComplexNum secondo) {
        ComplexNum somma=new ComplexNum();
        somma.build(0, 0);
        somma.re=primo.re-secondo.re;
        somma.mi=primo.mi-secondo.mi;
        return somma;
    }
    ComplexNum mul(ComplexNum primo, ComplexNum secondo) {
        ComplexNum somma=new ComplexNum();
        somma.build(0, 0);
        somma.re=primo.re*secondo.re;
        somma.mi=primo.mi*secondo.mi;
        return somma;
    }
    ComplexNum div(ComplexNum primo, ComplexNum secondo) {
        ComplexNum somma=new ComplexNum();
        somma.build(0, 0);
        somma.re=primo.re/secondo.re;
        somma.mi=primo.mi/secondo.mi;
        return somma;
    }
}
