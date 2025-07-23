fun main() {
  // Aquí invocamos cada función para probar:
  val nums = listOf(10, 3, 5, 8, 7)
  println("Promedio = ${calcularPromedio(nums)}")
  println("Impares = ${filtrarImpares(nums)}")
  println("¿'radar' es palindrome? ${isPalindrome("radar")}")
  println("Suma 4+5 = ${performOperation(4, 5) { x, y -> x + y }}")
  val nombres = listOf("Alicia", "Pedro")
  println(saludarNombres(nombres))
  val persona = Person("María", 21, "F")
  val estudiante = mapPersonToStudent(persona, "S1234")
  println("El Estudiante ${estudiante.name} tiene ${estudiante.age} años")
}