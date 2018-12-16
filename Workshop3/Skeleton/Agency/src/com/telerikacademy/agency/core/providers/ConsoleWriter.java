package com.telerikacademy.agency.core.providers;

import com.telerikacademy.agency.core.contracts.Writer;

public class ConsoleWriter implements Writer {
    public void write(String message) {

        message = message.replaceAll("\\r\\n", "\n");

        System.out.print(message);
    }

    public void writeLine(String message) {

        message = message.replaceAll("\\r\\n", "\n");

        System.out.println(message);
    }
}
