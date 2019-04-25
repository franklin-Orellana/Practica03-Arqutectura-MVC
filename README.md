# Practica03-Arqutectura-MVC
**Nombre: Franklin Orellana**

**Practic  N°3** 

**Titulo: Modelo Vista Controlador**

**Objetivo Alcanzado** 

      - Implementacion de controladores a las clases hijas con facilidad y eficacia logrando el ordenamiento de datos. 

**ACTIVIDADES DESARROLLADAS**

**1.	Crear un repositorio en GitHub**

      •	Creación del repositorio en GitHub con el nombre “Práctica 03 – Arquitectura MVC”
     
**2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar varios commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits
realizados a GitHub).**

      • Se Realizaron 6 commits con los pasos sugeridos en la practica.
      
**3.	Crear un paquete para los controladores y un paquete para la vista.**

      • Se creo dos packages 
      
        - ec.edu.ups.controladores
        
        - ec.edu.ups.vista

      
**4.	Crear un controlador por cada clase hija. En total, cuatro controladores.**

      •	Creación de Controladores de cada clase hija(Aventura, Deporte, Bingo, Póker).
      
        - ControladorAventura
        
        - ControladorDeporte
        
        - ControladorBingo
        
        - ControladorPoker
        
**5.	Al menos una clase Controlador debe ser implementada usando la interface List y la clase ArrayList.**

    •	Implementación Interface List y la clase ArrayList usando la clase hija Aventura.
    
                      package ec.edu.ups.controladores;

                      import ec.edu.ups.clases.Aventura;
                      import java.util.ArrayList;
                      import java.util.List;

                      public class ControladorAventura {

                      private List<Aventura> lista;
                      private int contador;

                      public ControladorAventura() {
                          lista = new ArrayList<>();
                          contador = 0;
                      }

                      public void create(Aventura objeto) {
                          contador++;
                          objeto.setCodigo(contador);
                          lista.add(objeto);

                      }

                      public Aventura read(int codigo) {
                          for (Aventura aventura : lista) {
                              if (aventura.getCodigo() == codigo) {
                                 return aventura;
                            }
                        }
                        return null;
                      }

                      public void update(Aventura objeto) {
                          for (int i = 0; i < lista.size(); i++) {
                              Aventura elemento = lista.get(i);
                                if (elemento.getCodigo() == objeto.getCodigo()) {
                                   lista.set(i, objeto);
                                      break;
                                      }
                                  }
                      }

                       public void delete(Aventura objeto) {
                            for (int i = 0; i < lista.size(); i++) {
                               Aventura elemento = lista.get(i);
                                  if (elemento.getCodigo() == objeto.getCodigo()) {
                                      lista.remove(i);
                                            break;
                                          }
                                      }
                      }

                      public void imprimir() {
                            System.out.println("Lista Ordenada: ");
                              for (int i =0; i< lista.size();i++) {
                                  System.out.println(lista.get(i).getNombre());

                                          }
                                       }
                      }


**6.	Al menos una clase Controlador debe ser implementada usando la interface Set y la clase HashSet.**

        •	Implementada usando la interface Set y la clase HashSet usando la clase hija Deporte.
        
        package ec.edu.ups.controladores;

                      import ec.edu.ups.clases.Deporte;
                      import ec.edu.ups.clases.Poker;
                      import java.util.ArrayList;
                      import java.util.HashSet;
                      import java.util.List;
                      import java.util.Set;

                      public class ControladorDeporte {

                          private Set<Deporte> lista;
                          private int codigo;

                          public ControladorDeporte() {
                              lista = new HashSet<>();
                              codigo = 0;

                          }

                          public void create(Deporte objeto) {
                              codigo++;
                              objeto.setCodigo(codigo);
                              lista.add(objeto);

                          }

                          public Deporte read(int codigo) {
                              for (Deporte deporte : lista) {
                                  if (deporte.getCodigo() == codigo) {
                                      return deporte;
                                  }

                              }
                              return null;
                          }

                          public void update(Deporte objeto) {
                              if (lista.contains(objeto)) {
                                  lista.remove(objeto);
                                  lista.add(objeto);
                              }
                          }

                          public void delete(int codigo) {
                              for (Deporte deporte : lista) {
                                  if (deporte.getCodigo() == codigo) {
                                      lista.remove(deporte);
                                  }

                              }
                          }

                          public void imprimir() {
                              System.out.println("Lista Ordenada por Nombre");
                              for (Deporte deporte : lista) {
                                  System.out.println(deporte.getNombre());

                              }

                          }
                      }
                      
