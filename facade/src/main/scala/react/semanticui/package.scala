package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import japgolly.scalajs.react.raw.ReactNode

package object semanticui {
  type SemanticCOLORS = String
  type SemanticICONS = String
  type SemanticSIZES = String
  type IconSizeProp = String
  type SemanticFLOATS = String
  type SemanticShorthandContent = ReactNode;
  type SemanticShorthandItem[T] = ReactNode | T;

  private[semanticui] object raw {
    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
