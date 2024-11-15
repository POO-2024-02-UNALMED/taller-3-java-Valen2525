package taller3.televisores;

public class TV {
    private Marca marca;
    int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca; this.estado = estado; canal = 1; precio = 500; volumen = 1; numTV++;
    }

    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public int getCanal(){
        return canal;
    } 
    public void setCanal(int canal){
        if (this.estado == true){
            if (canal >= 1 && canal <= 120){
                this.canal = canal;
            }  
        }
    }

    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen(){
        return volumen;
    }
    public void setVolumen (int volumen){
        if (volumen >= 0 && volumen <= 7){
                this.volumen = volumen;
            }  
    }

    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return control;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }
    public static int getNumTV(){
        return numTV;
    }

    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public boolean getEstado(){
        return estado;
    }

    public void canalUp(){
        if (this.estado == true){
            if (canal >= 1 && canal <= 120){
                canal++;
            }  
        }
        
    }
    public void canalDown(){
        if (this.estado == true){
            if (canal >= 1 && canal <= 120){
                canal--;
            }  
        }
        
    }

    public void volumenUp(){
        if (this.volumen >= 0 && this.volumen <= 7){
            volumen++;
        }
    }
    public void volumenDown(){
        if (this.volumen >= 0 && this.volumen <= 7){
            volumen--;
        }
    }

    public void enlazar(Control control){
        this.control = control;
        control.setTv(this);
    }

}
