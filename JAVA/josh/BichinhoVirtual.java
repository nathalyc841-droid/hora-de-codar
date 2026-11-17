
class BichinhoVirtual {

    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int cansaco = 0;
    int idade = 0;

    // Construtor para inicializar o nome do bicho
    public BichinhoVirtual(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(this.nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade += 10;
        cansaco += 10;
        System.out.println(this.nome + " está brincando e se sentindo mais feliz.");
    }

    public void descansar() {
        cansaco = Math.max(0, cansaco - 10);
        System.out.println(this.nome + " descansou e está menos cansado.");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + this.nome + ":");
        System.out.println("Nível de fome: " + this.nivelDeFome);
        System.out.println("Nível de felicidade: " + this.nivelFelicidade);
        System.out.println("Nível de cansaço: " + this.cansaco);
        System.out.println("Idade: " + this.idade);
    }

    public void verificarFome() {
        System.out.println("Nível de fome de " + this.nome + ": " + this.nivelDeFome);
    }

    public void verificarFelicidade() {
        System.out.println("Nível de felicidade de " + this.nome + ": " + this.nivelFelicidade);
    }

    public void passarTempo() {
        nivelDeFome += 3;
        nivelFelicidade -= 3;
        cansaco += 10;
        idade += 1;

        System.out.println("O tempo passou para " + this.nome + ".");
    }

    public boolean verificarFimDeJogo() {

        if (nivelDeFome >= 100) {
            System.out.println("Você perdeu! " + nome + " está com muita fome.");
            return true;
        }

        if (cansaco >= 100) {
            System.out.println("Você perdeu! " + nome + " está muito cansado.");
            return true;
        }

        if (nivelFelicidade <= 0) {
            System.out.println("Você perdeu! " + nome + " está muito triste.");
            return true;
        }

        if (idade >= 50) {
            System.out.println("Parabéns! " + nome + " chegou aos 50 anos. Você venceu!");
            return true;
        }

        return false;
    }
}
