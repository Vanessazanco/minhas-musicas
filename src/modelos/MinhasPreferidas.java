package modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto é preferido por todos");
        }else {
            System.out.println(audio.getTitulo() + " tbm é um dos que todo mundo está curtindo");
        }
    }
}
