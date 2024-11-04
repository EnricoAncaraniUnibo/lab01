class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
      ComplexNumCalculator calc=new ComplexNumCalculator();
      ComplexNum num1=new ComplexNum();
      ComplexNum num2=new ComplexNum();
      num1.build(1, 2);
      num2.build(2, 3);
      ComplexNum num3=calc.add(num1, num2);
      System.out.println(num3.toStringRep());
      num1.build(4, 5);
      num2.build(6, 7);
      num3=calc.sub(num1, num2);
      System.out.println(num3.toStringRep());
      num1.build(8, 2);
      num2.build(3, 1);
      num3=calc.mul(num1, num2);
      System.out.println(num3.toStringRep());
  }
}
