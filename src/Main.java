public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];

        empregado[0]= new EmpregadoComissionado(1,"Felipe",140,500);
        empregado[1]= new EmpregadoHorista(2,"Giovanni",120,0.3);
        empregado[2]= new EmpregadoComissionado(3,"Lucas",5,5);

        /*

        for (int i = 0; i < empregado.length; i++) {
            System.out.println(empregado[i].matricula);
            System.out.println(empregado[i].nome);
            System.out.println();
        }
        */

        for (Empregado e : empregado){
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }
    }
}
