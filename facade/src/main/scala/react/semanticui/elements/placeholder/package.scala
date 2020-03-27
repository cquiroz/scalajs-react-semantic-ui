package react.semanticui.elements

import react.common.EnumValueB

package placeholder {
  sealed trait LoaderInline extends Product with Serializable
  object LoaderInline {
    implicit val enum: EnumValueB[LoaderInline] = EnumValueB.toLowerCaseStringT(Inline)
    case object Inline extends LoaderInline
    case object Centered extends LoaderInline
  }
}

package object placeholder {}
