package ec.edu.ups.vista;

import ec.edu.ups.clases.Aventura;
import ec.edu.ups.clases.Deporte;
import ec.edu.ups.clases.Poker;
import ec.edu.ups.clases.Bingo;
import ec.edu.ups.controladores.ControladorAventura;
import ec.edu.ups.controladores.ControladorDeporte;
import ec.edu.ups.controladores.ControladorPoker;
import ec.edu.ups.controladores.ControladorBingo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcionMenuPrincipal = 0;
        int opcionMenuAventura = 0;
        int opcionMenuDeporte = 0;
        int opcionMenuPoker = 0;
        int opcionMenuBingo = 0;

        ControladorAventura controlAventura = new ControladorAventura();
        ControladorDeporte controlDeporte = new ControladorDeporte();
        ControladorPoker controlPoker = new ControladorPoker();
        ControladorBingo controlBingo = new ControladorBingo();

        Scanner aven = new Scanner(System.in);
        Scanner dep = new Scanner(System.in);
        Scanner pok = new Scanner(System.in);
        Scanner bing = new Scanner(System.in);

        do {
            System.out.println("***MENU PRINCIPAL***");
            System.out.println("1.- CRUD AVENTURA");
            System.out.println("2.- CRUD DEPORTE");
            System.out.println("3.- CRUD POKER");
            System.out.println("4.- CRUD BINGO");
            System.out.println("5.- SALIR");
            System.out.println("SELECCIONE UNA OPCION");

            opcionMenuPrincipal = aven.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    do {
                        System.out.println("**MENU AVENTURA**");
                        System.out.println("1.- Create");
                        System.out.println("2.- Read");
                        System.out.println("3.- Update");
                        System.out.println("4.- Delete");
                        System.out.println("5.- Listar");
                        System.out.println("6.- Regresar Menu Principal");
                        System.out.println("SELECCIONE UNA OPCION");

                        opcionMenuAventura = aven.nextInt();

                        switch (opcionMenuAventura) {
                            case 1:
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                System.out.println("Ingrese Nombre Juego: ");
                                String nombre = aven.next();
                                System.out.println("Ingrese Categoria: ");
                                String categoria = aven.next();
                                System.out.println("Numero de Jugadores: ");
                                int numjuga = aven.nextInt();
                                System.out.println("Modo Online");
                                boolean modoOnline = aven.nextBoolean();
                                System.out.println("Digital: ");
                                boolean digital = aven.nextBoolean();
                                System.out.println("Plataforms: ");
                                String plataforma = aven.next();
                                System.out.println("Graficos: ");
                                String grafico = aven.next();
                                System.out.println("Mision: ");
                                String mision = aven.next();
                                System.out.println("Objetivos: ");
                                String objetivo = aven.next();
                                System.out.println("Logro: ");
                                String logro = aven.next();
                                System.out.println("Mapa: ");
                                String mapa = aven.next();
                                Aventura aventura = new Aventura(mision, objetivo, logro, mapa, modoOnline, digital, plataforma, grafico, 0, nombre, categoria, numjuga);
                                controlAventura.create(aventura);
                                break;

                            case 2:
                                //read
                                System.out.println("\t\tLeer Aventura");
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo de la Aventura");
                                //llama al metodo read del controlador
                                int codigo = aven.nextInt();
                                System.out.println(controlAventura.read(codigo));
                                //visualizo los datos del objeto
                                System.out.println(codigo);
                                break;

                            case 3:
                                //update
                                System.out.println("Actualizar Aventura");
                                //pide todos los datos por teclado
                                Scanner avent = new Scanner(System.in);
                                //instancia un objeto
                                System.out.println("Ingrese Codigo: ");
                                int codig = avent.nextInt();
                                System.out.println("Ingrese Nombre Juego: ");
                                String nombr = avent.next();
                                System.out.println("Ingrese Categoria: ");
                                String categori = avent.next();
                                System.out.println("Numero de Jugadores: ");
                                int numjug = avent.nextInt();
                                System.out.println("Modo Online");
                                boolean modoOnlin = avent.nextBoolean();
                                System.out.println("Digital: ");
                                boolean digita = avent.nextBoolean();
                                System.out.println("Plataforms: ");
                                String plataform = avent.next();
                                System.out.println("Graficos: ");
                                String grafic = avent.next();
                                System.out.println("Mision: ");
                                String misio = avent.next();
                                System.out.println("Objetivos: ");
                                String objetiv = avent.next();
                                System.out.println("Logro: ");
                                String logr = avent.next();
                                System.out.println("Mapa: ");
                                String map = avent.next();
                                //llama al metodo update del controlador
                                Aventura aventuraactualizada = new Aventura(misio, objetiv, logr, map, modoOnlin, digita, plataform, grafic, codig, nombr, categori, numjug);
                                controlAventura.update(aventuraactualizada);
                                break;

                            case 4:
                                //delete
                                System.out.println("Eliminar Aventura");
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo que desea eliminar");
                                //llama al metodo delete del controlador
                                codigo = aven.nextInt();
                                controlAventura.delete(controlAventura.read(codigo));
                                break;
                            case 5:
                                controlAventura.imprimir();
                                break;
                                
                            case 6:
                                //regresar
                                System.out.println("Regresando al Menú Aventura");
                                break;

                        }
                    } while (opcionMenuAventura != 6);
                    break;

                case 2:
                    do {

                        System.out.println("**MENU DEPORTE**");
                        System.out.println("1.- Create");
                        System.out.println("2.- Read");
                        System.out.println("3.- Update");
                        System.out.println("4.- Delete");
                        System.out.println("5.- Listar");
                        System.out.println("6.- Regresar Menu Principal");
                        System.out.println("SELECCIONE UNA OPCION");

                        opcionMenuDeporte = dep.nextInt();

                        switch (opcionMenuDeporte) {
                            case 1:
                                System.out.println("Ingrese Nombre: ");
                                String nombre = dep.next();
                                System.out.println("Categoria: ");
                                String categoria = dep.next();
                                System.out.println("Numero Jugadores: ");
                                int numJug = dep.nextInt();
                                System.out.println("Modo Online: ");
                                boolean online = dep.nextBoolean();
                                System.out.println("Plataforma: ");
                                String plataforma = dep.next();
                                System.out.println("Graficos: ");
                                String graficos = dep.next();
                                System.out.println("Nombre Equipos: ");
                                String nombEqui = dep.next();
                                System.out.println("Tiempo: ");
                                String tiempo = dep.next();
                                System.out.println("Cambio Jugador: ");
                                boolean camJug = dep.nextBoolean();
                                System.out.println("Cambio Tactica: ");
                                boolean camTac = dep.nextBoolean();
                                Deporte deporte = new Deporte(nombEqui, tiempo, camJug, camTac, online, camTac, plataforma, graficos, 0, nombre, categoria, numJug);
                                controlDeporte.create(deporte);
                                break;

                            case 2:

                                //read
                                System.out.println("\t\t Leer Deporte");
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo del Deporte");
                                //llama al metodo read del controlador
                                int codigo = dep.nextInt();
                                System.out.println(controlDeporte.read(codigo));
                                //visualizo los datos del objeto
                                System.out.println(codigo);
                                break;

                            case 3:
                                System.out.println("\t\t Actualizar Deporte");
                                Scanner depo = new Scanner(System.in);
                                System.out.println("Ingrese Codigo: ");
                                int cod = depo.nextInt();
                                System.out.println("Ingrese Nombre: ");
                                String nombr = depo.next();
                                System.out.println("Categoria: ");
                                String categori = depo.next();
                                System.out.println("Numero Jugadores: ");
                                int numJuga = depo.nextInt();
                                System.out.println("Modo Online: ");
                                boolean onlin = depo.nextBoolean();
                                System.out.println("Plataforma: ");
                                String plataform = depo.next();
                                System.out.println("Graficos: ");
                                String grafico = depo.next();
                                System.out.println("Nombre Equipos: ");
                                String nombEquip = depo.next();
                                System.out.println("Tiempo: ");
                                String tiemp = depo.next();
                                System.out.println("Cambio Jugador: ");
                                boolean camJuga = depo.nextBoolean();
                                System.out.println("Cambio Tactica: ");
                                boolean camTact = depo.nextBoolean();
                                Deporte deporteActualizado = new Deporte(nombEquip, tiemp, camJuga, camTact, onlin, onlin, plataform, grafico, cod, nombr, categori, numJuga);
                                controlDeporte.update(deporteActualizado);
                                break;

                            case 4:
                                //delete
                                System.out.println("Eliminar Deporte");
                                //pide el codigo por teclado
                                System.out.println("Ingrese el codigo que desea eliminar");
                                //llama al metodo delete del controlador
                                codigo = dep.nextInt();
                                controlDeporte.delete(codigo);

                                break;
                                
                            case 5:
                                controlDeporte.imprimir();
                                break;

                            case 6:
                                System.out.println("Regresando al Menú Deporte");
                                break;
                        }
                    } while (opcionMenuDeporte != 6);
                    break;

                case 3:
                    do {
                        System.out.println("**MENU Poker**");
                        System.out.println("1.- Create");
                        System.out.println("2.- Read");
                        System.out.println("3.- Update");
                        System.out.println("4.- Delete");
                        System.out.println("5.- Listar");
                        System.out.println("6.- Regresar Menu Principal");
                        System.out.println("SELECCIONE UNA OPCION");

                        opcionMenuPoker = pok.nextInt();
                        switch (opcionMenuPoker) {
                            case 1:
                                System.out.println("Ingrese Nombre");
                                String nom = pok.next();
                                System.out.println("Categoria");
                                String cat = pok.next();
                                System.out.println("Numero de Jugadores");
                                int nuju = pok.nextInt();
                                System.out.println("Numero de Mesa");
                                int nume = pok.nextInt();
                                System.out.println("Fisico");
                                boolean fis = pok.nextBoolean();
                                System.out.println("Nombre Dealer");
                                String nomdea = pok.next();
                                System.err.println("Nombre del Juego");
                                String nomju = pok.next();
                                System.out.println("Tipo de Ficha");
                                int tipfic = pok.nextInt();
                                System.out.println("Numero de Puesto");
                                int numpue = pok.nextInt();
                                System.out.println("Apuesta");
                                double apues = pok.nextDouble();
                                System.out.println("Mostrar Juegos");
                                String mosjue = pok.next();
                                Poker poker = new Poker(tipfic, numpue, apues, mosjue, numpue, fis, nomdea, nomju, numpue, nomju, cat, numpue);
                                controlPoker.create(poker);
                                break;

                            case 2:
                                System.out.println("\t\tLeer Poker");
                                System.out.println("Ingrese el codigo de Poker");
                                int codigo = pok.nextInt();
                                System.out.println(controlPoker.read(codigo));
                                System.out.println(codigo);
                                break;

                            case 3:
                                System.out.println("\t\t Actualizar Poker");
                                Scanner poke = new Scanner(System.in);
                                System.out.println("Ingrese Codigo: ");
                                int cod = poke.nextInt();
                                System.out.println("Ingrese Nombre");
                                String nomb = poke.next();
                                System.out.println("Categoria");
                                String cate = poke.next();
                                System.out.println("Numero de Jugadores");
                                int numju = poke.nextInt();
                                System.out.println("Numero de Mesa");
                                int numemes = poke.nextInt();
                                System.out.println("Fisico");
                                boolean fisi = poke.nextBoolean();
                                System.out.println("Nombre Dealer");
                                String nombdea = poke.next();
                                System.err.println("Nombre del Juego");
                                String nombjug = poke.next();
                                System.out.println("Tipo de Ficha");
                                int tipofic = poke.nextInt();
                                System.out.println("Numero de Puesto");
                                int numepue = poke.nextInt();
                                System.out.println("Apuesta");
                                double apue = poke.nextDouble();
                                System.out.println("Mostrar Juegos");
                                String mostjue = poke.next();
                                Poker pokeractualizado = new Poker(tipofic, numepue, apue, mostjue, numemes, fisi, nombdea, nombjug, 0, nombdea, cate, numepue);
                                controlPoker.update(pokeractualizado);
                                break;

                            case 4:
                                System.out.println("Eliminar Poker");
                                System.out.println("Ingrese el codigo que desea eliminar");
                                codigo = pok.nextInt();
                                controlPoker.delete(codigo);
                                break;

                            case 5:
                                controlPoker.imprimir();
                                break;

                            case 6:
                                System.out.println("Regresando al Menú Poker");
                                break;
                        }
                    } while (opcionMenuPoker != 6);
                    break;

                case 4:
                    do {
                        System.out.println("**MENU BINGO**");
                        System.out.println("1.- Create");
                        System.out.println("2.- Read");
                        System.out.println("3.- Update");
                        System.out.println("4.- Delete");
                        System.out.println("5.- Listar");
                        System.out.println("6.- Regresar Menu Principal");
                        System.out.println("SELECCIONE UNA OPCION");

                        opcionMenuBingo = bing.nextInt();

                        switch (opcionMenuBingo) {
                            case 1:
                                System.out.println("Ingrese Nombre");
                                String no = bing.next();
                                System.out.println("Categoria");
                                String ca = bing.next();
                                System.out.println("Numero Jugadores");
                                int nu = bing.nextInt();
                                System.out.println("Numero de Mesa");
                                int nume = bing.nextInt();
                                System.out.println("Fisico");
                                boolean fi = bing.nextBoolean();
                                System.out.println("Nombre Dealer");
                                String node = bing.next();
                                System.out.println("Nombre Juego");
                                String nojurg = bing.next();
                                System.out.println("Numero de Tabla");
                                int numta = bing.nextInt();
                                System.out.println("Numero de Bolas");
                                int nubol = bing.nextInt();
                                System.out.println("Tipo de Premio");
                                String tippre = bing.next();
                                System.out.println("Comprobar Tabla Ganador");
                                boolean comga = bing.nextBoolean();
                                Bingo bingo = new Bingo(nubol, nubol, tippre, comga, numta, fi, nojurg, nojurg, nubol, nojurg, tippre, numta);
                                controlBingo.create(bingo);
                                break;

                            case 2:
                                System.out.println("\t\tLeer Bingo");
                                System.out.println("Ingrese el codigo de Bingo");
                                int codigo = pok.nextInt();
                                System.out.println(controlBingo.read(codigo));
                                System.out.println(codigo);
                                break;

                            case 3:
                                System.out.println("\t\t Actualizar Bingo");
                                Scanner bin = new Scanner(System.in);
                                System.out.println("Ingrese Codigo: ");
                                int cod1 = bin.nextInt();
                                System.out.println("Ingrese Nombre");
                                String ino1 = bin.next();
                                System.out.println("Categoria");
                                String ca1 = bin.next();
                                System.out.println("Numero Jugadores");
                                int nu1 = bin.nextInt();
                                System.out.println("Numero de Mesa");
                                int nume1 = bin.nextInt();
                                System.out.println("Fisico");
                                boolean fi1 = bin.nextBoolean();
                                System.out.println("Nombre Dealer");
                                String node1 = bin.next();
                                System.out.println("Nombre Juego");
                                String nojueg1 = bin.next();
                                System.out.println("Numero de Tabla");
                                int numta1 = bin.nextInt();
                                System.out.println("Numero de Bolas");
                                int nubol1 = bin.nextInt();
                                System.out.println("Tipo de Premio");
                                String tippre1 = bin.next();
                                System.out.println("Comprobar Tabla Ganador");
                                boolean comga1 = bin.nextBoolean();
                                Bingo bingoActualizado = new Bingo(numta1, nubol1, tippre1, comga1, nume1, fi1, node1, nojueg1, 0, ino1, tippre1, numta1);
                                controlBingo.update(bingoActualizado);
                                break;
                            case 4:
                                System.out.println("Eliminar Bingo");
                                System.out.println("Ingrese el codigo que desea eliminar");
                                codigo = pok.nextInt();
                                controlBingo.delete(codigo);
                                break;

                            case 5:
                                controlBingo.imprimir();
                                break;

                            case 6:
                                System.out.println("Regresar al Menu Bingo");
                        }
                    } while (opcionMenuBingo != 6);
                    break;

                case 5:
                    System.out.println("Regresar al Menu Principal");
                    break;
            }
        } while (opcionMenuPrincipal != 5);

    }
}
