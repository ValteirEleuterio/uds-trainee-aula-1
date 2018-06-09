import javax.swing.*;

public class Main {
    public static String nome = "Valteir Eleuterio Alvs";
    public static Integer idade = 39;
    public static Boolean sexoMasculino = true;
    public static Double peso = 200.00;
    public static Integer dia = 9;
    public static String s = sex(sexoMasculino);

    public static void main(String[]args) {
        System.out.println("Sexo: " + s);
        System.out.println("Olá, meu nome é " + nome + ",tenho " + idade + " anos de idade");
        System.out.println(CalculaIdade(idade));
        System.out.println(DiaSemana(dia));


        for (int i = 1; i <= 10; i++)
            System.out.println(AlgRomanos(i));

        int i = 1;
        while (i <= 10){
            System.out.println(AlgRomanos(i));
            i++;
        }


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        System.out.println(AlgRomanos(num));*/

        /*Integer num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        String Resultado = AlgRomanos(num);
        if (Resultado == "Numero inválido")
            JOptionPane.showMessageDialog(null, Resultado);
        else
            JOptionPane.showMessageDialog(null, "O numero " +
                          + num+ " convertido para numero Romano é "+AlgRomanos(num));*/
    }

    //VERIFICA ALG ROMANOS
    public static String AlgRomanos(int num){
        switch (num){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            default: return "Numero inválido";
        }
    }

    //CALCULA O DIA DA SEMANA
    public static String DiaSemana(Integer dia){
        switch (dia){
            case 1: return "Domingo";
            case 2: return "Segunda-Feira";
            case 3: return "Terça-Feira";
            case 4: return "Quarta-Feira";
            case 5: return "Quinta-Feira";
            case 6: return "Sexta-Feira";
            case 7: return "Sabado";
            default: return "Não é um dia da semana";
        }
    }

    // CALCULA A IDADE (NOVINHO/ TIOZINHO/ TIOZÃO)
    public static String CalculaIdade (int idade){
        if (idade <= 18)
            return "Novinho";
        else if (idade <= 30)
            return "Tiozinho";
        else
            return "Tiozão";
    }

    //VALIDA O SEXO
    public static String sex(Boolean s){
        if (s == true)
            return "Masculino";
        else
            return "Feminino";
    }
}
