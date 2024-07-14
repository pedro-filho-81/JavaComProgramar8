package arrays_bidimensionais.nota_dos_alunos;
/*
 * Utilizando array bidimensional para armazenar as notas dos alunos
 */

public class GradeBook {
    
    // variáveis de instância
    private String courseName; // nome do curso que essa classe representa  
    // declara a matriz grades (notas)
    private int[][] grades; // matriz para armazenar as notas dos alunos

    // construtor da classe
    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    } // end construtor

    // método para configurar o nome do curso
    public void setCurseName(String curseName) {
        this.courseName = curseName;
    } // end setCurseName

    // método para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    } // end getCurseName

    // realiza várias operações nos dados
    public void processGrades() {

        // chama método que gera a saída das notas do array
        outputGrades();
        
        // chama os métodos getMinimum Menor valor e getMaximom Maior
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
                getMinimum(), getMaximom());

        // chaMa o outputBarChart para inpriMir gráfico de distribuição de notas
        outputBarChart(); 

    } // end processGrades

    // método para localizar nota mínima
    public int getMinimum() {

        // variável
        int lowGrade = grades[0][0]; // supôe que grades[0] é a menor nota

        // loop for aprimorado pelo array
        for (int[] studentGrade : grades) {

            for(int grade : studentGrade) {
            
                // se grade menor que lowGrade
                if (grade < lowGrade) {
            
                    // lowGrade recebe grade
                    lowGrade = grade;
                } // end if
            
            } // for grade
        } // end for studentGrade
        
        // retorna lowGrade
        return lowGrade;
    } // end método getMnínimo
 
    // localiza maior valor
    public int getMaximom() {

        // variável
        int highGrade = grades[0][0]; // supõe que grades[0] é a maior nota

        for (int[] studentGrade : grades) {
            
            // loop for pelo array para buscar a menor nota0
            for (int grade : studentGrade) {
                
                // se grade maior que highGrade
                if (grade > highGrade) {
                    // highGrade recebe grade
                    highGrade = grade;
                } // end if highGrade
            } // end for
        } // end for studentGrade

        // retorna o maior valor
        return highGrade;

    } // end maior valor

    // método para calcular a média das notas
    public double getAverage(int[] setOfGrades) {

        // variável para somar os valores do array
        int total = 0;

        // loop for para somar os valores do array
        for (int grade : setOfGrades) {
            
            // soma os valores da grade
            total += grade;
        } // end for

        // retorna o calculo da média das notas
        return (double) total / setOfGrades.length;
    } // end getAverage

    // método para gerar a saída em gráfico de barras 
    // exibindo a distribuição das notas
    public void outputBarChart() {

        // cabeçalho
        System.out.println("Grade Distribution: ");

        // array para armazenar a frequência das notas
        int[] frequencia = new int[11];

        for (int[] studentGrade : grades) {
            // loop for para cada nota incrementa a frequência apriada
            for (int grade : studentGrade) {
                ++frequencia[grade / 10];
            } // end frequência
        } // end for studentGrade

        // loop for para cada frenquência de nota, imprime barra no gráfico
        for (int count = 0; count < frequencia.length; count++) {
            
            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100); 
            else
                System.out.printf("%02d-%02d: ", 
                            count * 10, count * 10 + 9); 
            
            // imprime a barra de asteriscos
            for (int stars = 0; stars < frequencia[count]; stars++)
                System.out.print("*");
            
            System.out.println(); 
            
        } // end for
    } // end outputBarChart

    // gera a saída do conteúdo do array de notas
    public void outputGrades()
    { 
        System.out.printf("The grades are:%n%n");
        System.out.print("              ");
        
        // cria um título de coluna para cada um dos testes
        for (int test = 0; test < grades[0].length; test++) 
            System.out.printf(" Test%d  ", test + 1);
    
        System.out.println("  Average"); // título da coluna de média do aluno
        
        // gera a saída da nota de cada aluno 
        for (int student = 0; student < grades.length; student++) {
            
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student])
                // gera saída das notas
                System.out.printf("%8d ", test);

            // chama método getAverage para calcular a média do aluno;
            // passa linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        } // end for
    } // end outputGrades

} // end classe GradBook
