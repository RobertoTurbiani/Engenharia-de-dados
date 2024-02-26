package school.sptech.escola;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus implements IBonus {

    private List<Coordenador> listaCoordenador = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();

    @Override
    public Double getValorBonus(){

        return calcularTotalBonus();
    };

    public void adicionarProfessor (Professor professor){
        listaProfessor.add(professor);
    }

    public void adicionarCoordenador(Coordenador coordenador){
        listaCoordenador.add(coordenador);
    }

    public void exibir(){
        System.out.println("Lista de Professores: " + listaProfessor.size());
        System.out.println("Lista de Coordenadores: " + listaCoordenador.size());
    }

    public Double calcularTotalBonus(){
        Double totalBonus = 0.;
        for (Professor prof: listaProfessor) {

            totalBonus += prof.getValorBonus();
        }

        for (Coordenador coordenador: listaCoordenador) {

            totalBonus += coordenador.getValorBonus();
        }

        return  totalBonus;
    }

    public List<Coordenador> getListaCoordenador() {
        return listaCoordenador;
    }

    public void setListaCoordenador(List<Coordenador> listaCoordenador) {
        this.listaCoordenador = listaCoordenador;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }
}
