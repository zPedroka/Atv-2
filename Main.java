public class Main {
    public static void main(String[] args) {

        Refrigerante refri1 = new Refrigerante("coca", 500, 5.50f, "normal");

        System.out.println(refri1.getNome());
        System.out.println(refri1.getMl());
        System.out.println(refri1.getPreço());
        System.out.println(refri1.getTipo());

        Varejo prdt1 = new Varejo("pod",50,"ignite","watermelon ice",4000);
        System.out.println(prdt1.getNome());
        System.out.println(prdt1.getMarca());
        System.out.println(prdt1.getMlNicotina());
        System.out.println(prdt1.getSabor());
        System.out.println(prdt1.getPuffs());

        Fitness  acdm1 = new Fitness("creatina", "Integral medica", 150.00f);
        System.out.println(acdm1.getMarca());
        System.out.println(acdm1.getNome());
        System.out.println(acdm1.getPreço());

        Higiene necessario = new Higiene("papel higienico", "neve", "macio",20.90f);
        System.out.println(necessario.getMarca());
        System.out.println(necessario.getNome());
        System.out.println(necessario.getTipo());
        System.out.println(necessario.getPreço());

        Eletronicos pdt1 = new Eletronicos("fone de ouvido", "bluetooth", "Apple", 500.00f);
        System.out.println(necessario.getPreço());
        System.out.println(necessario.getTipo());
        System.out.println(necessario.getMarca());
        System.out.println(necessario.getNome());



    }
}