**7.	Al menos una clase Controlador debe ser implementada usando la interface SortedSet y la clase TreeSet.**

              •	Implementación de la interface SortedSet y la clase TreeSet en la clase hija Póker. 
              
                          package ec.edu.ups.controladores;

                          import ec.edu.ups.clases.Poker;
                          import java.util.Set;
                          import java.util.SortedSet;
                          import java.util.TreeSet;

                          public class ControladorPoker {

                              private SortedSet<Poker> listaOrdenada;
                              private int codigo;

                              public ControladorPoker() {

                                  listaOrdenada = new TreeSet<>();
                                  codigo = 1;

                              }

                              public void create(Poker objeto){
                                  codigo ++;
                                  objeto.setCodigo(codigo);
                                  listaOrdenada.add(objeto);
                              }

                              public Poker read(int codigo){
                                  for (Poker poker : listaOrdenada) {
                                      if(poker.getCodigo() == codigo){
                                          return poker;
                                      }
                                  }
                                  return null;
                              }

                              public void update(Poker objeto){
                                  if(listaOrdenada.contains(objeto)){
                                      listaOrdenada.remove(objeto);
                                      listaOrdenada.add(objeto);
                                  }
                              }

                              public void delete(int codigo){
                                  for (Poker poker : listaOrdenada) {
                                      if(poker.getCodigo() == codigo){
                                          listaOrdenada.remove(poker);
                                      break;
                                      }

                                  }
                              }

                              public void imprimir(){
                                  System.out.println("Lista Ordenada por Nombre");
                                  for (Poker poker : listaOrdenada) {
                                      System.out.println(poker.getNombre());

                                  }
                              }

                          }

**8.	Al menos una clase Controlador debe ser implementada usando la interface Map y la clase HashMap o la interface Map y la clase TreeMap.**

          •	Implementación de la interface Map y la clase HashMap o la interface Map y la clase TreeMap en la clase hija Bingo.
          
                    package ec.edu.ups.controladores;

                    import ec.edu.ups.clases.Bingo;
                    import java.util.Map;
                    import java.util.TreeMap;

                    public class ControladorBingo {

                        private Map <Integer, Bingo> lista;
                        private int codigo;

                        public ControladorBingo() {

                            lista = new TreeMap<>();
                            codigo = 0;      

                        }

                        public void create(Bingo objeto){
                            codigo++;
                            objeto.setCodigo(codigo);
                            lista.put(codigo, objeto);
                        }

                        public Bingo read(int codigo){
                            if(lista.get(codigo) != null){
                                return lista.get(codigo);
                            }
                            return null;
                        }

                        public void update(Bingo objeto){
                            lista.put(objeto.getCodigo(), objeto);

                        }

                        public void delete(int codigo){
                            lista.remove(codigo);
                        }

                        public void imprimir(){
                            System.out.println(lista.entrySet());
                        }



                    }

**9.	Crear una clase “Principal”, en donde se demostrará el funcionamiento del sistema completo a través de la consola de java, usando menús y submenús para acceder a las opciones.**

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
                                                    Aventura aventura = new Aventura(mision, objetivo, logro, mapa, modoOnline, digital,                                                     plataforma,grafico, 0, nombre, categoria, numjuga);
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
                                                    Aventura aventuraactualizada = new Aventura(misio, objetiv, logr, map, modoOnlin,                                                       digita, plataform,grafic, codig, nombr, categori, numjug);
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
                                                    Deporte deporte = new Deporte(nombEqui, tiempo, camJug, camTac, online, camTac,                                                         plataforma, graficos, 0,nombre, categoria, numJug);
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
                                                    Deporte deporteActualizado = new Deporte(nombEquip, tiemp, camJuga, camTact, onlin,                                                     onlin, plataform,grafico, cod, nombr, categori, numJuga);
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
                                            System.out.println("**MENU POKER**");
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
                                                    Poker poker = new Poker(tipfic, numpue, apues, mosjue, numpue, fis, nomdea, nomju,                                                       numpue, nomju, cat,numpue);
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
                                                    Poker pokeractualizado = new Poker(tipofic, numepue, apue, mostjue, numemes, fisi,                                                       nombdea, nombjug, 0,nombdea, cate, numepue);
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
                                                    Bingo bingo = new Bingo(nubol, nubol, tippre, comga, numta, fi, nojurg, nojurg,                                                         nubol, nojurg, tippre,numta);
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
                                                    Bingo bingoActualizado = new Bingo(numta1, nubol1, tippre1, comga1, nume1, fi1,                                                         node1, nojueg1, 0, ino1,tippre1, numta1);
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
                                        System.out.println("Salir");
                                        break;
                                }
                            } while (opcionMenuPrincipal != 5);

                        }
                    }
**RESULTADOS OBTENIDOS:**
    
    •	Los controladores aplicados y enseñados en clases fueron de utilidad para desarrollar la práctica puesto que cada uno de ellos           
    tiene una manera diferente de trabajar en conjunto con los demás paquetes.

    •	Aplicando todos los tipos de controladores nos damos cuenta que la base es en el ordenamiento de datos para así tener una mejor         
    estructura.
    
**CONCLUSIONES:**

    • Cada uno de los controladores nos ayudan a controlar todos los datos ingresados de formas diferentes una más compleja que otra y        
    con una buena estructura.

**RECOMENDACIONES:**

    • Aplicar el controlador con mas precisión ya que este nos ayuda a controlar datos de gran tamaño con mucha más facilidad y             
    rápidamente.







