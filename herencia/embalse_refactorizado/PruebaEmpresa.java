

public class PruebaEmpresa {
    public static void main(String[] args) {
        //creacion de la empresa
        Empresa empresa = new Empresa("Isabel II");

        //creacion de los embalses
        Embalse villar = new EmbalseSuperficie("El Villar", 1879, 22.4, Uso.RIEGO,2.8);
        Embalse riosequillo = new EmbalseSuperficie("Riosequillo", 1958, 55.0, Uso.RIEGO,3.1);
        Embalse atazar = new EmbalseSuperficie("El Atazar", 1972, 425.3, Uso.ABASTECIMIENTO,7.4);
        Embalse vado = new EmbalseSuperficie("El Vado", 1960, 55.0, Uso.ELECTRICIDAD,3.9);
        Embalse pedrezuela = new EmbalseSuperficie("Pedrezuela", 1968, 40.9, Uso.ELECTRICIDAD,2.9);
        Embalse manzanaresReal = new EmbalseSuperficie("Santillana", 1969, 91.2, Uso.PESCA,4.7);
        Embalse navaCerrada = new EmbalseSuperficie("Navacerrada", 1969, 11.0, Uso.ABASTECIMIENTO,2.0);
        Embalse acuiferoCetatico = new EmbalseSubterraneo("Acuifero CC", 1969, 12.0, Uso.ABASTECIMIENTO,3.0);
        Embalse acuiferoTerciario = new EmbalseSubterraneo("Acuifero TD", 1969, 150.0, Uso.ABASTECIMIENTO,5.5);

        /*aporta el embalse inicial
        aporta el embalse inicial*/
        villar.aportar(19.7);
        riosequillo.aportar(38.0);
        atazar.aportar(290.6);
        vado.aportar(39.6);
        pedrezuela.aportar(31.8);
        manzanaresReal.aportar(71.7);
        navaCerrada.aportar(10.1);
        acuiferoCetatico.aportar(6.9);
        acuiferoTerciario.aportar(48.5);

        //agrega los embalses a la empresa (son embalses de algun tipo)
        empresa.agregaEmbalse(villar);
        empresa.agregaEmbalse(riosequillo);
        empresa.agregaEmbalse(atazar);
        empresa.agregaEmbalse(vado);
        empresa.agregaEmbalse(pedrezuela);
        empresa.agregaEmbalse(manzanaresReal);
        empresa.agregaEmbalse(navaCerrada);
        empresa.agregaEmbalse(acuiferoCetatico);
        empresa.agregaEmbalse(acuiferoTerciario);

        //imprime informe de embalses
        empresa.informeEmbalses();

        //trasvase de embalse El Atazar al embalse El Vado
        System.out.println("********************");
        System.out.println("Antes de trasvasar: ");
        System.out.println(atazar);
        System.out.println(vado);

        atazar.trasvasar(vado, 10);

        System.out.println("*********************");
        System.out.println("Despues de trasvasar: ");
        System.out.println(atazar);
        System.out.println(vado);
        System.out.println("*********************");

        System.out.println();
        empresa.informeAguaEmbalsadaUnUso(Uso.ABASTECIMIENTO);
        empresa.informePendientellenado();

        
    }
}
