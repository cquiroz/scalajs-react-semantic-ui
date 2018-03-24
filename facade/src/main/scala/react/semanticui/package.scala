package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import japgolly.scalajs.react.raw.ReactNode
import japgolly.scalajs.react.vdom.VdomNode

package object semanticui {
  type SemanticShortHandItem[T] = VdomNode | T

  private[semanticui] object raw {
    type SemanticCOLORS = String
    type SemanticICONS = String
    type SemanticSIZES = String
    type IconSizeProp = String
    type SemanticFLOATS = String
    type SemanticShorthandContent = ReactNode;
    type SemanticShorthandItem[T] = ReactNode | T

    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
