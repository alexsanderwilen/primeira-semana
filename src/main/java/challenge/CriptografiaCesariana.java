package challenge;

public class CriptografiaCesariana implements Criptografia {

    static final String ALFABETOD_DESCRIPTOGRAFADO = "abcdefghijklmnopqrstuvwxyz";
    static final String ALFABETOD_CRIPTOGRAFADO = "defghijklmnopqrstuvwxyzabc";

    @Override
    public String criptografar(String texto) {
        if(texto.length() == 0){
            throw new IllegalArgumentException();
        }

        StringBuilder novaFrase = new StringBuilder();
        int posicao;
        for (int i = 0; i < texto.length(); i++) {
            if(ALFABETOD_DESCRIPTOGRAFADO.contains(texto.toLowerCase().substring(i, i + 1))){
                posicao = ALFABETOD_DESCRIPTOGRAFADO.indexOf(texto.toLowerCase().substring(i, i + 1));
                novaFrase.append(ALFABETOD_CRIPTOGRAFADO.substring(posicao, posicao + 1));
            }
            else{
                novaFrase.append(texto.substring(i, i + 1));
            }
        }
        return novaFrase.toString();
    }

    @Override
    public String descriptografar(String texto) {
        if(texto.length() == 0){
            throw new IllegalArgumentException();
        }
        StringBuilder novaFrase = new StringBuilder();
        int posicao;
        for (int i = 0; i < texto.length(); i++) {
            if(ALFABETOD_CRIPTOGRAFADO.contains(texto.toLowerCase().substring(i, i + 1))){
                posicao = ALFABETOD_CRIPTOGRAFADO.indexOf(texto.toLowerCase().substring(i, i + 1));
                novaFrase.append(ALFABETOD_DESCRIPTOGRAFADO.substring(posicao, posicao + 1));
            }
            else{
                novaFrase.append(texto.substring(i, i + 1));
            }
        }
        return novaFrase.toString();
    }
}
