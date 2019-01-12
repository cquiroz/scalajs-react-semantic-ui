package react

import scala.scalajs.js
import js.annotation.JSImport
import js.|
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.VdomNode
import scala.language.reflectiveCalls

package object semanticui {
  type SemanticShortHandItem[T] = VdomNode | T
  type SemanticShortHandContent = VdomNode
  type TabIndex                 = Double | String

  implicit class HandContent2Content(val c: SemanticShortHandContent) extends AnyVal {
    def toRaw: raw.SemanticShorthandContent = c.rawNode
  }

  implicit class ValueOps[A <: { def value: String }](val c: js.UndefOr[A]) extends AnyVal {
    def toJs: js.UndefOr[String] = c.map(_.value)
  }

  implicit class ValueOpsB[A <: { def value: Boolean | String }](val c: js.UndefOr[A])
      extends AnyVal {
    def toJs: js.UndefOr[Boolean | String] = c.map(_.value)
  }

  implicit class HandContent2ContentUndef(val c: js.UndefOr[SemanticShortHandContent])
      extends AnyVal {
    def toRaw: js.UndefOr[raw.SemanticShorthandContent] = c.map(_.rawNode)
  }

  implicit class HandItem2Item[T](val c: SemanticShortHandItem[T]) extends AnyVal {
    def toRaw: raw.SemanticShorthandItem[T] =
      (c: Any) match {
        case o: VdomNode => o.rawNode.asInstanceOf[raw.SemanticShorthandItem[T]]
        case f           => f.asInstanceOf[T]
      }
  }

  implicit class HandItem2ItemUndef[T](val c: js.UndefOr[SemanticShortHandItem[T]]) extends AnyVal {
    def toRaw: js.UndefOr[raw.SemanticShorthandItem[T]] =
      c.map { d =>
        (d: Any) match {
          case o: VdomNode =>
            o.rawNode.asInstanceOf[raw.SemanticShorthandItem[T]]
          case f => f.asInstanceOf[T]
        }
      }
  }

  private[semanticui] object raw {
    type SemanticCOLORS           = String
    type SemanticICONS            = String
    type SemanticSIZES            = String
    type IconSizeProp             = String
    type SemanticFLOATS           = String
    type SemanticTEXTALIGNMENTS   = String
    type SemanticShorthandContent = React.Node
    type SemanticShorthandItem[T] = React.Node | T

    @js.native
    @JSImport("semantic-ui-react", "SemanticCOLORS")
    object SemanticCOLORS extends js.Object
  }
}
