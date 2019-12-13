import scala.scalajs.js
import js.annotation._
import js.|

package importedjs {
  @js.native
  trait IconGroupProps extends js.Object {
    @JSBracketAccess
    def apply(key: String): js.Any = js.native
    @JSBracketAccess
    def update(key: String, v: js.Any): Unit = js.native
    var as: js.Any                        = js.native
    var children: React.ReactNode         = js.native
    var className: String                 = js.native
    var content: SemanticShorthandContent = js.native
    var size: IconSizeProp                = js.native
  }

  @js.native
  @JSGlobalScope
  object Importedjs extends js.Object {
    val IconGroup: React.StatelessComponent[IconGroupProps] = js.native
  }
}
