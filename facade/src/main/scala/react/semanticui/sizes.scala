package react.semanticui

trait SemanticSizes {
  sealed trait SemanticSize {
    val name: String
  }
  case object Mini extends SemanticSize {
    val name = "mini"
  }
  case object Tiny extends SemanticSize {
    val name = "tiny"
  }
  case object Small extends SemanticSize {
    val name = "small"
  }
  case object Medium extends SemanticSize {
    val name = "medium"
  }
  case object Large extends SemanticSize {
    val name = "large"
  }
  case object Big extends SemanticSize {
    val name = "big"
  }
  case object Huge extends SemanticSize {
    val name = "huge"
  }
  case object Massive extends SemanticSize {
    val name = "massive"
  }
}

package object sizes extends SemanticSizes {
  val all: List[SemanticSize] = List(Mini, Tiny, Small, Medium, Large, Big, Huge, Massive)
}
