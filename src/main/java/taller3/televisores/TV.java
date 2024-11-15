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

    Marca getMarca(){
        return marca;
    }
    void setMarca(Marca marca){
        this.marca = marca;
    }

    int getCanal(){
        return canal;
    } 
    void setCanal(int canal){
        this.canal = canal;
    }

    int getPrecio(){
        return precio;
    }
    void setPrecio(int precio){
        this.precio = precio;
    }

    int getVolumen(){
        return volumen;
    }
    void setVolumen (int volumen){
        this.volumen = volumen;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }

    public void turnOn(){
        this.estado = true;
    }
    void turnOff(){
        this.estado = false;
    }
    boolean getEstado(){
        return estado;
    }

    void canalUp(){
        if (this.estado == true){
            if (canal >= 1 && canal <= 120){
                canal++;
            }  
        }
        
    }
    void canalDown(){
        if (this.estado == true){
            if (canal >= 1 && canal <= 120){
                canal--;
            }  
        }
        
    }

    void volumenUp(){
        if (this.volumen >= 0 && this.volumen <= 7){
            volumen++;
        }
    }
    void volumenDown(){
        if (this.volumen >= 0 && this.volumen <= 7){
            volumen--;
        }
    }

}
