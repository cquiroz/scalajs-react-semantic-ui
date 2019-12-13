import scala.scalajs.js
import js.annotation._
import js.|

package importedjs {
  @js.native
  trait IconProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native
    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.Any            = js.native
    var bordered: Boolean     = js.native
    var circular: Boolean     = js.native
    var className: String     = js.native
    var color: SemanticCOLORS = js.native
    var corner: Boolean       = js.native
    var disabled: Boolean     = js.native
    var fitted: Boolean       = js.native
    var flipped: String       = js.native
    var inverted: Boolean     = js.native
    var link: Boolean         = js.native
    var loading: Boolean      = js.native
    var name: SemanticICONS   = js.native
    var rotated: String       = js.native
    var size: IconSizeProp    = js.native
  }

  @js.native
  @JSGlobal
  class Icon extends React.Component[IconProps, js.Any] {}

  @js.native
  @JSGlobal
  object Icon extends js.Object {
    var Group: IconGroup.type = js.native
  }
}
