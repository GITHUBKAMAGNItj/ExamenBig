// question 6
object ExamenBigData {

  // question 7
  def main(args: Array[String]): Unit ={
   println( fonc_val(List("julien","Paul","jean","rac","trec","joel","ed","chris")))
  }

  // question 8
  def fonc_val(liste1: List[String]): List[String] = {
    val liste2 = liste1.filter(s => s.charAt(s.length-1) == 'n')
    liste2
  }
  // question 11 et 12
  val  liste_double = List(List("ecommercemar.fr"," "),List("https://www.journalducm.com/contact/","Payant"),
    List("https://www.zatsaz.com/",""),List("https://www.lerevenu.com",""),
    List("https://www.cadre-dirigfdeant-magazine.com/","payant"),
    List("https://www.silicon.fr/services/contact#annoncer/","Payant"),
    List("https://www.channelbiz.fr/nous-contacter/",""),
    List("https://www.itespresso.fr/",""),
    List("https://www.industrie-mag.com/article4.html","invite"),
    List("https://www.jesuisundev.com/article-invite/","invite"),
    List("https://www.numerama.com/",""))
  liste_double.foreach(l=>{println(l.head+" "+l(1))})

  // question 13

  // question 14

}
