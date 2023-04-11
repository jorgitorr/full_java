package herencia.ejercicios_IV;

public class PruebaBicicleta {
    public static void main(String[] args) {
        BicicletaMontania bicicletaMontania = new BicicletaMontania(30,10,20,30);
        BicicletaTandem bicicletaTandem = new BicicletaTandem(50, 69,70,10,30);

        /*
        en el metodo acelerar() le he cambiado el nombre para poder llamar al que me apetezca,
        no se me ocurre otra forma de hacerlo
        */
        
        bicicletaMontania.acelerar();
        System.out.println(bicicletaMontania);
        bicicletaTandem.acelerar();
        System.out.println(bicicletaTandem);

        Bicicleta bicicleta = (Bicicleta)bicicletaMontania;
        bicicleta.acelerar();//lama al metodo de acelerar() del padre
        System.out.println(bicicleta);

        System.out.println("----ARRAY-----");
        Bicicleta[]bicicletas = new Bicicleta[3];
        bicicletas[0] = bicicleta;
        bicicletas[1] = bicicletaMontania;
        bicicletas[2] = bicicletaTandem;

        for(Bicicleta bici: bicicletas){
            bici.acelerar();
            System.out.println(bici);
        }
        
    }
}
