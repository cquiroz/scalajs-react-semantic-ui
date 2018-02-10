package react

import scala.scalajs.js
import js.annotation.JSImport

package object semanticui {
  type SemanticCOLORS = String
  type SemanticICONS = String
  type IconSizeProp = String

  private[semanticui] object raw {
    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
