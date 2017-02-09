package org.media.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 2/9/17.
 */
public class AppProperty {
    public static void loadProperties(){
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(new File("src/main/resources/app.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
}
