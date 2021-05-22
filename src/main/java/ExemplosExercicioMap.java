import java.util.Map;
import java.util.TreeMap;

public class ExemplosExercicioMap {
    public static void main(String[] args) {

        //Crie um Map e execute as seguintes operações:
        TreeMap<String, String> treeEstados = new TreeMap<>();

        //Adicione os 26 estados brasileiros no map, onde a sigla será a chave e o nome do estado o valor;
        treeEstados.put("AC", "Acre");
        treeEstados.put("AL", "Alagoas");
        treeEstados.put("AP", "Amapa");
        treeEstados.put("AM", "Amazonas");
        treeEstados.put("BA", "Bahia");
        treeEstados.put("CE", "Ceara");
        treeEstados.put("ES", "Espirito Santo");
        treeEstados.put("GO", "Goias");
        treeEstados.put("MA", "Maranhao");
        treeEstados.put("MT", "Mato Grosso");
        treeEstados.put("MS", "Mato Grosso do Sul");
        treeEstados.put("MG", "Minas Gerais");
        treeEstados.put("PA", "Para");
        treeEstados.put("PB", "Paraiba");
        treeEstados.put("PR", "Parana");
        treeEstados.put("PE", "Pernambuco");
        treeEstados.put("PI", "Piaui");
        treeEstados.put("RJ", "Rio de Janeiro");
        treeEstados.put("RN", "Rio Grande do Norte");
        treeEstados.put("RS", "Rio Grande do Sul");
        treeEstados.put("RO", "Rondonia");
        treeEstados.put("RR", "Roraima");
        treeEstados.put("SC", "Santa Catarina");
        treeEstados.put("SP", "Sao Paulo");
        treeEstados.put("SE", "Sergipe");
        treeEstados.put("TO", "Tocantins");

        System.out.println("Todos os estados: " + treeEstados);

        //Remova o estado de Minas Gerais;
        treeEstados.remove("MG");
        System.out.println(treeEstados);

        //Adicione o Distrito Federal;
        treeEstados.put("DF", "Distrito Federal");

        //Verifique o tamanho do mapa;
        System.out.println("Tamanho do Map: " + treeEstados.size());

        //Remova o estado de Mato Grosso do Sul usando o nome;
        treeEstados.values().removeIf(value -> value.contains("Mato Grosso do Sul"));
        System.out.println("Removido o estado do Mato Grosso do Sul: " + treeEstados);

        //Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA);
        for(Map.Entry<String, String> estado: treeEstados.entrySet()) {
            System.out.println(estado.getValue() + " (" + estado.getKey() + ")");
        }

        //Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC);
        System.out.println("Verificando se o estado de Santa Catarina existe no map: " + treeEstados.containsKey("SC"));

        //Verifique se o estado do Maranhão existe no map buscando por seu nome.
        System.out.println("Verificando se o estado do Maranhão existe no map: " + treeEstados.containsValue("Maranhao"));
    }
}
