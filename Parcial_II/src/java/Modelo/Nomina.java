package Modelo;

public class Nomina extends Empleado {

    long auxilioTransporte, salud, pension,totalDev;
    double salario;
    int dias;

    public Nomina() {
    }

    public Nomina(double salario, long auxilioTransporte, long salud, long pension, int dias) {
        this.salario = salario;
        this.auxilioTransporte = auxilioTransporte;
        this.salud = salud;
        this.pension = pension;
        this.dias = dias;
    }

    public double getSalario(){
        return (double)Math.round(salario*10d)/10;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public long getAuxilioTransporte() {
        long auxTrans;
        
        if (this.salario < 908526 * 2) {
           auxTrans=this.auxilioTransporte = 106454;
        } else {
          auxTrans=this.auxilioTransporte = 0;
        }
        return auxTrans;
    }

    public void setAuxilioTransporte(long auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public long getSalud() {
        long saludo;
        saludo=this.salud = (long) (this.salario * 0.04);
        return saludo;
    }

    public void setSalud(long salud) {
        this.salud = salud;
    }

    public long getPension() {
        long pensiono;
        pensiono=this.pension = (long) (this.salario * 0.04);
        return pensiono;
    }

    public void setPension(long pension) {
        this.pension = pension;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public double calSalarioB() {
        double salarioB;
        salarioB=this.salario= (this.salario / 30) * this.dias;
        return (double)Math.round(salarioB*10d)/10;
    }

    public double getTotalDev() {
        double totaldev;
        totaldev=calSalarioB()+getAuxilioTransporte()-getSalud()-getPension();
        return (double)Math.round(totaldev*10d)/10;
    }

    
    
   /*Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (double) ) (this.salario ^ (this.salario >>> 32));
        hash = 47 * hash + (int) (this.auxilioTransporte ^ (this.auxilioTransporte >>> 32));
        hash = 47 * hash + (int) (this.salud ^ (this.salud >>> 32));
        hash = 47 * hash + (int) (this.pension ^ (this.pension >>> 32));
        hash = 47 * hash + this.dias;
        return hash;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nomina other = (Nomina) obj;
        if (this.salario != other.salario) {
            return false;
        }
        if (this.auxilioTransporte != other.auxilioTransporte) {
            return false;
        }
        if (this.salud != other.salud) {
            return false;
        }
        if (this.pension != other.pension) {
            return false;
        }
        if (this.dias != other.dias) {
            return false;
        }
        return true;
    }

}
