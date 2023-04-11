package refugio_ejercicio;


public class PruebaRefugio {
    public static void main(String[] args) {
        Refugio protectora = new Refugio("Protectora Mejores Amigos");

        protectora.entraAnimal(new Gato("Juana",'h'));
        protectora.entraAnimal(new Perro("Marco",'m'));
        protectora.entraAnimal(new Perro("Lassie",'h'));
        protectora.entraAnimal(new Gato("Carlos",'m'));
        protectora.entraAnimal(new Gato("Lola",'h'));
        protectora.entraAnimal(new Perro("Canela",'h'));
        protectora.entraAnimal(new Perro("Snoopy",'m'));
        protectora.entraAnimal(new Gato("Felix",'m'));

        //si no es el animal que pido me va a sacar los animales  meterlos en la cola de nuevo
        System.out.println("Se adopta: " + protectora.adoptaGato());
        System.out.println("Se adopta: " + protectora.adoptaGato());
        System.out.println("Se adopta: " + protectora.adoptaGato());
        System.out.println("Se adopta: " + protectora.adoptaPerro());

        Animal pluto = new Perro("Pluto",'m');
        protectora.entraAnimal(pluto);

        Animal gardfield = new Gato("Gardfield",'m');
        protectora.entraAnimal(gardfield);

        System.out.println(protectora);
        System.out.println("El animal mas antiguo: " + protectora.getAnimalAntiguo());

        try{
            Thread.sleep(300);
        }catch(InterruptedException ex){
            System.out.println("Error");
        }

        System.out.println(gardfield.getVacunas());

        protectora.suministraVacunaEspecifica(VacunaPerro.CCORONAVIRUS, pluto);
        protectora.suministraVacunaEspecifica(VacunaGato.FCORONAVIRUS, gardfield);

        System.out.println(pluto.getVacunas());

        protectora.adoptaTodos();
        
        protectora.ordenarHistorialEspecie();
        System.out.println(protectora.getHistorial());
        protectora.ordenarHistorialFecha();
        System.out.println(protectora.getHistorial());

    }




}
