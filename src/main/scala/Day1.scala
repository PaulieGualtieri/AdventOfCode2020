object Day1 {

  def task1(seq: Seq[Int], v: Int): Option[Int] = {
    val zippedWithIndex = seq.zipWithIndex
    (for {
      a <- zippedWithIndex
      b <- zippedWithIndex if a._1 + b._1 == v && a._2 != b._2
    } yield a._1 * b._1).headOption
  }


  def main(args: Array[String]): Unit = {
    val elems = Seq(1020,979,366,299,675,1456)
    println(task1(elems, 2020))
  }


}