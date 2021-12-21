package carlos.cesar.aancoraactivity;

public class Resposta {

   public int id;
   // tipos são o valor(resultante da soma de 5 questões especificas + divisão pelo mesmo numero
   // ) obtendo assim seu resultado  ja a string é a descrição que devera retornar junto com
   // cada valor especifico
    public double tpA,tpB,tpC,tpD,tpE,tpF,tpG,tpH;//tp de tipo...no caso 8 tipos de resultado receberam o valor  da nota
    public String tipA,tipB,tipC,tipD,tipE,tipF,tipG,tipH;//tp de tipo...no caso 8 tipos de resultado receberam um texto caracteristico

    @Override
    public String toString() {
        return "Resposta{" +
                "tpA=" + tpA +", tipA='" + tipA + '\'' +
                ", tpB=" + tpB +", tipB='" + tipB + '\'' +
                ", tpC=" + tpC +", tipC='" + tipC + '\'' +
                ", tpD=" + tpD +", tipD='" + tipD + '\'' +
                ", tpE=" + tpE +  ", tipE='" + tipE + '\'' +
                ", tpF=" + tpF + ", tipF='" + tipF + '\'' +
                ", tpG=" + tpG +", tipG='" + tipG + '\'' +
                ", tpH=" + tpH +", tipH='" + tipH + '\'' +
                '}';
    }

    public Resposta() {//contrutor vazio
    }

    public Resposta(double tpA, double tpB, double tpC, double tpD, double tpE, double tpF, double tpG, double tpH, String tipA, String tipB, String tipC, String tipD, String tipE, String tipF, String tipG, String tipH) {
        this.tpA = tpA;
        this.tpB = tpB;
        this.tpC = tpC;
        this.tpD = tpD;
        this.tpE = tpE;
        this.tpF = tpF;
        this.tpG = tpG;
        this.tpH = tpH;
        this.tipA = tipA;
        this.tipB = tipB;
        this.tipC = tipC;
        this.tipD = tipD;
        this.tipE = tipE;
        this.tipF = tipF;
        this.tipG = tipG;
        this.tipH = tipH;
    }

    public Resposta(int id, double tpA, double tpB, double tpC, double tpD, double tpE, double tpF, double tpG, double tpH, String tipA, String tipB, String tipC, String tipD, String tipE, String tipF, String tipG, String tipH) {
        this.id = id;
        this.tpA = tpA;
        this.tpB = tpB;
        this.tpC = tpC;
        this.tpD = tpD;
        this.tpE = tpE;
        this.tpF = tpF;
        this.tpG = tpG;
        this.tpH = tpH;
        this.tipA = tipA;
        this.tipB = tipB;
        this.tipC = tipC;
        this.tipD = tipD;
        this.tipE = tipE;
        this.tipF = tipF;
        this.tipG = tipG;
        this.tipH = tipH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTpA() {
        return tpA;
    }

    public void setTpA(double tpA) {
        this.tpA = tpA;
    }

    public double getTpB() {
        return tpB;
    }

    public void setTpB(double tpB) {
        this.tpB = tpB;
    }

    public double getTpC() {
        return tpC;
    }

    public void setTpC(double tpC) {
        this.tpC = tpC;
    }

    public double getTpD() {
        return tpD;
    }

    public void setTpD(double tpD) {
        this.tpD = tpD;
    }

    public double getTpE() {
        return tpE;
    }

    public void setTpE(double tpE) {
        this.tpE = tpE;
    }

    public double getTpF() {
        return tpF;
    }

    public void setTpF(double tpF) {
        this.tpF = tpF;
    }

    public double getTpG() {
        return tpG;
    }

    public void setTpG(double tpG) {
        this.tpG = tpG;
    }

    public double getTpH() {
        return tpH;
    }

    public void setTpH(double tpH) {
        this.tpH = tpH;
    }

    public String getTipA() {
        return tipA;
    }

    public void setTipA(String tipA) {
        this.tipA = tipA;
    }

    public String getTipB() {
        return tipB;
    }

    public void setTipB(String tipB) {
        this.tipB = tipB;
    }

    public String getTipC() {
        return tipC;
    }

    public void setTipC(String tipC) {
        this.tipC = tipC;
    }

    public String getTipD() {
        return tipD;
    }

    public void setTipD(String tipD) {
        this.tipD = tipD;
    }

    public String getTipE() {
        return tipE;
    }

    public void setTipE(String tipE) {
        this.tipE = tipE;
    }

    public String getTipF() {
        return tipF;
    }

    public void setTipF(String tipF) {
        this.tipF = tipF;
    }

    public String getTipG() {
        return tipG;
    }

    public void setTipG(String tipG) {
        this.tipG = tipG;
    }

    public String getTipH() {
        return tipH;
    }

    public void setTipH(String tipH) {
        this.tipH = tipH;
    }
}
