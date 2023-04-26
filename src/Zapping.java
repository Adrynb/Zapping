public class Zapping {


    public int Canales(int CanalOrigen, int CanalDestino){
        int clicks = 0;

        for(int i = CanalOrigen; i < CanalDestino; i++ ){
             clicks+=1;
        }
        int clicksInversa = CanalesReversa(CanalOrigen, CanalDestino);

        if(clicks < clicksInversa){
            return clicks;
        }
        else{
            return clicksInversa;
        }

    }

    public int CanalesReversa(int CanalOrigen, int CanalDestino){
        int clicks = 0;

        while(CanalOrigen != CanalDestino){
            CanalOrigen--;
            clicks++;

            if(CanalOrigen == 0){
                CanalOrigen = 99;
            }
        }

        return clicks;
    }

}
