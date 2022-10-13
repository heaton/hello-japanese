package me.heaton

import scala.util.Random

package object jp {

  implicit class ListWrap[A](l: List[A]) {
    def shuffle: List[A] = Random.shuffle(l)
  }
}
