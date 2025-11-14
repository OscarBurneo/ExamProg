@main
def main2(): Unit = {

  // Lista de precios original
  val precios = List[Double](10, 20, 30, 40)

  // Función de orden superior: recibe la lista y la regla de ajuste
  def ajustarPrecios(precios: List[Double], regla: Double => Double): List[Double] = {
    precios.map(regla)
  }

  // Distintas reglas de ajuste
  def agregarIVA(p: Double): Double = p * 1.12       // IVA del 12%
  def descuento10(p: Double): Double = p * 0.90      // 10% de descuento
  def aumentarTemporada(p: Double): Double = p + 5   // Estrategia de aumento fijo

  // Aplicación de la estrategia elegida
  val preciosConIVA = ajustarPrecios(precios, agregarIVA)
  val preciosConDescuento = ajustarPrecios(precios, descuento10)
  val preciosAumentados = ajustarPrecios(precios, aumentarTemporada)

  println("Precios con IVA: " + preciosConIVA)
  println("Precios con descuento: " + preciosConDescuento)
  println("Precios aumentados: " + preciosAumentados)
}
