object Persona {
  def saludar(nombre: String): Unit = {
    println(s"Hola ${nombre}")
  }
  def mostrarSuma(x: Int): Unit = {
    println(x)
  }
  def sumarEnteros(x: Int, y: Int): Int = {
    x + y
  }
  def decirDia(d: String): Unit = {
    println(d match {
      case "l" => "Lunes"
      case "m" => "Martes"
      case "mi" => "Miercoles"
      case "j" => "Jueves"
      case "v" => "Viernes"
      case "s" => "Sabado"
      case "d" => "Domingo"
      case _ => "No existe"
    })
  }
  def cuadrado(x: Int): Int = x * x
  def listaNumeros(): Unit = {
    val numeros = List(10, 17, 20, 22, 40)
    val edades = List(List(10, 11, 12), List(13, 14, 15), List(16, 17, 18))
    numeros.apply(3)
    numeros.length
    println(edades.flatten)
    println(numeros.map { x => cuadrado(x)})
  }
}

//Evaluaciones
Persona.saludar("Webexz!")
val resultado = Persona.sumarEnteros(5, 10)
Persona.mostrarSuma(resultado)
Persona.decirDia("r")
