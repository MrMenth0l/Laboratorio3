// Funciones de la práctica
fun calcularPromedio(numeros: List<Int>): Double =
    if (numeros.isEmpty()) 0.0
    else numeros.reduce { acc, i -> acc + i }.toDouble() / numeros.size
fun filtrarImpares(numeros: List<Int>): List<Int> =
    numeros.filter { it % 2 != 0 }
fun isPalindrome(s: String): Boolean =
    s == s.reversed()
fun performOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int =
    op(a, b)
fun saludarNombres(nombres: List<String>): List<String> =
    nombres.map { "¡Hola, $it!" }
fun mapPersonToStudent(p: Person, studentId: String): Student {
    val student = Student(p.name, p.age, p.gender, studentId)
    println("El Estudiante ${student.name} tiene ${student.age} años")
    return student
}