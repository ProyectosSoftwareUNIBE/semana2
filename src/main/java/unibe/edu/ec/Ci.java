package unibe.edu.ec;

public class Ci {
    private String ci;

    public Ci(String ci) {
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public boolean validateLength() {
        if (this.ci.length() == 10) return true;
        return false;
    }

    public String[] transformInToArray() {
        return this.ci.split("");
    }

    public boolean validateState() {
        String[] ci = this.transformInToArray();
        int state = (Integer.parseInt(ci[0]) * 10) + (Integer.parseInt(ci[1]));
        if (state < 27) return true;
        return false;
    }

    public boolean validateTirdDigit() {
        String[] ci = this.transformInToArray();
        int tirdDigit = Integer.parseInt(ci[2]);
        if (tirdDigit < 7) return true;
        return false;
    }

    public int getSupiriorTen(int ten) {
        int residue;

        if (ten % 10 == 0) {
            return ten;
        } else {
            residue = ten / 10;
            return (residue + 1) * 10;
        }
    }

    public boolean validateLastDigit() {
        String[] ci = this.transformInToArray();
        int result = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(ci[i]);
            if (i % 2 == 0) {
                digit = digit * 2;
                if (9 < digit) {
                    digit = digit - 9;
                }
                result += digit;
            } else {

                result += digit;
            }
        }
        int superiorTen = this.getSupiriorTen(result);
        result = superiorTen - result;
        int digit = Integer.parseInt(ci[9]);
        if (result == digit) return true;
        return false;
    }

    public boolean validateCi() {
        if (this.validateLength()) {
            if (this.validateState()) {
                if (this.validateTirdDigit()) {
                    return this.validateLastDigit();
                }
                return false;
            }
            return false;
        }
        return false;
    }

}
