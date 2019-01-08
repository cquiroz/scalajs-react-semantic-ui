package react.semanticui

package sizes {
  sealed trait SemanticSize {
    val value: String
  }
  object SemanticSize
}

package object sizes {
  case object Mini extends SemanticSize {
    val value = "mini"
  }
  case object Tiny extends SemanticSize {
    val value = "tiny"
  }
  case object Small extends SemanticSize {
    val value = "small"
  }
  case object Medium extends SemanticSize {
    val value = "medium"
  }
  case object Large extends SemanticSize {
    val value = "large"
  }
  case object Big extends SemanticSize {
    val value = "big"
  }
  case object Huge extends SemanticSize {
    val value = "huge"
  }
  case object Massive extends SemanticSize {
    val value = "massive"
  }

  val all: List[SemanticSize] = List(Mini, Tiny, Small, Medium, Large, Big, Huge, Massive)
}
