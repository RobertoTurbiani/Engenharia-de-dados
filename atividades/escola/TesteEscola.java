package school.sptech.escola;

public class TesteEscola {
    public static void main(String[] args) {

        Coordenador coordenador01 = new Coordenador("Lewis",40,150.);
        Professor prof01 = new Professor("Max",30,100.);
        ControleBonus controle = new ControleBonus();



        controle.adicionarProfessor(prof01);
        controle.adicionarCoordenador(coordenador01);


        System.out.println(prof01);
        System.out.println(coordenador01);

        controle.exibir();

        controle.calcularTotalBonus();

    }
}


// 1 - Para obrigar as duas classes a utilizarem o método 'getValorBonus()' pode ser por meio de uma classe abstrata ou por uma interface, mas como
// são duas classes com prospostas diferentes a utilização de uma interface se torna mais correta, pos apesar de possuir o mesmo método eles serão
// usados em contextos diferentes.

// 2 - É necessário para poder identificar os coordenadores e os professores.

// 3 - Sim, pois o método 'getValorBonus' é uma sobreescrita e isso é uma forma de polimosfismo.