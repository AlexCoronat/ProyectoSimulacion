public class Actuador {
    cosaGenerica c1;
    cosaGenerica a1;
    cosaGenerica b1;
    cosaGenerica p1;
    cosaGenerica t1;
    cosaGenerica sp1;
    cosaGenerica pr1,pr2,pr3,pr4;
    
    Actuador(int estado_inical){
        this.estado_inicial = estado_inical;
        
    }
    
    public class cosaGenerica{
        int estado_inicial;
        int estado_final;
        cosaGenerica(int estado_inical){
            this.estado_inicial = estado_inical;
        
        }
        public int get(){
            return this.estado_final;
        }
        public void set(int ei){
            this.estado_final = ei;
            
        }
        
        public void reglas_Camara(){
            if(t1.get() == 0){
                c1.set(1);
            }else if(t1.get() == 1){
                c1.set(0);
            }
            if(pr1.get() == 1 && pr2.get() == 1 &&pr3.get() == 1 && pr4.get() == 1 && t1.get() == 1){
                c1.set(1);
            }
        }
        public void reglas_sensorPuerta(){
            if(t1.get() == 0){
                sp1.set(2);
            }else if(t1.get() == 1){
                sp1.set(1);
            }
        }
        public void reglas_sensoresPresencia(){
            if(t1.get() == 0){
                pr1.set(0);
                pr2.set(0);
                pr3.set(0);
                pr4.set(0);
            }else if(t1.get() == 1){
                pr1.set(1);
                pr2.set(1);
                pr3.set(1);
                pr4.set(1);
            }
        }
    }
    
    
}
