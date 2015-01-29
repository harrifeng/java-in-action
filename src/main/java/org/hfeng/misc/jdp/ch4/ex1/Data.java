package org.hfeng.misc.jdp.ch4.ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Data {
    private final String filename;
    private String content;
    private boolean changed;

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
        this.changed = true;
    }

    public synchronized void change(String newContent) {
        content = newContent;
        changed = true;
    }

    // If the file is changed, save it to the file
    public synchronized  void save() throws IOException {
        if (!changed) {
            return;
        }
        doSave();
        changed = false;

    }

    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + "calls do Save, content =" + content);
        Writer writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
