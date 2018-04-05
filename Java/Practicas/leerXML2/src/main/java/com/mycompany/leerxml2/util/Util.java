/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leerxml2.util;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author joshuansu
 */
public class Util {

    public static String fileChooser(String dir) {
        return fileChooser(dir, null);
    }

    public static String fileChooser(String dir, String extension) {
        if (dir != null && !dir.trim().equals("")) {
            dir = dir.trim();
        } else {
            dir = System.getProperty("user.home");
        }
        String path;
        JFileChooser fc = new JFileChooser();
        if (extension != null && !extension.trim().equals("")) {
            FileNameExtensionFilter ex = new FileNameExtensionFilter(extension.toUpperCase(), extension.toLowerCase());
            fc.setFileFilter(ex);
        }
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setCurrentDirectory(new File(dir));
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            path = fc.getSelectedFile().getAbsolutePath();
        } else {
            path = null;
        }
        return path;
    }

    public static Double parseDouble(String value) {
        try {
            return Double.parseDouble(value.trim().replace(",", "."));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
