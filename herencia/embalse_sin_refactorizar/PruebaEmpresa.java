package embalse;

public class PruebaEmpresa {
    public static void main(String[] args) {
        //creacion de la empresa
        Empresa empresa = new Empresa("Isabel II");

        //creacion de los embalses
        Embalse villar = new EmbalseSuperficie("El Villar", 1879, 22.4, Uso.RIEGO);
        Embalse riosequillo = new EmbalseSuperficie("Riosequillo", 1958, 55.0, Uso.RIEGO);
        Embalse atazar = new EmbalseSuperficie("El Atazar", 1972, 425.3, Uso.ABASTECIMIENTO);
        Embalse vado = new EmbalseSuperficie("El Vado", 1960, 55.0, Uso.ELECTRICIDAD);
        Embalse pedrezuela = new EmbalseSuperficie("Pedrezuela", 1968, 40.9, Uso.ELECTRICIDAD);
        Embalse manzanaresReal = new EmbalseSuperficie("Santillana", 1969, 91.2, Uso.PESCA);
        Embalse navaCerrada = new EmbalseSuperficie("Navacerrada", 1969, 11.0, Uso.ABASTECIMIENTO);
        Embalse acuiferoCetatico = new EmbalseSubterraneo("Acuifero CC", 1969, 12.0, Uso.ABASTECIMIENTO);
        Embalse acuiferoTerciario = new EmbalseSubterraneo("Acuifero TD", 1969, 150.0, Uso.ABASTECIMIENTO);

        //aporta el embalse inicial
        // aporta el embalse inicial
        villar.aportar(19.7);
        riosequillo.aportar(38.0);
        atazar.aportar(290.6);
        vado.aportar(39.6);
        pedrezuela.aportar(31.8);
        manzanaresReal.aportar(71.7);
        navaCerrada.aportar(10.1);
        acuiferoCetatico.aportar(6.9);
        acuiferoTerciario.aportar(48.5);

        //agrega perdidas
        //para poder acceder a los metodos del embalseSuperficie(su hijo) tengo que hacer downcasting
        EmbalseSuperficie villarSuperficie;
        EmbalseSuperficie riosequilloEmbalseSuperficie;
        EmbalseSuperficie atazarEmbalseSuperficie;
        EmbalseSuperficie vadoEmbalseSuperficie;
        EmbalseSuperficie pedrezuelaEmbalseSuperficie;
        EmbalseSuperficie manzanaresSuperficie;
        EmbalseSuperficie navacerradEmbalseSuperficie;
        EmbalseSubterraneo acuCretaticSubterraneo;
        EmbalseSubterraneo acuTerciariSubterraneo;

        villarSuperficie = (EmbalseSuperficie)villar;
        riosequilloEmbalseSuperficie = (EmbalseSuperficie)riosequillo;
        atazarEmbalseSuperficie = (EmbalseSuperficie)atazar;
        vadoEmbalseSuperficie = (EmbalseSuperficie)vado;
        pedrezuelaEmbalseSuperficie = (EmbalseSuperficie)pedrezuela;
        manzanaresSuperficie = (EmbalseSuperficie)manzanaresReal;
        navacerradEmbalseSuperficie = (EmbalseSuperficie)navaCerrada;
        acuCretaticSubterraneo = (EmbalseSubterraneo)acuiferoCetatico;
        acuTerciariSubterraneo = (EmbalseSubterraneo)acuiferoTerciario;

        //agrego el porcentaje de perdida a los embalsesSuperficie
        villarSuperficie.setPorcentajePerdida(2.8);
        riosequilloEmbalseSuperficie.setPorcentajePerdida(3.1);
        atazarEmbalseSuperficie.setPorcentajePerdida(7.4);
        vadoEmbalseSuperficie.setPorcentajePerdida(3.9);
        pedrezuelaEmbalseSuperficie.setPorcentajePerdida(2.9);
        manzanaresSuperficie.setPorcentajePerdida(4.7);
        navacerradEmbalseSuperficie.setPorcentajePerdida(2.0);


        //agrego minino a los embalsesSubterraneo
        acuCretaticSubterraneo.setCantidadMinima(3.0);
        acuTerciariSubterraneo.setCantidadMinima(5.5);

        //agrega los embalses a la empresa (son embalses de algun tipo)
        empresa.agregaEmbalse(villarSuperficie);
        empresa.agregaEmbalse(riosequilloEmbalseSuperficie);
        empresa.agregaEmbalse(atazarEmbalseSuperficie);
        empresa.agregaEmbalse(vadoEmbalseSuperficie);
        empresa.agregaEmbalse(pedrezuelaEmbalseSuperficie);
        empresa.agregaEmbalse(manzanaresSuperficie);
        empresa.agregaEmbalse(navacerradEmbalseSuperficie);
        empresa.agregaEmbalse(acuCretaticSubterraneo);
        empresa.agregaEmbalse(acuTerciariSubterraneo);

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
