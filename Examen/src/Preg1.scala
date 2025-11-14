
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@main
def main(): Unit = {
    def metodo(datos:List[Double]):Double= {

      val Logs: List[Double] = datos.map(Math.log)
      val sumaLogs: Double=Logs.sum
      val promadioLogs:Double= sumaLogs/Logs.size
      val caudrados=Logs.map(log=>(log-promadioLogs)*(log-promadioLogs)).sum
      math.sqrt(caudrados/Logs.size)
      
    }
  }


