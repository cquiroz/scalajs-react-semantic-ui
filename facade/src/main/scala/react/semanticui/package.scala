package react

import scala.scalajs.js
import js.annotation.JSImport

package object semanticui {
  private[semanticui] object raw {
    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
