package tudelft.roman;

enum RomanNumeralDigits {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);



    private int digitValue;

    // enum constructor is private by default, therefore here redundant. In fact, adding public would give compilation error.
    private RomanNumeralDigits(int digitValue) {
        this.digitValue = digitValue;
    }

    public static RomanNumeralDigits fromString(String digit) {

        for(RomanNumeralDigits romanNumeralDigit : RomanNumeralDigits.values()) {
            if(romanNumeralDigit.toString().equals(digit)) {
                return romanNumeralDigit;
            }
        }
        throw new IllegalStateException("Invalid value for digit=" + digit);
    }

    public int getDigitValue() {
        return digitValue;
    }

}
