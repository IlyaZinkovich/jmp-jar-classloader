package com.epam.jmp;


import com.epam.jmp.reloader.JarClassLoader;

import java.io.IOException;

public class Main {

    private static final String DEFAULT_JAR_PATH = "dummy/dummy.jar";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = args.length == 1 ? args[0] : DEFAULT_JAR_PATH;

        JarClassLoader jarClassLoader = new JarClassLoader(path);
        jarClassLoader.loadClasses();
    }

}
