package Interfaces;

import java.util.ArrayList;

public interface Repositorio<Obj, Id> {
     ArrayList<Obj> getArrayList();
     void Agregar(Obj objeto);
     Obj searchObjeto(Id busqueda);
     Obj getXindice(Integer indice);
     void removeXindice(int indice);
     void removeXobjeto(Obj objeto);
}
