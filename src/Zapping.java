public class Zapping {


    public int Canales(int CanalOrigen, int CanalDestino){
        int clicks = 0;

        for(int i = CanalOrigen; i < CanalDestino; i++ ){
             clicks+=1;
        }

        return clicks;
    }
}
