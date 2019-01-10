package react.semanticui.modules

package sidebar {
  sealed trait SidebarAnimation {
    def value: String
  }

  object SidebarAnimation {
    case object Overlay extends SidebarAnimation {
      val value = "overlay"
    }
    case object Push extends SidebarAnimation {
      val value = "push"
    }
    case object ScaleDown extends SidebarAnimation {
      val value = "scale down"
    }
    case object Uncover extends SidebarAnimation {
      val value = "uncover"
    }
    case object SlideOut extends SidebarAnimation {
      val value = "slide out"
    }
    case object SlideAlong extends SidebarAnimation {
      val value = "slide along"
    }
  }

  sealed trait SidebarDirection {
    def value: String
  }

  object SidebarDirection {
    case object Top extends SidebarDirection {
      val value = "top"
    }
    case object Right extends SidebarDirection {
      val value = "right"
    }
    case object Bottom extends SidebarDirection {
      val value = "bottom"
    }
    case object Left extends SidebarDirection {
      val value = "left"
    }
  }

  sealed trait SidebarWidth {
    def value: String
  }

  object SidebarWidth {
    case object VeryThin extends SidebarWidth {
      val value = "very thin"
    }
    case object Thin extends SidebarWidth {
      val value = "thin"
    }
    case object Wide extends SidebarWidth {
      val value = "wide"
    }
    case object VeryWide extends SidebarWidth {
      val value = "very wide"
    }
  }
}

package object sidebar
