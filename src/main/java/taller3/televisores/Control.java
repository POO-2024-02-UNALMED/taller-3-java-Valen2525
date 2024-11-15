package taller3.televisores;

public class Control {
    TV tv;
    
    void enlazar(TV tv){
        this.tv = tv;
    }

    void turnOn(){
        tv.turnOn();
    }
    void turnOff(){
        tv.turnOff();
    }

    void canalUp(){
        tv.canalUp();
    }
    void canalDown(){
        tv.canalDown();
    }
    void setCanal(int canal){
        tv.setCanal(canal);;
    }

    void volumenUp(){
        tv.volumenUp();
    }
    void volumenDown(){
        tv.volumenDown();
    }
    void setVolumen(int volumen){
        tv.setVolumen(volumen);;
    }



}
