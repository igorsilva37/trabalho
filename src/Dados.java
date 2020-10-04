public class Dados {
    
    private String comum;
    private String rapido;
    private String prioritario;
    private int numC,numR, numP;

    public Dados(String comum, String rapido, String prioritario, int numC,int numR,int numP) {
        this.comum = comum;
        this.rapido = rapido;
        this.prioritario = prioritario;
        this.numC = numC;
        this.numR = numR;
        this.numP = numP;
        
    }

    public Dados() {
        this.comum = "";
        this.rapido = "";
        this.prioritario = "";
        this.numC = 1;
        this.numR = 1;
        this.numP = 1;
    }    

    Dados(String comum, int numC,int numR,int numP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getNumC() {
        return numC;
    }

    public int getNumR() {
        return numR;
    }

    public int getNumP() {
        return numP;
    }
    
    public String getComum() {
        return comum;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public void setComum(String comum) {
        this.comum = comum;
    }

    public String getRapido() {
        return rapido;
    }

    public void setRapido(String rapido) {
        this.rapido = rapido;
    }

    public String getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(String prioritario) {
        this.prioritario = prioritario;
    }

   /* public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
*/
    @Override
    public String toString() {
        return "Dados{"+", comum=" + comum + ", rapido=" + rapido + 
                ", prioritario=" + prioritario + ", numC=" + numC + 
                ", numR=" + numR +", num=" + numP +'}';
    }

    
}
