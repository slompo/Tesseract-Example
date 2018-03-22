# Java Tesseract 3.4.4 Exemplo

É um projeto base com o uso do Tesseract 3.4.4 para reconhecimento de texto dentro de imagem, utilizando de [OCR (Optical Character Recognition).](https://pt.wikipedia.org/wiki/Reconhecimento_ótico_de_caracteres).
A API do Tesseract foi obtida através do [link](https://sourceforge.net/projects/tess4j/), porém todas as lib's necessárias para execução do projeto de teste estão na pasta ```lib``` do repositório.

## Uso
Para usar a API do Tesseract de forma a capturar o texto contido na imagem, basta usar o código abaixo, conforme o arquivo ```Testtess.java```.
Na pasta ```src/imagem``` está uma imagem de exemplo ```p1.jpg```, que pode ser utilizada para efeito de teste rápido. Já na pasta ```src/tessdata``` está o pacote de idioma do tesseract, neste projeto está tanto o idioma Português quanto Inglês.
Para leitura de placa de veículos, obtive um resultado mais preciso ao usar a biblioteca Inglês.

```java
// train classifier on app start
public class Testtess {
    public static void main(String[] args) {
        File image = new File(Testtess.class.getResource("/imagem/p1.jpg").getFile());
        Tesseract tessInst = new Tesseract();
        //tessInst.setLanguage("por");
        tessInst.setDatapath("C:\\Java\\eclipse-workspace\\TesseractTest\\src");
        try {
            String result= tessInst.doOCR(image);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }

    }
}
```
