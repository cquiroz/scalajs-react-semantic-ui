package react.semanticui.collections

import react.common.EnumValue
import react.common.EnumValueB

package table {
  sealed trait TableTextAlign
  object TableTextAlign {
    implicit val enum: EnumValue[TableTextAlign] = EnumValue.toLowerCaseString
    case object Center extends TableTextAlign
    case object Left   extends TableTextAlign
    case object Right  extends TableTextAlign
  }

  sealed trait TableSorted
  object TableSorted {
    implicit val enum: EnumValue[TableSorted] = EnumValue.toLowerCaseString
    case object Ascending  extends TableSorted
    case object Descending extends TableSorted
  }

  sealed trait TableAttached
  object TableAttached {
    implicit val enum: EnumValueB[TableAttached] =
      EnumValueB.toLowerCaseStringTF(Attached, NotAttached)
    case object Attached    extends TableAttached
    case object NotAttached extends TableAttached
    case object Top         extends TableAttached
    case object Bottom      extends TableAttached
  }

  sealed trait TableBasic
  object TableBasic {
    implicit val enum: EnumValueB[TableBasic] = EnumValueB.toLowerCaseStringTF(Basic, NotBasic)
    case object Basic    extends TableBasic
    case object NotBasic extends TableBasic
    case object Very     extends TableBasic
  }

  sealed trait TableCelled
  object TableCelled {
    implicit val enum: EnumValueB[TableCelled] = EnumValueB.toLowerCaseStringTF(Celled, NotCelled)
    case object Celled     extends TableCelled
    case object NotCelled  extends TableCelled
    case object Internally extends TableCelled
  }

  sealed trait TableCompact
  object TableCompact {
    implicit val enum: EnumValueB[TableCompact] =
      EnumValueB.toLowerCaseStringTF(Compact, NotCompact)
    case object Compact    extends TableCompact
    case object NotCompact extends TableCompact
    case object Very       extends TableCompact
  }

  sealed trait TablePadded
  object TablePadded {
    implicit val enum: EnumValueB[TablePadded] = EnumValueB.toLowerCaseStringTF(Padded, NotPadded)
    case object Padded    extends TablePadded
    case object NotPadded extends TablePadded
    case object Very      extends TablePadded
  }

  sealed trait TableSize
  object TableSize {
    implicit val enum: EnumValue[TableSize] = EnumValue.toLowerCaseString
    case object Small extends TableSize
    case object Large extends TableSize
  }
}
