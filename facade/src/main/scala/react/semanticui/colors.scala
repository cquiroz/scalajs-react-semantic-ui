package react.semanticui

package colors {
  trait SemanticColors {
    sealed trait SemanticColor {
      val value: String
    }
    case object Red extends SemanticColor {
      val value = "red"
    }
    case object Orange extends SemanticColor {
      val value = "orange"
    }
    case object Yellow extends SemanticColor {
      val value = "yellow"
    }
    case object Olive extends SemanticColor {
      val value = "olive"
    }
    case object Green extends SemanticColor {
      val value = "green"
    }
    case object Teal extends SemanticColor {
      val value = "teal"
    }
    case object Blue extends SemanticColor {
      val value = "blue"
    }
    case object Violet extends SemanticColor {
      val value = "violet"
    }
    case object Purple extends SemanticColor {
      val value = "purple"
    }
    case object Pink extends SemanticColor {
      val value = "pink"
    }
    case object Brown extends SemanticColor {
      val value = "brown"
    }
    case object Grey extends SemanticColor {
      val value = "grey"
    }
    case object Black extends SemanticColor {
      val value = "black"
    }
  }
}

package object colors extends colors.SemanticColors {
  val all: List[SemanticColor] =
    List(Red, Orange, Yellow, Olive, Green, Teal, Blue, Violet, Purple, Pink, Brown, Grey, Black)
}
