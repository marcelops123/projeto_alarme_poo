package src.main.Java.logs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logs {
    private static final String LOG_FILE = "logs.txt";

    public static void registrarEvento(String evento) {
        System.out.println("Log: " + evento);
        salvarLog(evento);
    }

    private static void salvarLog(String log) {
        try (PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            out.println(formattedDateTime + ": " + log);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o log: " + e.getMessage());
        }
    }
}
