package org.example;

import java.util.ArrayList;
import java.util.List;

class Tool {
    private String toolType;

    public Tool(String toolType) {
        this.toolType = toolType;
    }

    public void useTool() {
        System.out.println("Using tool: " + toolType);
    }
}

public class Worker {

    public static void main(String[] args) {
        Tool tool = new Tool("Wiertarka");
        tool.useTool();

        List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(new Tool("Młotek"));
        narzedzia.add(new Tool("Śrubokręt"));
        narzedzia.add(new Tool("Imbus"));
        narzedzia.add(new Tool("Łom"));
        narzedzia.add(new Tool("Klucz Francuski"));
        narzedzia.add(new Tool("Wkretarka"));
        narzedzia.add(new Tool("Obcegi"));
        narzedzia.add(new Tool("Norzyce"));
        narzedzia.add(new Tool("Kombinerki"));
        narzedzia.add(tool);

        for (Tool t : narzedzia) {
            t.useTool();
        }
    }
}