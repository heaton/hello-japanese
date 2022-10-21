package me.heaton

import scala.util.Random

package object jp {

  implicit class ListWrap[A](l: List[A]) {
    def shuffle: List[A] = Random.shuffle(l)
  }

  implicit class ListString[A](s: String) {
    def shuffle: String = Random.shuffle(s).toString()
  }
}
