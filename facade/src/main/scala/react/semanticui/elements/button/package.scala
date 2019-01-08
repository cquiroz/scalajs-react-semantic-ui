package react.semanticui.elements

import scala.scalajs.js.|

package button {
  sealed trait ButtonAnimated {
    def value: Boolean | String
  }

  object ButtonAnimated {
    case object Animated extends ButtonAnimated {
      val value = true
    }
    case object Fade extends ButtonAnimated {
      val value = "fade"
    }
    case object Vertical extends ButtonAnimated {
      val value = "vertical"
    }
  }

  sealed trait ButtonAttached {
    def value: Boolean | String
  }

  object ButtonAttached {
    case object Attached extends ButtonAttached {
      val value = true
    }
    case object Top extends ButtonAttached {
      val value = "top"
    }
    case object Bottom extends ButtonAttached {
      val value = "bottom"
    }
    case object Right extends ButtonAttached {
      val value = "right"
    }
    case object Left extends ButtonAttached {
      val value = "left"
    }
  }

}

package object button
