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
  def listaEdades(): Unit = {
    val edades = Array(10, 17, 20, 22, 40)
    edades.apply(3)
    edades.length
  }
}

//Evaluaciones
Persona.saludar("Webexz!")
val resultado = Persona.sumarEnteros(5, 10)
Persona.mostrarSuma(resultado)
Persona.decirDia("r")
