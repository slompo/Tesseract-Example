/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tess4jTest;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author 538384
 */
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
