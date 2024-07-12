/*
 * Utilizando array para armazenar as notas dos alunos
 */
package notas_dos_alunos;

public class GradeBook {
    
    // variáveis de instância
    private String courseName; // nome do curso que essa classe representa
    
    // declara o vetor grades (notas)
    private int[] grades; // vetor para armazenar as notas dos alunos

    // construtor da classe
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    } // end construtor

    // método para configurar o nome do curso
    public void setCurseName(String curseName) {
        this.courseName = curseName;
    } // end setCurseName

    // método para recuperar o nome do curso
    public String getCurseName() {
        return courseName;
    } // end getCurseName

    // realiza várias operações nos dados
    public void processGrades() {

        // chama método que gera a saída das notas do array
        outputGrades();

        // chama o método getAverage para calcular a média das notas
        System.out.printf("%nClass average is %.2f%n", getAverage());
        
        // chama os métodos getMinimum Menor valor e getMaximom Maior
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
                getMinimum(), getMaximum());

        // chaMa o outputBarChart para inpriMir gráfico de distribuição de notas
        outputBarChart();        
    } // end processGrades

    // método para localizar nota mínima
    public int getMinimum() {

        // variável
        int lowGrade = grades[0]; // supôe que grades[0] é a menor nota

        // loop for aprimorado pelo array
        for (int grade : grades) {
            
            // se grade menor que lowGrade
            if (grade < lowGrade) {
                // lowGrade recebe grade
                lowGrade = grade;
            } // end if
        } // end for grade

        // retorna lowGrade
        return lowGrade;

    } // end método get nínimo

    // localiza maior valor
    public int getMaximom() {

        // variável
        int highGrade = grades[0]; // supõe que grades[0] é a maior nota

        // loop for pelo array para buscar a menor nota0
        for (int grade : grades) {
            
            // se grade maior que highGrade
            if (grade > highGrade) {
                // highGrade recebe grade
                highGrade = grade;
            } // end if highGrade
        } // end for

        // retorna o maior valor
        return highGrade;
    } // end maior valor

    // método para calcular a média das notas
    public double getAverage() {

        // variável para somar os valores do array
        int total = 0;

        // loop for para somar os valores do array
        for (int grade : grades) {
            
            // soma os valores da grade
            total += grade;
        } // end for

        // retorna o calculo da média das notas
        return (double) total / grades.length;
    } // end getAverage

    // método para gerar a saída em gráfico de barras exibindo a distribuição das notas
    public void outputBarChart() {

        System.out.println("Grade Distribution: ");

        // array para armazenar a frequência das notas
        int[] frequencia = new int[11];

        // loop for para cada nota incrementa a frequência aprpriada
        for (int grade : grades) {
            ++frequencia[grade / 10];
        } // end frequência

    } // end outputBarChart

} // end classe GradBook
