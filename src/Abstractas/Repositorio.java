package Abstractas;

import java.util.ArrayList;

public abstract class Repositorio<Obj, Id> implements Interfaces.Repositorio<Obj, Id> {
    private final ArrayList<Obj> arrayList;

    public Repositorio() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public ArrayList<Obj> getArrayList() {
        return arrayList;
    }

    @Override
    public void Agregar(Obj objeto) {
        arrayList.add(objeto);
    }

    @Override
    public abstract Obj searchObjeto(Id busqueda);

    @Override
    public Obj getXindice(Integer indice) {
        return arrayList.get(indice);
    }

    @Override
    public void removeXindice(int indice) {
        arrayList.remove(indice);
    }

    @Override
    public void removeXobjeto(Obj objeto) {
        arrayList.remove(objeto);
    }
}
