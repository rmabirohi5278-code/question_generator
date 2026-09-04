import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //creating a set of 10 questions
        String[] Questions={"What is the name of the weak zone of the earth’s crust?",
                "Where was India’s first national Museum opened?",
                "In 2019, Which popular singer was awarded the Bharat Ratna award?",
                "The world’s nation 5G mobile network was launched by which country?",
                "When was Pravasi Bhartiya Divas held in Varanasi?",
                "Vijay Singh (golf player) is from which country?",
                "What is the full form of DRDL?",
                "The green planet in the solar system is?",
                "Who is The father of Indian missile technology?",
                "What is the reason behind the Bats flying in the dark?",
        };
        //giving 4 options
        String[] abcd={"A","D","C","C","C","D","B","B","D","A"};
        String[][] options={
                {"Seismic", "Cosmic", "Formic", "Anaemic"},
                {"Delhi", "Hyderabad", "Rajasthan", "Mumbai"},
                {"Lata Mangeshkar", "Asha Bhosle", "Bhupen Hazarika","Manna Dey"},
                {"Japan", "Asia", "South Korea", "Malaysia"},
                {"2017", "2015", "2019", "2020"},
                {"UK", "USA", "India", "Fiji"},
                {"Differential Research and Documentation Laboratory", "Department of Research and Development Laboratory", "Defense Research and Development Laboratory", "None of the above"},
                {"Mars", "Uranus", "Venus", "Earth"},
                {"Dr Homi Bhabha", "Dr Chidambaram", "Dr U.R. Rao", "Dr A.P.J. Abdul Kalam"},

                {"they produce high pitched sounds called ultrasonics", "the light startles them", "they have a perfect vision in the dark", "none of the above"}
        };
        //storing the correct answers
        String[] answers={"Seismic","Mumbai","Bhupen Hazarika","South Korea","2019","Fiji","Department of Research and Development Laboratory","Uranus","Dr A.P.J. Abdul Kalam","they produce high pitched sounds called ultrasonics"};
        int score=0;
        String user;
        for (int i=0;i<10;i++){
            System.out.printf("%d %s\n",i+1,Questions[i]);
            int choice=64;
            for (int j=0;j<4;j++){
                System.out.printf("%c) %s\n",choice+j+1,options[i][j]);
            }
            System.out.println("Enter your answer A/B/C/D");
            user=sc.nextLine();
            if (user.equalsIgnoreCase(abcd[i])){
                score++;
                System.out.println("Correct!");
            }else{
                System.out.println("Sorry the answer is \'"+answers[i]+"\'");
            }
        }
        System.out.println("To view score enter 0");
        int view=sc.nextInt();
        if (view==0){
            System.out.println(score);
        }
        System.out.println("Thanks for answering");
    }
}