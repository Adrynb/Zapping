public class Zapping {

    public int Canales(int CanalOrigen, int CanalDestino) {

        int clicks = 0;
        int clicksInversa = CanalesReversa(CanalOrigen, CanalDestino);

        while (CanalOrigen != CanalDestino) {
            CanalOrigen++;
            clicks++;

            if (CanalOrigen == 99) {
                CanalOrigen = 0;
            }

            if(CanalOrigen == 0 && CanalDestino == 99){
                CanalOrigen = 99;
            }
        }


        if (clicks < clicksInversa) {
            return clicks;
        } else {
            return clicksInversa;
        }

    }

    public int CanalesReversa(int CanalOrigen, int CanalDestino) {

        int clicks = 0;

        while (CanalOrigen != CanalDestino) {
            CanalOrigen -= 1;
            clicks++;

            if (CanalOrigen == 0) {
                CanalOrigen = 99;
            }
        }
        return clicks;
    }
}