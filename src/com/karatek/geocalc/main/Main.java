package com.karatek.geocalc.main;

import java.io.Console;

public class Main {
    public static String version = "v0.1";
    public static String lang = System.getProperty("user.language");
    public static Console console = System.console();

    public static void main(String[] args) {
        intro();

        if (console == null) {
            if(lang.equalsIgnoreCase("de")) {
                System.err.println("Keine Konsole erreichbar!");
                System.exit(1);
            } else {
                System.err.println("No Console avaliable!");
                System.exit(1);
            }
        }
        System.out.println("Running GeoCalc " + version + " on " + System.getProperty("os.name") + ".");
        System.out.println("Written by Karatek_HD. Licensed under Gnu General Public Licence 3 (GPLv3)");
        con();
    }

    public static void intro() {
        System.out.println();
        System.out.println("///////////////////////////");
        System.out.println("         GeoCalc           ");
        System.out.println("      by Karatek_HD        ");
        System.out.println("///////////////////////////");
        System.out.println();
    }

    public static void con() {
        String s = console.readLine("> ");
        if(System.getProperty("user.language").equalsIgnoreCase("de")) {
            if(s.equalsIgnoreCase("help")) {
                System.out.println("Liste der verfügbaren Commands: ");
                System.out.println("help - Ruft diese Liste auf. ");
                System.out.println("tri - Flächeninhalt eines Dreiecks berechnen.");
                System.out.println("rect - Flächeninhalt eines Rechtecks berechnen.");
                System.out.println("tra - Flächeninhalt eines Trapezes berechnen.");
                System.out.println("pri - Volumen eines Prismas berechnen.");
                System.out.println("echo - Gibt einen Text aus -> echo <Text>");
                System.out.println("clear - Leert die Konsole.");
                System.out.println("exit - Diese Sitzung beenden.");
                con();
            } if(s.equalsIgnoreCase("exit")) {
                System.out.println("Tschüss.");
                System.exit(0);
            } if(s.startsWith("echo")) {
                System.out.println(s.replace("echo", "Deine Eingabe: "));
                con();
            } if(s.equalsIgnoreCase("clear")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                con();
            } if(s.equalsIgnoreCase("tri")) {
                System.out.println("Um den Flächeninhalt A eines Dreiecks zu berrechnen, beantworte bitte die folgenden Fragen: (Werte ohne Einheit angeben!)");
                String ground = console.readLine("Grundseite (g) : ");
                String high = console.readLine("Höhe (h) : ");
                if(ground.contains(",") || high.contains(",")) {
                    System.out.println("Bitte verwende anstatt eines Kommas einen Punkt.");
                    con();
                }
                double g = Double.parseDouble(ground);
                double h = Double.parseDouble(high);
                double result = g * h / 2;
                System.out.println("Ergebniss: " + result);
                con();
            }
            if(s.equalsIgnoreCase("rect")) {
                System.out.println("Um den Flächeninhalt A eines Rechtecks zu berrechnen, beantworte bitte die folgenden Fragen: (Werte ohne Einheit angeben!)");
                String ground = console.readLine("Seite a (a) : ");
                String high = console.readLine("Seite b (b) : ");
                if(ground.contains(",") || high.contains(",")) {
                    System.out.println("Bitte verwende anstatt eines Kommas einen Punkt.");
                    con();
                }
                double a = Double.parseDouble(ground);
                double b = Double.parseDouble(high);
                double result = a * b;
                System.out.println("Ergebniss: " + result);
                con();
            }
            if(s.equalsIgnoreCase("tra")) {
                System.out.println("Um den Flächeninhalt A eines Trapezes zu berrechnen, beantworte bitte die folgenden Fragen: (Werte ohne Einheit angeben!)");
                String sidea = console.readLine("Seite a (a) : ");
                String sidec = console.readLine("Seite c (c) : ");
                String high = console.readLine("Höhe (h): ");
                if(sidea.contains(",") || sidec.contains(",") || high.contains(",")) {
                    System.out.println("Bitte verwende anstatt eines Kommas einen Punkt.");
                    con();
                }
                double a = Double.parseDouble(sidea);
                double c = Double.parseDouble(sidec);
                double h = Double.parseDouble(high);
                double result = ((a + c) / 2 * h);
                System.out.println("Ergebniss: " + result);
                con();
            }
            if(s.equalsIgnoreCase("pri")) {

                System.out.println("Ist der Flächeninhalt berites bekannt? (y/n)");
                String aiskn = console.readLine("Prisma > Optionen > ");
                if(aiskn.equalsIgnoreCase("y")) {
                    System.out.println("Bitte gebe die jeweiligen Werte ein:");
                    String fläche = console.readLine("Prisma > Grundfläche > ");
                    String high = console.readLine("Prisma > Höhe > ");
                    if(high.contains(",") || fläche.contains(",")) {
                        System.out.println("Bitte verwende anstatt eines Kommas einen Punkt.");
                        con();
                    }
                    double g = Double.parseDouble(fläche);
                    double h = Double.parseDouble(high);
                    double result = g * h;
                    System.out.println("Ergebniss : " + result);
                    con();
                }
                if(aiskn.equalsIgnoreCase("n")) {
                    System.out.println("Verwende bitte die Kommandos 'tri', 'rect' und 'tra'.");
                    con();
                } else {
                    System.out.println("Das war keine gültige Eingabe.");
                    con();
                }
                con();
            }
            else {
                System.err.println("Unbekannter Befehl. Versuche 'help' auszuführen!");
                con();
            }
        } else {
            if(s.equalsIgnoreCase("help")) {
                System.out.println("List of available commands: ");
                System.out.println("tri - calculate the area size of an triangle.");
                System.out.println("tra - calculate the area size of an triangle.");
                System.out.println("rect - calculate the area size of an triangle.");
                System.out.println("pri - calculate the area size of an triangle.");
                System.out.println("help - show this list.");
                System.out.println("echo - Prints a line -> echo <text>.");
                System.out.println("clear - Clears the console.");
                System.out.println("exit - Exit this session. ");
                con();
            }

            if(s.equalsIgnoreCase("exit")) {
                System.out.println("Have a nice day!");
                System.exit(0);
            }
            if(s.equalsIgnoreCase("clear")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                con();
            } if(s.equalsIgnoreCase("tri")) {
                System.out.println("For calculating the Area Size of an triangle, please answer the following questions: (Numbers without Units!)");
                String ground = console.readLine("Groundside (g) : ");
                String high = console.readLine("High (h) : ");
                if(ground.contains(",") || high.contains(",")) {
                    System.out.println("Please use dots (.) instead of commas (,)");
                    con();
                }
                double g = Double.parseDouble(ground);
                double h = Double.parseDouble(high);
                double result = g * h / 2;
                System.out.println("Result: " + result);
                con();
            }
            if(s.equalsIgnoreCase("rect")) {
                System.out.println("For calculating the Area Size of an rectangle, please answer the following questions: (Numbers without Units!)");
                String ground = console.readLine("side a (a) : ");
                String high = console.readLine("side b (b) : ");
                if(ground.contains(",") || high.contains(",")) {
                    System.out.println("Please use dots (.) instead of commas (,)");
                    con();
                }
                double a = Double.parseDouble(ground);
                double b = Double.parseDouble(high);
                double result = a * b;
                System.out.println("Result: " + result);
                con();
            }
            if(s.equalsIgnoreCase("tra")) {
                System.out.println("For calculating the Area Size of an trapeze, please answer the following questions: (Numbers without Units!)");
                String sidea = console.readLine("side a (a) : ");
                String sidec = console.readLine("side c (c) : ");
                String high = console.readLine("high (h): ");
                if(sidea.contains(",") || sidec.contains(",") || high.contains(",")) {
                    System.out.println("Please use dots (.) instead of commas (,)");
                    con();
                }
                double a = Double.parseDouble(sidea);
                double c = Double.parseDouble(sidec);
                double h = Double.parseDouble(high);
                double result = ((a + c) / 2 * h);
                System.out.println("Result: " + result);
                con();
            }
            if(s.equalsIgnoreCase("pri")) {

                System.out.println("Is the area size already known? (y/n)");
                String aiskn = console.readLine("prism > options > ");
                if(aiskn.equalsIgnoreCase("y")) {
                    System.out.println("Please insert the need values:");
                    String fläche = console.readLine("prism > groundflat > ");
                    String high = console.readLine("prism > high > ");
                    if(high.contains(",") || fläche.contains(",")) {
                        System.out.println("Please use dots (.) instead of commas (,)");
                        con();
                    }
                    double g = Double.parseDouble(fläche);
                    double h = Double.parseDouble(high);
                    double result = g * h;
                    System.out.println("Result : " + result);
                    con();
                }
                if(aiskn.equalsIgnoreCase("n")) {
                    System.out.println("Please use the commands 'tri', 'rect' und 'tra'.");
                    con();
                } else {
                    System.out.println("That was an invalid input.");
                    con();
                }
                con();
            }
            if(s.startsWith("echo")) {
                System.out.println(s.replace("echo", "Your input: "));
                con();
            }
            else {
                System.err.println("Unknown command. Try running 'help'!");
                con();
            }
        }
    }
}
