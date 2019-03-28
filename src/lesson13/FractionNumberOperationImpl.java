package lesson13;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int obshiiZnam = a.getDivisor()*b.getDivisor();
        a.setDividend(a.getDividend()*b.getDivisor());
        b.setDividend(b.getDividend()*a.getDivisor());
        a.setDivisor(obshiiZnam);
        b.setDivisor(obshiiZnam);
        return null;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
