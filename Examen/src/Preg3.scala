@main
  def main3(): Unit = {
  def generadorIncrementador(incremento: Int): Int => Int = {
    def incrementador(x: Int): Int = x + incremento

    incrementador
  }

}


