@main

  def main2(): Unit = {
    val precios = List[Double](10, 20, 30, 40)
    def funcion(precios: List[Double],regla:Double=> Double):List[Double]={
      precios.map(regla)
    }
    def iva(cant:Double):Double=cant*(15/100)

    println(funcion(precios,iva))
  }


