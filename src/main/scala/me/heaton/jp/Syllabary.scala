package me.heaton.jp

trait Syllabary {

  // ひらがな
  val hiragana = Map(
    "あ" -> "a", "い" -> "i", "う" -> "u", "え" -> "e", "お" -> "o",
    "か" -> "ka", "き" -> "ki", "く" -> "ku", "け" -> "ke", "こ" -> "ko",
    "さ" -> "sa", "し" -> "shi", "す" -> "su", "せ" -> "se", "そ" -> "so",
    "た" -> "ta", "ち" -> "chi", "つ" -> "tsu", "て" -> "te", "と" -> "to"
  )

  // カタカナ
  val katakana = Map()

  val words = Map()
}
