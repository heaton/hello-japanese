package me.heaton.jp

import scala.collection.immutable.Queue

object Main extends App with Syllabary {
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

  val hiraganas = hiragana.keys.toList.shuffle
  f(Queue.from(hiraganas.take(10)), hiraganas.drop(10))
}
