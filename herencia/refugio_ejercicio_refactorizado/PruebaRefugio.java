package refugio_ejercicio_refactorizado;


public class PruebaRefugio {
    public static void main(String[] args) {
        //crea refugio con nombre indicado
        Refugio protectora = new Refugio("Protectora Mejores Amigos");

        //entran animales en el refugio
        protectora.entraAnimal(new Gato("Juana",'h'));
        protectora.entraAnimal(new Perro("Marco",'m'));
        protectora.entraAnimal(new Perro("Lassie",'h'));
        protectora.entraAnimal(new Gato("Carlos",'m'));
        protectora.entraAnimal(new Gato("Lola",'h'));
        protectora.entraAnimal(new Perro("Canela",'h'));
        protectora.entraAnimal(new Perro("Snoopy",'m'));
        protectora.entraAnimal(new Gato("Felix",'m'));

        //adopta animales
        System.out.println("Se adopta: " + protectora.adoptaGato());
        System.out.println("Se adopta: " + protectora.adoptaGato());
        System.out.println("Se adopta: " + protectora.adoptaGato());
        System.out.println("Se adopta: " + protectora.adoptaPerro());

        Animal pluto = new Perro("Pluto",'m');
        protectora.entraAnimal(pluto);

        Animal gardfield = new Gato("Gardfield",'m');
        protectora.entraAnimal(gardfield);

        System.out.println("El animal mas antiguo de " + protectora + " es: " + protectora.getAnimalAntiguo());

        //deja pasar tiempo
        try{
            Thread.sleep(300);
        }catch(InterruptedException ex){
            System.out.println("Error");
        }

        //dosis de gardfield
        System.out.println("****Dosis " + gardfield.getNombre() + " ******");
        for(Dosis d: gardfield.getVacunas()){
            System.out.println(d);
        }
        System.out.println("**********************************");


        //suministra vacunas específicas de coronavirus a los dos animales
        protectora.suministraVacunaEspecifica(VacunaPerro.CCORONAVIRUS, pluto);
        protectora.suministraVacunaEspecifica(VacunaGato.FCORONAVIRUS, gardfield);


        //dosis de pluto
        System.out.println("****Dosis " + pluto.getNombre() + " ******");
        for(Dosis d: pluto.getVacunas()){
            System.out.println(d);
        }
        System.out.println("**********************************");

        //adopta todos los animales
        System.out.println("******Adopta todos los animales*******");

        protectora.adoptaTodos();

        System.out.println("**************************************");


        //ordena historial
        protectora.ordenarHistorialEspecie();
        System.out.println("Historial ordenado por especie: ");
        protectora.getHistorial();

        protectora.ordenarHistorialFecha();
        System.out.println("Historial ordenado por fecha: " );
        protectora.getHistorial();

    }
}
