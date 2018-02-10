package react.semanticui

sealed trait SemanticColor {
  val name: String
}
case object Red extends SemanticColor {
  val name = "red"
}
case object Orange extends SemanticColor {
  val name = "orange"
}
case object Yellow extends SemanticColor {
  val name = "yellow"
}
case object Olive extends SemanticColor {
  val name = "olive"
}
case object Green extends SemanticColor {
  val name = "green"
}
case object Teal extends SemanticColor {
  val name = "teal"
}
case object Blue extends SemanticColor {
  val name = "blue"
}
case object Violet extends SemanticColor {
  val name = "violet"
}
case object Purple extends SemanticColor {
  val name = "purple"
}
case object Pink extends SemanticColor {
  val name = "pink"
}
case object Brown extends SemanticColor {
  val name = "brown"
}
case object Grey extends SemanticColor {
  val name = "grey"
}
case object Black extends SemanticColor {
  val name = "black"
}
