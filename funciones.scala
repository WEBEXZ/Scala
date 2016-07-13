object Persona {
  def saludar(nombre: String): Unit = {
    println("Hola " + nombre)
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
}

//Evaluaciones
Persona.saludar("Webexz!")
val resultado = Persona.sumarEnteros(5, 10)
Persona.mostrarSuma(resultado)
Persona.decirDia("r")
