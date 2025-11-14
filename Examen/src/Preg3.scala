
object Preg3 {
  def main(): Unit = {
    val generadorIncrementadorAnonimo: Int => (Int => Int) =
      (incremento: Int) =>(x: Int) => x + incremento

    def generadorIncrementador(Incremento:Int ,x:Int):Int=x+Incremento
  }
}

