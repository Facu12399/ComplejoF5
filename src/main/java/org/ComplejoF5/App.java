package org.ComplejoF5;

import org.ComplejoF5.entidad.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();

        session.beginTransaction();
    	
        //Creamos una lista donde estaran las horas disponibles
        List<LocalTime> listaHorasDisponiblesLunes = new ArrayList<>();
        List<LocalTime> listaHorasDisponiblesMartes = new ArrayList<>();
        List<LocalTime> listaHorasDisponiblesMiercoles = new ArrayList<>();
        List<LocalTime> listaHorasDisponiblesJueves = new ArrayList<>();
        List<LocalTime> listaHorasDisponiblesViernes = new ArrayList<>();
        List<LocalTime> listaHorasDisponiblesSabado = new ArrayList<>();

        //Creamos las horas con el LocalTime, solo nos interesa la hora y los minutos
        LocalTime horalunes17 = LocalTime.of(17, 0);
        LocalTime horalunes18 = LocalTime.of(18, 0);
        LocalTime horalunes19 = LocalTime.of(19, 0);
        LocalTime horalunes20 = LocalTime.of(20, 0);
        LocalTime horalunes21 = LocalTime.of(21, 0);
        LocalTime horalunes22 = LocalTime.of(22, 0);
        LocalTime horalunes23 = LocalTime.of(23, 0);

        LocalTime horamartes17 = LocalTime.of(17, 0);
        LocalTime horamartes18 = LocalTime.of(18, 0);
        LocalTime horamartes19 = LocalTime.of(19, 0);
        LocalTime horamartes20 = LocalTime.of(20, 0);
        LocalTime horamartes21 = LocalTime.of(21, 0);
        LocalTime horamartes22 = LocalTime.of(22, 0);
        LocalTime horamartes23 = LocalTime.of(23, 0);

        LocalTime horamiercoles17 = LocalTime.of(17, 0);
        LocalTime horamiercoles18 = LocalTime.of(18, 0);
        LocalTime horamiercoles19 = LocalTime.of(19, 0);
        LocalTime horamiercoles20 = LocalTime.of(20, 0);
        LocalTime horamiercoles21 = LocalTime.of(21, 0);
        LocalTime horamiercoles22 = LocalTime.of(22, 0);
        LocalTime horamiercoles23 = LocalTime.of(23, 0);

        LocalTime horajueves17 = LocalTime.of(17, 0);
        LocalTime horajueves18 = LocalTime.of(18, 0);
        LocalTime horajueves19 = LocalTime.of(19, 0);
        LocalTime horajueves20 = LocalTime.of(20, 0);
        LocalTime horajueves21 = LocalTime.of(21, 0);
        LocalTime horajueves22 = LocalTime.of(22, 0);
        LocalTime horajueves23 = LocalTime.of(23, 0);

        LocalTime horaviernes17 = LocalTime.of(17, 0);
        LocalTime horaviernes18 = LocalTime.of(18, 0);
        LocalTime horaviernes19 = LocalTime.of(19, 0);
        LocalTime horaviernes20 = LocalTime.of(20, 0);
        LocalTime horaviernes21 = LocalTime.of(21, 0);
        LocalTime horaviernes22 = LocalTime.of(22, 0);
        LocalTime horaviernes23 = LocalTime.of(23, 0);

        LocalTime horasabado17 = LocalTime.of(17, 0);
        LocalTime horasabado18 = LocalTime.of(18, 0);
        LocalTime horasabado19 = LocalTime.of(19, 0);
        LocalTime horasabado20 = LocalTime.of(20, 0);
        LocalTime horasabado21 = LocalTime.of(21, 0);
        LocalTime horasabado22 = LocalTime.of(22, 0);
        LocalTime horasabado23 = LocalTime.of(23, 0);

        //Creamos los dias de la semana (hasta el sabado) con las hs disponibles
        DiaHora lunes = new DiaHora();
        DiaHora martes = new DiaHora();
        DiaHora miercoles = new DiaHora();
        DiaHora jueves = new DiaHora();
        DiaHora viernes = new DiaHora();
        DiaHora sabado = new DiaHora();

        lunes.setDia("Lunes");
        listaHorasDisponiblesLunes.add(horalunes17);
        listaHorasDisponiblesLunes.add(horalunes18);
        listaHorasDisponiblesLunes.add(horalunes19);
        listaHorasDisponiblesLunes.add(horalunes20);
        listaHorasDisponiblesLunes.add(horalunes21);
        listaHorasDisponiblesLunes.add(horalunes22);
        listaHorasDisponiblesLunes.add(horalunes23);

        martes.setDia("Martes");
        listaHorasDisponiblesMartes.add(horamartes17);
        listaHorasDisponiblesMartes.add(horamartes18);
        listaHorasDisponiblesMartes.add(horamartes19);
        listaHorasDisponiblesMartes.add(horamartes20);
        listaHorasDisponiblesMartes.add(horamartes21);
        listaHorasDisponiblesMartes.add(horamartes22);
        listaHorasDisponiblesMartes.add(horamartes23);

        miercoles.setDia("Miercoles");
        listaHorasDisponiblesMiercoles.add(horamiercoles17);
        listaHorasDisponiblesMiercoles.add(horamiercoles18);
        listaHorasDisponiblesMiercoles.add(horamiercoles19);
        listaHorasDisponiblesMiercoles.add(horamiercoles20);
        listaHorasDisponiblesMiercoles.add(horamiercoles21);
        listaHorasDisponiblesMiercoles.add(horamiercoles22);
        listaHorasDisponiblesMiercoles.add(horamiercoles23);

        jueves.setDia("Jueves");
        listaHorasDisponiblesJueves.add(horajueves17);
        listaHorasDisponiblesJueves.add(horajueves18);
        listaHorasDisponiblesJueves.add(horajueves19);
        listaHorasDisponiblesJueves.add(horajueves20);
        listaHorasDisponiblesJueves.add(horajueves21);
        listaHorasDisponiblesJueves.add(horajueves22);
        listaHorasDisponiblesJueves.add(horajueves23);

        viernes.setDia("Viernes");
        listaHorasDisponiblesViernes.add(horaviernes17);
        listaHorasDisponiblesViernes.add(horaviernes18);
        listaHorasDisponiblesViernes.add(horaviernes19);
        listaHorasDisponiblesViernes.add(horaviernes20);
        listaHorasDisponiblesViernes.add(horaviernes21);
        listaHorasDisponiblesViernes.add(horaviernes22);
        listaHorasDisponiblesViernes.add(horaviernes23);

        sabado.setDia("Sabado");
        listaHorasDisponiblesSabado.add(horasabado17);
        listaHorasDisponiblesSabado.add(horasabado18);
        listaHorasDisponiblesSabado.add(horasabado19);
        listaHorasDisponiblesSabado.add(horasabado20);
        listaHorasDisponiblesSabado.add(horasabado21);
        listaHorasDisponiblesSabado.add(horasabado22);
        listaHorasDisponiblesSabado.add(horasabado23);

        //Agregamos las hs disponibles a cada día
        lunes.setHora(listaHorasDisponiblesLunes);
        martes.setHora(listaHorasDisponiblesMartes);
        miercoles.setHora(listaHorasDisponiblesMiercoles);
        jueves.setHora(listaHorasDisponiblesJueves);
        viernes.setHora(listaHorasDisponiblesViernes);
        sabado.setHora(listaHorasDisponiblesSabado);

        //Agregamos todos los dias a la semana con sus respectivas hs disponibles
        Semana semana = new Semana();
        List<DiaHora> listaDiasSemana = new ArrayList<>();
        listaDiasSemana.add(lunes);
        listaDiasSemana.add(martes);
        listaDiasSemana.add(miercoles);
        listaDiasSemana.add(jueves);
        listaDiasSemana.add(viernes);
        listaDiasSemana.add(sabado);
        semana.setSemana(listaDiasSemana);

        //Creamos un menú para generar turnos
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        List<GenerarTurno> listaTurnosGenerados = new ArrayList<>();
        TurnosGenerados turnosGenerados = new TurnosGenerados();


        do{
            System.out.println("Bienvenido a Complejo F5. por favor elija una opción: ");
            System.out.println("1)Generar turno\n2)Ver Turnos disponibles\n3)Ver Turnos agendados\n4)Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1 :
                    System.out.println("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su apellido: ");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese su telefono: ");
                    String telefono = sc.nextLine();

                    Persona persona = new Persona();
                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    persona.setTelefono(telefono);
                    session.save(persona);

                    System.out.println("¿Que día desea solicitar un turno?");
                    System.out.println("1)Lunes\n2)Martes\n3)Miercoles\n4)Jueves\n5)Viernes\n6)Sabado");
                    int dia = sc.nextInt();
                    GenerarTurno turno = new GenerarTurno();

                    switch (dia){
                        case 1:
                            System.out.println("Elija por orden las siguientes horas: ");
                            for (int i = 0; i < lunes.getHora().size(); i++) {
                                System.out.println(i+1 + ") " + lunes.getHora().get(i));
                            }
                            int hora = sc.nextInt();
                            listaHorasDisponiblesLunes.remove(hora-1);

                            turno.setPersona(persona);
                            turno.setDia(lunes.getDia());
                            switch (hora) {
                                case 1:
                                    turno.setHora(horalunes17);
                                    session.save(turno);
                                    break;
                                case 2:
                                    turno.setHora(horalunes18);
                                    session.save(turno);
                                    break;
                                case 3:
                                    turno.setHora(horalunes19);
                                    session.save(turno);
                                    break;
                                case 4:
                                    turno.setHora(horalunes20);
                                    session.save(turno);
                                    break;
                                case 5:
                                    turno.setHora(horalunes21);
                                    session.save(turno);
                                    break;
                                case 6:
                                    turno.setHora(horalunes22);
                                    session.save(turno);
                                    break;
                                case 7:
                                    turno.setHora(horalunes23);
                                    session.save(turno);
                                    break;
                                default:
                                	System.out.println("El número ingresado no es correcto");
                                	break;
                            }
                            listaTurnosGenerados.add(turno);
                            turnosGenerados.setListaTurnos(listaTurnosGenerados);
                            System.out.println("Su turno se ha generado con exito");

                            break;
                        case 2:
                            System.out.println("Elija por orden las siguientes horas: ");
                            for (int i = 0; i < martes.getHora().size(); i++) {
                                System.out.println(i+1 + ") " + martes.getHora().get(i));
                            }
                            hora = sc.nextInt();
                            listaHorasDisponiblesMartes.remove(hora-1);
                            turno.setPersona(persona);
                            turno.setDia(martes.getDia());
                            switch (hora) {
                                case 1:
                                    turno.setHora(horamartes17);
                                    session.save(turno);
                                    break;
                                case 2:
                                    turno.setHora(horamartes18);
                                    session.save(turno);
                                    break;
                                case 3:
                                    turno.setHora(horamartes19);
                                    session.save(turno);
                                    break;
                                case 4:
                                    turno.setHora(horamartes20);
                                    session.save(turno);
                                    break;
                                case 5:
                                    turno.setHora(horamartes21);
                                    session.save(turno);
                                    break;
                                case 6:
                                    turno.setHora(horamartes22);
                                    session.save(turno);
                                    break;
                                case 7:
                                    turno.setHora(horamartes23);
                                    session.save(turno);
                                    break;
                                default:
                                	System.out.println("El número ingresado no es correcto");
                                	break;
                            }
                            listaTurnosGenerados.add(turno);
                            turnosGenerados.setListaTurnos(listaTurnosGenerados);
                            session.save(persona);
                            System.out.println("Su turno se ha generado con exito");

                            break;
                        case 3:
                            System.out.println("Elija por orden las siguientes horas: ");
                            for (int i = 0; i < miercoles.getHora().size(); i++) {
                                System.out.println(i+1 + ") " + miercoles.getHora().get(i));
                            }
                            hora = sc.nextInt();
                            listaHorasDisponiblesMiercoles.remove(hora-1);
                            turno.setPersona(persona);
                            turno.setDia(miercoles.getDia());
                            switch (hora) {
                                case 1:
                                    turno.setHora(horamiercoles17);
                                    session.save(turno);
                                    break;
                                case 2:
                                    turno.setHora(horamiercoles18);
                                    session.save(turno);
                                    break;
                                case 3:
                                    turno.setHora(horamiercoles19);
                                    session.save(turno);
                                    break;
                                case 4:
                                    turno.setHora(horamiercoles20);
                                    session.save(turno);
                                    break;
                                case 5:
                                    turno.setHora(horamiercoles21);
                                    session.save(turno);
                                    break;
                                case 6:
                                    turno.setHora(horamiercoles22);
                                    session.save(turno);
                                    break;
                                case 7:
                                    turno.setHora(horamiercoles23);
                                    session.save(turno);
                                    break;
                                default:
                                	System.out.println("El número ingresado no es correcto");
                                	break;
                            }
                            listaTurnosGenerados.add(turno);
                            turnosGenerados.setListaTurnos(listaTurnosGenerados);
                            System.out.println("Su turno se ha generado con exito");
                            break;
                        case 4:
                            System.out.println("Elija por orden las siguientes horas: ");
                            for (int i = 0; i < jueves.getHora().size(); i++) {
                                System.out.println(i+1 + ") " + jueves.getHora().get(i));
                            }
                            hora = sc.nextInt();
                            listaHorasDisponiblesJueves.remove(hora-1);
                            turno.setPersona(persona);
                            turno.setDia(jueves.getDia());
                            switch (hora) {
                                case 1:
                                    turno.setHora(horajueves17);
                                    session.save(turno);
                                    break;
                                case 2:
                                    turno.setHora(horajueves18);
                                    session.save(turno);
                                    break;
                                case 3:
                                    turno.setHora(horajueves19);
                                    session.save(turno);
                                    break;
                                case 4:
                                    turno.setHora(horajueves20);
                                    session.save(turno);
                                    break;
                                case 5:
                                    turno.setHora(horajueves21);
                                    session.save(turno);
                                    break;
                                case 6:
                                    turno.setHora(horajueves22);
                                    session.save(turno);
                                    break;
                                case 7:
                                    turno.setHora(horajueves23);
                                    session.save(turno);
                                    break;
                                default:
                                	System.out.println("El número ingresado no es correcto");
                                	break;
                            }
                            listaTurnosGenerados.add(turno);
                            turnosGenerados.setListaTurnos(listaTurnosGenerados);
                            
                            session.save(persona);
                            System.out.println("Su turno se ha generado con exito");
                            break;
                        case 5:
                            System.out.println("Elija por orden las siguientes horas: ");
                            for (int i = 0; i < viernes.getHora().size(); i++) {
                                System.out.println(i+1 + ") " + viernes.getHora().get(i));
                            }
                            hora = sc.nextInt();
                            listaHorasDisponiblesViernes.remove(hora-1);
                            turno.setPersona(persona);
                            turno.setDia(viernes.getDia());
                            switch (hora) {
                                case 1:
                                    turno.setHora(horaviernes17);
                                    session.save(turno);
                                    break;
                                case 2:
                                    turno.setHora(horaviernes18);
                                    session.save(turno);
                                    break;
                                case 3:
                                    turno.setHora(horaviernes19);
                                    session.save(turno);
                                    break;
                                case 4:
                                    turno.setHora(horaviernes20);
                                    session.save(turno);
                                    break;
                                case 5:
                                    turno.setHora(horaviernes21);
                                    session.save(turno);
                                    break;
                                case 6:
                                    turno.setHora(horaviernes22);
                                    session.save(turno);
                                    break;
                                case 7:
                                    turno.setHora(horaviernes23);
                                    session.save(turno);
                                    break;
                                default:
                                	System.out.println("El número ingresado no es correcto");
                                	break;
                            }
                            listaTurnosGenerados.add(turno);
                            turnosGenerados.setListaTurnos(listaTurnosGenerados);
                            System.out.println("Su turno se ha generado con exito");

                            break;
                        case 6:
                            System.out.println("Elija por orden las siguientes horas: ");
                            for (int i = 0; i < sabado.getHora().size(); i++) {
                                System.out.println(i+1 + ") " + sabado.getHora().get(i));
                            }
                            hora = sc.nextInt();
                            listaHorasDisponiblesSabado.remove(hora-1);
                            turno.setPersona(persona);
                            turno.setDia(sabado.getDia());
                            switch (hora) {
                                case 1:
                                    turno.setHora(horasabado17);
                                    session.save(turno);
                                    break;
                                case 2:
                                    turno.setHora(horasabado18);
                                    session.save(turno);
                                    break;
                                case 3:
                                    turno.setHora(horasabado19);
                                    session.save(turno);
                                    break;
                                case 4:
                                    turno.setHora(horasabado20);
                                    session.save(turno);
                                    break;
                                case 5:
                                    turno.setHora(horasabado21);
                                    session.save(turno);
                                    break;
                                case 6:
                                    turno.setHora(horasabado22);
                                    session.save(turno);
                                    break;
                                case 7:
                                    turno.setHora(horasabado23);
                                    session.save(turno);
                                    break;
                                default:
                                	System.out.println("El número ingresado no es correcto");
                                	break;
                            }
                            listaTurnosGenerados.add(turno);
                            turnosGenerados.setListaTurnos(listaTurnosGenerados);
                            System.out.println("Su turno se ha generado con exito");
                            break;
                        default:
                            break;
                    }

                    break;
                case 2:
                    //Haber creado la clase semana agiliza el proceso para mostrar los datos
                    for (int i = 0; i < listaDiasSemana.size(); i++) {
                        System.out.println(semana.getSemana().get(i).getDia());
                        System.out.println(semana.getSemana().get(i).getHora());
                        System.out.println();
                    }
                    break;
                case 3:
                    if (listaTurnosGenerados.size() == 0){
                        System.out.println("No hay turnos agendados por el momento");
                    } else {
                        for (int i = 0; i < turnosGenerados.getListaTurnos().size(); i++) {
                            System.out.println(turnosGenerados.getListaTurnos().get(i).getDia());
                            System.out.println(turnosGenerados.getListaTurnos().get(i).getHora());
                            System.out.println(turnosGenerados.getListaTurnos().get(i).getPersona().getNombre()
                                    + " " + turnosGenerados.getListaTurnos().get(i).getPersona().getApellido());
                            System.out.println(turnosGenerados.getListaTurnos().get(i).getPersona().getTelefono());
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar Complejo F5");
                    break;
                default:
                	System.out.println("El número ingresado no es correcto");
                	break;

            }


        }while (opcion!=4);
        

        session.getTransaction().commit();
        session.close();
        
        sessionFactory.close();
    }
}
