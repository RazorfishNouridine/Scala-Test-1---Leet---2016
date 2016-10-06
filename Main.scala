package com.razorfish.leet

object Leet {
  trait Leetable[T] {
    def toLeet(in: T): String
  }
  def apply[T](in: T)(implicit leetable: Leetable[T]): String =
    leetable.toLeet(in)
}

object Main {
  def main(args: Array[String]): Unit = {
    // add your implementation below this line
    implicit val myLeetable = new Leet.Leetable[String] {def toLeet(in: String) = in}

    val temp = Leet.apply(myLeetable.toLeet)
    
    val aRep = temp.replaceAll("aA", "4")
    val eRep = aRep.replaceAll("eE", "3")
    val iRep = eRep.replaceAll("iI", "1")
    val oRep = iRep.replaceAll("oO", "0")
    val sRep = oRep.replaceAll("sS", "5")
    val tRep = sRep.replaceAll("tT", "7") 
  }
}

