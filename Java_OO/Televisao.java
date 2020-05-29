/* so quero definir um tipo de dado que armazena informacoes
   sobre uma televisao
      - desligar
      - aumentar volume
      - diminiur volume 
   */
public class Televisao{
    private String  marca;
    private int     tamanho;
    private int     voltagem;
    private boolean ligada;
    private int     volume;
    private int     canal;
    private String  tipo;

    // quero criar meu próprio método construtor
    public Televisao(String marca, int tamanho, int voltagem, String ti){
        this.marca    = marca;
        this.tamanho  = tamanho;
        this.voltagem = voltagem;
        tipo     = ti;
        ligada   = false;
        volume   = 0;
        canal    = 1;
    }

    // Getters & Setters
    public void setMarca(String marca){
        this.marca = marca;              // neste método o THIS é obrigatório
    }
    public String getMarca(){
        return this.marca;               // já neste, ele é opcional (torna melhor a legibilidade)
    }

    public void setTamanho(int ta){
        tamanho = ta;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setVoltagem(int vo){
        voltagem = vo;
    }
    public int getVoltagem(){
        return voltagem;
    }
    public void setTipo(String ti){
        tipo = ti;
    }
    public String getTipo(){
        return tipo;
    }
    public void setCanal(int ca){
        canal = ca;
    }
    public int getCanal(){
        return canal;
    }
    public void setVolume(int vo){
        volume = vo;
    }
    public int getVolume(){
        return volume;
    }
    public void setLigada(boolean li){
        ligada = li;
    }
    public boolean isLigada(){
        return ligada;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void mudarCanal(int novocanal){
        if (ligada){
            canal = novocanal;
        }
        else{
            System.out.println("Para mudar canal, ligue a TV "+marca);
        }
    }

    public void avancarCanal(){
        if (ligada == true){
            canal++;
        }
        else{
            System.out.println("Ei, antes ligue a TV!");
        }
    }
    public void voltarCanal(){
        if (ligada == true){
            canal--;
        }
        else{
            System.out.println("Ei, antes ligue a TV!");
        }
    }

    public void aumentarVolume(){
        if (ligada){
            volume++;
        }
        else{
            System.out.println("Ei, antes ligue a TV!");
        }
    }

    public void diminuirVolume(){
        if (ligada){
            volume--;
        }
        else{
            System.out.println("Ei, antes ligue a TV!");
        }
    }

    public void exibirInfo(){
        System.out.println("+------------------------------+");
        System.out.printf("|%-30s|\n",marca);
        System.out.printf("|  Tamanho %3d   Voltagem %3d  |\n",tamanho, voltagem);
        System.out.printf("|  Canal   %3d   Volume   %3d  |\n", canal, volume);
        if (ligada){
            System.out.printf("|%30s|\n","   LIGADA    ");
        }
        else{
            System.out.printf("|%30s|\n","   DESLIGADA    ");
        }
        System.out.println("+------------------------------+");
        System.out.println("       __/          \\__");
    }


}