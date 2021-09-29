package Lesson11.Classwork;

import java.util.List;

 // T(ype), E(lement), K(ey), V(alue), N(umber)
public class BoxGeneric<G> {
    //<G> - Обобщенный тип воображаемы тип данных. Может быть много  <G, Q,Y>  могут все быть разного тита(масив, лист)
   //Нельзя объвить статическое поле обощенного типа

    private G obj;

    public BoxGeneric(G obj) {
        this.obj = obj;
    }

    //Нельзя создать объект  параматеризированног типа
      //G something = new G();
     // Нельзя создать массив обобщенного типа
     // G[] arr = new G[10];



    public G getObj() {
        return obj;
    }

    public void setObj(G obj) {
        this.obj = obj;
    }
}
