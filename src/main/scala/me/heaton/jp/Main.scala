package me.heaton.jp

import scala.collection.immutable.Queue
import scala.util.Random

object Main extends App with Syllabary with Learning {
  def f(next10: Queue[String], rest: List[String], answered: Set[String] = Set()): Unit = {
    next10 match {
      case c +: tail =>
        val i = io.StdIn.readLine(s"$c: ")
        val answer = hiragana(c)
        val (re, ri) = if (i != answer) {
          println(s"$i is wrong, should be $answer")
          ((c :: rest).shuffle, answered - c)
        } else if (answered contains c) {
          (rest, answered - c)
        } else {
          ((c :: rest).shuffle, answered + c)
        }
        if (re.isEmpty)
          f(tail, re, ri)
        else
          f(tail.appended(re.head), re.tail, ri)
      case _ =>
    }
  }

  val excludes = learned.shuffle.drop(10)
  val practising = hiragana.keys.toList.filterNot(excludes.contains).shuffle
  val start = System.currentTimeMillis()
  f(Queue.from(practising.take(10)), practising.drop(10))
  println(s"total time: ${(System.currentTimeMillis() - start) / 1000}s")
}
