import java.util.Scanner;

public class EnglishProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Do you want to pratice your English?");
        String q1 = sc.nextLine();
        if (q1.equalsIgnoreCase("yes")){
            System.out.println("Great! Let's start! :D");
            System.out.println("First question: What is the -ing of the word make?");
            String q2 = sc.nextLine();
            if (q2.equalsIgnoreCase("Making")) {
                score++;
                System.out.println("Correct! :)");
                System.out.println("Your score for now it's: " + score);
                System.out.println("Next question?");
                String q3 = sc.nextLine();
                if (q3.equalsIgnoreCase("yes")){
                    System.out.println("Okay let's do it! Just one more question! :)");
                    System.out.println("Mr. user, if you really looking for me, What country it's my definitve dream to living?");
                    String q4 = sc.nextLine();
                    if (q4.equalsIgnoreCase("Switzerland")) {
                        score++;
                        score++;
                        System.out.println("Correct! You really know me! I really excited to find you in SwitzerLand! :)");
                        System.out.println("Now, let's study a many quiz about Gym in English?");
                        System.out.println("You prepared? (Response two times!");
                        String q5 = sc.nextLine();
                        if (q5.equalsIgnoreCase("yes")) {
                            System.out.println("Good! So, you needed a focus!");
                        }
                        System.out.println("In portuguese, What exercise its': 'bench press'?");
                        String q6 = sc.nextLine();
                        if (q6.equalsIgnoreCase("Supino")) {
                            System.out.println("Correct, so next question:");
                            score++;
                            score++;
                        } else { //5°if
                            System.out.println("Very bad, you don't are a good GymBoy! Bye!!");
                        }
                        System.out.println("What type of exercise it's 'SQUAT'? This is easy!");
                        String q7 = sc.nextLine();
                        if (q7.equalsIgnoreCase("Agachamento")) {
                            score++;
                            System.out.println("Good, ready for the last and the most hard question?!");
                            String q8 = sc.nextLine();
                            System.out.println("Good, let's start.");
                        } else {
                            System.out.println("You are good, but you need better next time!");
                            score--;
                            score--;
                            score--;
                            score--;
                            score--;
                            System.out.println("Your final score it's: " + score);
                        }
                        System.out.println("Um atleta de calistenia consegue realizar 20 repetições máximas (RM) de barra fixa (pull-ups) em sua primeira série, atingindo a falha concêntrica total. Após um descanso rigoroso de 60 segundos, ele tenta realizar uma segunda série com a mesma carga (peso corporal), mas atinge a falha na 12ª repetição." +
                                "Considerando a bioenergética muscular e a fisiologia do exercício, analise as afirmações abaixo:" +
                                "I. A queda no rendimento (de 20 para 12 repetições) ocorre principalmente porque 60 segundos são insuficientes para a ressíntese completa do sistema ATP-CP (Fosfocreatina), que necessita de cerca de 3 a 5 minutos para voltar a níveis próximos de 100%." +
                                "II. O principal fator limitante a partir da 10ª repetição na primeira série é o acúmulo de ácido lático, onde o íon lactato (L^-) inibe diretamente as enzimas glicolíticas e bloqueia os sítios de ligação da actina-miosina." +
                                "III. A falha na segunda série é puramente mecânica (fadiga periférica), não havendo influência do sistema nervoso central (fadiga central) na diminuição do recrutamento de unidades motoras devido ao curto tempo de estímulo." +
                                "Pergunta:" +
                                "Quais das afirmações acima estão corretas e explicam cientificamente o fenômeno descrito?" +
                                "A) Apenas I." +
                                "B) Apenas II." +
                                "C) Apenas I e II." +
                                "D) Apenas I e III." +
                                "E) Todas estão corretas.");
                        String q9 = sc.nextLine();
                        if (q9.equalsIgnoreCase("B")) {
                            System.out.println("Perfect, this question it's so hard about ENEM! And you do it! Congratulations!!!");
                        score++;
                        score++;
                        score++;
                        score++;
                        } else {
                            System.out.println("Incorrect, but congratulations for ends here. Nex time you can try again.");
                            score--;
                        }
                        System.out.println("Your final score it's: " + (score));
                        System.out.println("Well, this learning process ends here, i really happy for you, you really are a good friend/student! See you next meeting! :D");
                    }else { //4ºif
                        score--;
                        System.out.println("All right, this response is not correct!!! You never find me in this secret country! Bye, i'm so sad to know this! :(");
                        System.out.println("Your final score it's: " + (score));
                    }
                } else { //2°if
                    System.out.println("Okay, thank you for your time, maybe next time!, see you later!");
                }
            } else { //3°if
                System.out.println("Incorrect! But don't worry, you can try again! :)");
                System.out.println("Your score it's so bad, but it's this: " + score);
            }
        } else { //1°if
            System.out.println("Okay, good bye!, see you later :(");
        } } }