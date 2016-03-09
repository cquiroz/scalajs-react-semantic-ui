package scalajs.semanticui.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajs.semanticui.elements.icon.Icon
import scalajs.semanticui.common._
import scala.scalajs.js
import scalajs.semanticui.elements.icon.Icon.{Clockwise, CounterClockwise, Horizontally, Vertically}

object IconsExample {

  case class Props(icons: List[(String, String)], title: String, description: String)

  def component = ReactComponentB[Props]("IconsPage")
    .stateless
    .render_P(p =>
      <.div(
        ^.cls := "icon example",
        <.h4(
          ^.cls := "ui header",
          p.title),
        <.p(p.description),
        <.div(
          ^.cls := "ui doubling five column grid",
          p.icons.map { case (i, n) =>
            <.div(
              ^.cls := "column",
              Icon(i),
              n
            )
          }
        ),
        <.div(
          ^.cls := "existing code",
          p.icons.map { case (i, n) =>
            <.i(
              ^.cls := s"$i icon"
            )
          }
        )
      )
    )
    .build

  def apply(p: Props) = component(p)
}

object IconSets {

  val webContentIcons = List(
    "alarm"               -> "Alarm",
    "alarm slash"         -> "Alarm Slash",
    "alarm outline"       -> "Alarm Outline",
    "alarm slash outline" -> "Alarm Slash Outline",
    "at"                  -> "At",
    "browser"             -> "Browser",
    "bug"                 -> "Bug",
    "calendar outline"    -> "Calendar Outline",
    "calendar"            -> "Calendar",
    "cloud"               -> "Cloud",
    "code"                -> "Code",
    "comment"             -> "Comment",
    "comments"            -> "Comments",
    "comment outline"     -> "Comment Outline",
    "comments outline"    -> "Comments Outline",
    "copyright"           -> "Copyright",
    "dashboard"           -> "Dashboard",
    "dropdown"            -> "Dropdown",
    "external square"     -> "External Square",
    "external"            -> "External",
    "eyedropper"          -> "Eyedropper",
    "feed"                -> "Feed",
    "find"                -> "Find",
    "heartbeat"           -> "Heartbeat",
    "history"             -> "History",
    "home"                -> "Home",
    "idea"                -> "Idea",
    "inbox"               -> "Inbox",
    "lab"                 -> "Lab",
    "mail"                -> "Mail",
    "mail outline"        -> "Mail Outline",
    "mail square"         -> "Mail Square",
    "map"                 -> "Map",
    "options"             -> "Options",
    "paint brush"         -> "Paint Brush",
    "payment"             -> "Payment",
    "phone"               -> "Phone",
    "phone square"        -> "Phone Square",
    "privacy"             -> "Privacy",
    "protect"             -> "Protect",
    "search"              -> "Search",
    "setting"             -> "Setting",
    "settings"            -> "Settings",
    "shop"                -> "Shop",
    "sidebar"             -> "Sidebar",
    "signal"              -> "Signal",
    "sitemap"             -> "Sitemap",
    "tag"                 -> "Tag",
    "tags"                -> "Tags",
    "tasks"               -> "Tasks",
    "terminal"            -> "Terminal",
    "text telephone"      -> "Text Telephone",
    "ticket"              -> "Ticket",
    "trophy"              -> "Trophy",
    "wifi"                -> "Wifi"
  )
  val userActionsIcons = List(
    "adjust"                  -> "Adjust",
    "add user"                -> "Add User",
    "add to cart"             -> "Add to cart",
    "archive"                 -> "Archive",
    "ban"                     -> "Ban",
    "bookmark"                -> "Bookmark",
    "call"                    -> "Call",
    "call square"             -> "Call Square",
    "cloud download"          -> "Cloud Download",
    "cloud upload"            -> "Cloud Upload",
    "compress"                -> "Compress",
    "configure"               -> "Configure",
    "download"                -> "Download",
    "edit"                    -> "Edit",
    "erase"                   -> "Erase",
    "exchange"                -> "Exchange",
    "external share"          -> "External Share",
    "expand"                  -> "Expand",
    "filter"                  -> "Filter",
    "flag"                    -> "Flag",
    "flag outline"            -> "Flag Outline",
    "forward mail"            -> "Forward Mail",
    "hide"                    -> "Hide",
    "in cart"                 -> "In Cart",
    "lock"                    -> "Lock",
    "pin"                     -> "Pin",
    "print"                   -> "Print",
    "random"                  -> "Random",
    "recycle"                 -> "Recycle",
    "refresh"                 -> "Refresh",
    "remove bookmark"         -> "Remove Bookmark",
    "remove user"             -> "Remove User",
    "repeat"                  -> "Repeat",
    "reply all"               -> "Reply All",
    "reply"                   -> "Reply",
    "retweet"                 -> "Retweet",
    "send"                    -> "Send",
    "send outline"            -> "Send Outline",
    "share alternate"         -> "Share Alternate",
    "share alternate square"  -> "Share Alternate Square",
    "share"                   -> "Share",
    "share square"            -> "Share Square",
    "sign in"                 -> "Sign in",
    "sign out"                -> "Sign out",
    "theme"                   -> "Theme",
    "translate"               -> "Translate",
    "undo"                    -> "Undo",
    "unhide"                  -> "Unhide",
    "unlock alternate"        -> "Unlock Alternate",
    "unlock"                  -> "Unlock",
    "upload"                  -> "Upload",
    "wait"                    -> "Wait",
    "wizard"                  -> "Wizard",
    "write"                   -> "Write",
    "write square"            -> "Write Square"
  )
  val messageIcons = List(
    "announcement" -> "Announcement",
    "birthday" -> "Birthday",
    "flag" -> "Flag",
    "help" -> "Help",
    "help circle" -> "Help Circle",
    "info" -> "Info",
    "info circle" -> "Info Circle",
    "warning" -> "Warning",
    "warning circle" -> "Warning Circle",
    "warning sign" -> "Warning Sign"
  )

  val userTypesIcons = List(
    "child"     -> "Child",
    "doctor"    -> "Doctor",
    "handicap"  -> "Handicap",
    "spy"       -> "Spy",
    "student"   -> "Student",
    "user"      -> "User",
    "users"     -> "Users"
  )

  val genderSexualityIcons = List(
    "female"                  -> "Female",
    "gay"                     -> "Gay",
    "heterosexual"            -> "Heterosexual",
    "intergender"             -> "Intergender",
    "lesbian"                 -> "Lesbian",
    "male"                    -> "Male",
    "man"                     -> "Man",
    "neuter"                  -> "Neuter",
    "non binary transgender"  -> "Non Binary Transgender",
    "transgender"             -> "Transgender",
    "other gender"            -> "Other Gender",
    "other gender horizontal" -> "Other Gender Horizontal",
    "other gender vertical"   -> "Other Gender Vertical",
    "woman"                   -> "Woman"
  )

  val layoutIcons = List(
    "grid layout"       -> "Grid Layout",
    "list layout"       -> "List Layout",
    "block layout"      -> "Block Layout",
    "zoom"              -> "Zoom",
    "zoom out"          -> "Zoom Out",
    "resize vertical"   -> "Resize Vertical",
    "resize horizontal" -> "Resize Horizontal",
    "maximize"          -> "Maximize",
    "crop"              -> "Crop"
  )

  val objectsIcons = List(
    "anchor"            -> "Anchor",
    "bar"               -> "Bar",
    "bomb"              -> "Bomb",
    "book"              -> "Book",
    "bullseye"          -> "Bullseye",
    "calculator"        -> "Calculator",
    "checkered flag"    -> "Checkered Flag",
    "cocktail"          -> "Cocktail",
    "diamond"           -> "Diamond",
    "fax"               -> "Fax",
    "fire extinguisher" -> "Fire Extinguisher",
    "fire"              -> "Fire",
    "gift"              -> "Gift",
    "leaf"              -> "Leaf",
    "legal"             -> "Legal",
    "lemon"             -> "Lemon",
    "life ring"         -> "Life Ring",
    "lightning"         -> "Lightning",
    "magnet"            -> "Magnet",
    "money"             -> "Money",
    "moon"              -> "Moon",
    "plane"             -> "Plane",
    "puzzle"            -> "Puzzle",
    "rain"              -> "Rain",
    "road"              -> "Road",
    "rocket"            -> "Rocket",
    "shipping"          -> "Shipping",
    "soccer"            -> "Soccer",
    "suitcase"          -> "Suitcase",
    "sun"               -> "Sun",
    "travel"            -> "Travel",
    "treatment"         -> "Treatment",
    "world"             -> "World"
  )

  val shapesIcons = List(
    "asterisk"            -> "Asterisk",
    "certificate"         -> "Certificate",
    "circle"              -> "Circle",
    "circle notched"      -> "Circle Notched",
    "circle thin"         -> "Circle Thin",
    "crosshairs"          -> "Crosshairs",
    "cube"                -> "Cube",
    "cubes"               -> "Cubes",
    "ellipsis horizontal" -> "Ellipsis Horizontal",
    "ellipsis vertical"   -> "Ellipsis Vertical",
    "quote left"          -> "Quote Left",
    "quote right"         -> "Quote Right",
    "spinner"             -> "Spinner",
    "square"              -> "Square",
    "square outline"      -> "Square Outline"
  )

  val selectionIcons = List(
    "add circle"            -> "Add Circle",
    "add square"            -> "Add Square",
    "check circle"          -> "Check Circle",
    "check circle outline"  -> "Check Circle Outline",
    "check square"          -> "Check Square",
    "checkmark box"         -> "Checkmark Box",
    "checkmark"             -> "Checkmark",
    "minus circle"          -> "Minus Circle",
    "minus"                 -> "Minus",
    "minus square"          -> "Minus Square",
    "minus square outline"  -> "Minus Square Outline",
    "move"                  -> "Move",
    "plus"                  -> "Plus",
    "plus square outline"   -> "Plus Square Outline",
    "radio"                 -> "Radio",
    "remove circle"         -> "Remove Circle",
    "remove circle outline" -> "Remove Circle Outline",
    "remove"                -> "Remove",
    "selected radio"        -> "Selected Radio",
    "toggle off"            -> "Toggle Off",
    "toggle on"             -> "Toggle On"
  )

  val mediaIcons = List(
    "area chart"   -> "Area Chart",
    "bar chart"    -> "Bar Chart",
    "camera retro" -> "Camera Retro",
    "newspaper"    -> "Newspaper",
    "film"         -> "Film",
    "line chart"   -> "Line Chart",
    "photo"        -> "Photo",
    "pie chart"    -> "Pie Chart",
    "sound"        -> "Sound"
  )

  val pointersIcons = List(
    "angle double down"           -> "Angle Double Down",
    "angle double left"           -> "Angle Double Left",
    "angle double right"          -> "Angle Double Right",
    "angle double up"             -> "Angle Double Up",
    "angle down"                  -> "Angle Down",
    "angle left"                  -> "Angle Left",
    "angle right"                 -> "Angle Right",
    "angle up"                    -> "Angle Up",
    "arrow circle down"           -> "Arrow Circle Down",
    "arrow circle left"           -> "Arrow Circle Left",
    "arrow circle outline down"   -> "Arrow Circle Outline Down",
    "arrow circle outline left"   -> "Arrow Circle Outline Left",
    "arrow circle outline right"  -> "Arrow Circle Outline Right",
    "arrow circle outline up"     -> "Arrow Circle Outline Up",
    "arrow circle right"          -> "Arrow Circle Right",
    "arrow circle up"             -> "Arrow Circle Up",
    "arrow down"                  -> "Arrow Down",
    "arrow left"                  -> "Arrow Left",
    "arrow right"                 -> "Arrow Right",
    "arrow up"                    -> "Arrow Up",
    "caret down"                  -> "Caret Down",
    "caret left"                  -> "Caret Left",
    "caret right"                 -> "Caret Right",
    "caret up"                    -> "Caret Up",
    "chevron circle down"         -> "Chevron Circle Down",
    "chevron circle left"         -> "Chevron Circle Left",
    "chevron circle right"        -> "Chevron Circle Right",
    "chevron circle up"           -> "Chevron Circle Up",
    "chevron down"                -> "Chevron Down",
    "chevron left"                -> "Chevron Left",
    "chevron right"               -> "Chevron Right",
    "chevron up"                  -> "Chevron Up",
    "long arrow down"             -> "Long Arrow Down",
    "long arrow left"             -> "Long Arrow Left",
    "long arrow right"            -> "Long Arrow Right",
    "long arrow up"               -> "Long Arrow Up",
    "pointing down"               -> "Pointing Down",
    "pointing left"               -> "Pointing Left",
    "pointing right"              -> "Pointing Right",
    "pointing up"                 -> "Pointing Up",
    "toggle down"                 -> "Toggle Down",
    "toggle left"                 -> "Toggle Left",
    "toggle right"                -> "Toggle Right",
    "toggle up"                   -> "Toggle Up"
  )

  val computersFSIcons = List(
    "desktop"                 -> "Desktop",
    "disk outline"            -> "Disk Outline",
    "file archive outline"    -> "File Archive Outline",
    "file audio outline"      -> "File Audio Outline",
    "file code outline"       -> "File Code Outline",
    "file excel outline"      -> "File Excel Outline",
    "file"                    -> "File",
    "file image outline"      -> "File Image Outline",
    "file outline"            -> "File Outline",
    "file pdf outline"        -> "File Pdf Outline",
    "file powerpoint outline" -> "File Powerpoint Outline",
    "file text"               -> "File Text",
    "file text outline"       -> "File Text Outline",
    "file video outline"      -> "File Video Outline",
    "file word outline"       -> "File Word Outline",
    "folder"                  -> "Folder",
    "folder open"             -> "Folder Open",
    "folder open outline"     -> "Folder Open Outline",
    "folder outline"          -> "Folder Outline",
    "game"                    -> "Game",
    "keyboard"                -> "Keyboard",
    "laptop"                  -> "Laptop",
    "level down"              -> "Level Down",
    "level up"                -> "Level Up",
    "mobile"                  -> "Mobile",
    "power"                   -> "Power",
    "plug"                    -> "Plug",
    "tablet"                  -> "Tablet",
    "trash"                   -> "Trash",
    "trash outline"           -> "Trash Outline"
  )
  val technologiesIcons = List(
    "barcode"    -> "Barcode",
    "css3"       -> "Css3",
    "database"   -> "Database",
    "fork"       -> "Fork",
    "html5"      -> "Html5",
    "openid"     -> "Openid",
    "qrcode"     -> "Qrcode",
    "rss"        -> "RSS",
    "rss square" -> "RSS Square",
    "server"     -> "Server"
  )

  val ratingIcons = List(
    "empty heart"         -> "Empty Heart",
    "empty star"          -> "Empty Star",
    "frown"               -> "Frown",
    "heart"               -> "Heart",
    "meh"                 -> "Meh",
    "smile"               -> "Smile",
    "star half empty"     -> "Star Half Empty",
    "star half"           -> "Star Half",
    "star"                -> "Star",
    "thumbs down"         -> "Thumbs Down",
    "thumbs outline down" -> "Thumbs Outline Down",
    "thumbs outline up"   -> "Thumbs Outline Up",
    "thumbs up"           -> "Thumbs Up"
  )

  val audioIcons = List(
    "backward"            -> "Backward",
    "eject"               -> "Eject",
    "fast backward"       -> "Fast Backward",
    "fast forward"        -> "Fast Forward",
    "forward"             -> "Forward",
    "music"               -> "Music",
    "mute"                -> "Mute",
    "pause"               -> "Pause",
    "play"                -> "Play",
    "record"              -> "Record",
    "step backward"       -> "Step Backward",
    "step forward"        -> "Step Forward",
    "stop"                -> "Stop",
    "unmute"              -> "Unmute",
    "video play"          -> "Video Play",
    "video play outline"  -> "Video Play Outline",
    "volume down"         -> "Volume Down",
    "volume off"          -> "Volume Off",
    "volume up"           -> "Volume Up"
  )
  val mapIcons = List(
    "building"          -> "Building",
    "building outline"  -> "Building Outline",
    "car"               -> "Car",
    "coffee"            -> "Coffee",
    "emergency"         -> "Emergency",
    "first aid"         -> "First Aid",
    "food"              -> "Food",
    "h"                 -> "H",
    "hospital"          -> "Hospital",
    "location arrow"    -> "Location Arrow",
    "marker"            -> "Marker",
    "military"          -> "Military",
    "paw"               -> "Paw",
    "space shuttle"     -> "Space Shuttle",
    "spoon"             -> "Spoon",
    "taxi"              -> "Taxi",
    "tree"              -> "Tree",
    "university"        -> "University"
  )

  val tablesIcons = List(
    "columns"                  -> "Columns",
    "sort alphabet ascending"  -> "Sort Alphabet Ascending",
    "sort alphabet descending" -> "Sort Alphabet Descending",
    "sort ascending"           -> "Sort Ascending",
    "sort content ascending"   -> "Sort Content Ascending",
    "sort content descending"  -> "Sort Content Descending",
    "sort descending"          -> "Sort Descending",
    "sort"                     -> "Sort",
    "sort numeric ascending"   -> "Sort Numeric Ascending",
    "sort numeric descending"  -> "Sort Numeric Descending",
    "table"                    -> "Table"
  )

  val textEditorIcons = List(
    "align center"    -> "Align Center",
    "align justify"   -> "Align Justify",
    "align left"      -> "Align Left",
    "align right"     -> "Align Right",
    "attach"          -> "Attach",
    "bold"            -> "Bold",
    "copy"            -> "Copy",
    "cut"             -> "Cut",
    "font"            -> "Font",
    "header"          -> "Header",
    "indent"          -> "Indent",
    "italic"          -> "Italic",
    "linkify"         -> "Linkify",
    "list"            -> "List",
    "ordered list"    -> "Ordered List",
    "outdent"         -> "Outdent",
    "paragraph"       -> "Paragraph",
    "paste"           -> "Paste",
    "save"            -> "Save",
    "strikethrough"   -> "Strikethrough",
    "subscript"       -> "Subscript",
    "superscript"     -> "Superscript",
    "text height"     -> "Text Height",
    "text width"      -> "Text Width",
    "underline"       -> "Underline",
    "unlink"          -> "Unlink",
    "unordered list"  -> "Unordered List"
  )

  val currencyIcons = List(
    "dollar" -> "Dollar",
    "euro"   -> "Euro",
    "lira"   -> "Lira",
    "pound"  -> "Pound",
    "ruble"  -> "Ruble",
    "rupee"  -> "Rupee",
    "shekel" -> "Shekel",
    "won"    -> "Won",
    "yen"    -> "Yen"
  )

  val paymentIcons = List(
    "american express" -> "American Express",
    "discover"         -> "Discover",
    "google wallet"    -> "Google Wallet",
    "mastercard"       -> "Mastercard",
    "paypal card"      -> "Paypal Card",
    "paypal"           -> "Paypal",
    "stripe"           -> "Stripe",
    "visa"             -> "Visa"
  )

  val brandsIcons = List(
    "adn"                   -> "Adn",
    "android"               -> "Android",
    "angellist"             -> "Angellist",
    "apple"                 -> "Apple",
    "behance"               -> "Behance",
    "behance square"        -> "Behance Square",
    "bitbucket"             -> "Bitbucket",
    "bitbucket square"      -> "Bitbucket Square",
    "bitcoin"               -> "Bitcoin",
    "buysellads"            -> "Buysellads",
    "codepen"               -> "Codepen",
    "connectdevelop"        -> "Connectdevelop",
    "dashcube"              -> "Dashcube",
    "delicious"             -> "Delicious",
    "deviantart"            -> "Deviantart",
    "digg"                  -> "Digg",
    "dribbble"              -> "Dribbble",
    "dropbox"               -> "Dropbox",
    "drupal"                -> "Drupal",
    "empire"                -> "Empire",
    "facebook"              -> "Facebook",
    "facebook square"       -> "Facebook Square",
    "flickr"                -> "Flickr",
    "forumbee"              -> "Forumbee",
    "foursquare"            -> "Foursquare",
    "git"                   -> "Git",
    "git square"            -> "Git Square",
    "github alternate"      -> "Github Alternate",
    "github"                -> "Github",
    "github square"         -> "Github Square",
    "gittip"                -> "Gittip",
    "google"                -> "Google",
    "google plus"           -> "Google Plus",
    "google plus square"    -> "Google Plus Square",
    "hacker news"           -> "Hacker News",
    "instagram"             -> "Instagram",
    "ioxhost"               -> "Ioxhost",
    "joomla"                -> "Joomla",
    "jsfiddle"              -> "Jsfiddle",
    "lastfm"                -> "Lastfm",
    "lastfm square"         -> "Lastfm Square",
    "leanpub"               -> "Leanpub",
    "linkedin"              -> "Linkedin",
    "linkedin square"       -> "Linkedin Square",
    "linux"                 -> "Linux",
    "maxcdn"                -> "Maxcdn",
    "meanpath"              -> "Meanpath",
    "medium"                -> "Medium",
    "pagelines"             -> "Pagelines",
    "pied piper alternate"  -> "Pied Piper Alternate",
    "pied piper"            -> "Pied Piper",
    "pinterest"             -> "Pinterest",
    "pinterest square"      -> "Pinterest Square",
    "qq"                    -> "Qq",
    "rebel"                 -> "Rebel",
    "reddit"                -> "Reddit",
    "reddit square"         -> "Reddit Square",
    "renren"                -> "Renren",
    "sellsy"                -> "Sellsy",
    "shirtsinbulk"          -> "Shirtsinbulk",
    "simplybuilt"           -> "Simplybuilt",
    "skyatlas"              -> "Skyatlas",
    "skype"                 -> "Skype",
    "slack"                 -> "Slack",
    "slideshare"            -> "Slideshare",
    "soundcloud"            -> "Soundcloud",
    "spotify"               -> "Spotify",
    "stack exchange"        -> "Stack Exchange",
    "stack overflow"        -> "Stack Overflow",
    "steam"                 -> "Steam",
    "steam square"          -> "Steam Square",
    "stumbleupon circle"    -> "Stumbleupon Circle",
    "stumbleupon"           -> "Stumbleupon",
    "tencent weibo"         -> "Tencent Weibo",
    "trello"                -> "Trello",
    "tumblr"                -> "Tumblr",
    "tumblr square"         -> "Tumblr Square",
    "twitch"                -> "Twitch",
    "twitter"               -> "Twitter",
    "twitter square"        -> "Twitter Square",
    "viacoin"               -> "Viacoin",
    "vimeo"                 -> "Vimeo",
    "vine"                  -> "Vine",
    "vk"                    -> "Vk",
    "wechat"                -> "Wechat",
    "weibo"                 -> "Weibo",
    "whatsapp"              -> "Whatsapp",
    "windows"               -> "Windows",
    "wordpress"             -> "Wordpress",
    "xing"                  -> "Xing",
    "xing square"           -> "Xing Square",
    "yahoo"                 -> "Yahoo",
    "yelp"                  -> "Yelp",
    "youtube"               -> "Youtube",
    "youtube play"          -> "Youtube Play",
    "youtube square"        -> "Youtube Square"
  )

  def component = ReactComponentB[Unit]("IconSets")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "ui active tab",
        dataTabAttr := "icons",
        <.h2(
          ^.cls := "ui header",
          "Icon Set"),
        <.p("An icon set contains an arbitrary number of glyphs"),
        <.div(
          ^.cls := "ui ignored warning message",
          "Icons serve a very similar function to text in a page. In Semantic icons receive a special tag",
          <.code("<i>"),"which allow for an abbreviated markup when sitting along-side text."),
        <.div(
          ^.cls := "ui ignored message",
          "Semantic includes a complete port of ",
          <.a(
            ^.href := "http://fortawesome.github.io/Font-Awesome",
            ^.target := "_blank",
            "Font Awesome 4.3"),
          " designed by ",
          <.a(
            ^.href := "http://www.twitter.com/davegandy", "Dave Gandy"),
          " for its standard icon set."),
        <.div(
          IconsExample(IconsExample.Props(webContentIcons, "Web Content", "Icons can represent types of content found on websites")),
          IconsExample(IconsExample.Props(userActionsIcons, "User Actions", "Icons can represent common actions a user can take")),
          IconsExample(IconsExample.Props(messageIcons, "Message", "Icons can alert users to the type of message being displayed")),
          IconsExample(IconsExample.Props(userTypesIcons, "User Types", "Icons can represent types of people")),
          IconsExample(IconsExample.Props(genderSexualityIcons, "Gender & Sexuality", "Icons can represent genders or types of sexuality")),
          IconsExample(IconsExample.Props(layoutIcons, "Layout Adjustment", "Icons can alert users to common ways to adjust page layouts")),
          IconsExample(IconsExample.Props(objectsIcons, "Objects", "Icons can be used to represent common objects")),
          IconsExample(IconsExample.Props(shapesIcons, "Shapes", "Icons can be used to create shapes")),
          IconsExample(IconsExample.Props(selectionIcons, "Item Selection", "Icons can show whether an item is included in a set")),
          IconsExample(IconsExample.Props(mediaIcons, "Media", "Icons can represent common media types")),
          IconsExample(IconsExample.Props(pointersIcons, "Pointers", "Icons can be used to indicate a direction")),
          IconsExample(IconsExample.Props(computersFSIcons, "Computer and File System", "Icons can represent elements of a computer and its file system")),
          IconsExample(IconsExample.Props(technologiesIcons, "Technologies", "Icons can represent common technologies")),
          IconsExample(IconsExample.Props(ratingIcons, "Rating", "Icons can be used to represent users attitude towards content")),
          IconsExample(IconsExample.Props(audioIcons, "Audio", "Icons can be used to represent common ways to interact with audio")),
          IconsExample(IconsExample.Props(mapIcons, "Map", "Icons can be used to represent elements on a map")),
          IconsExample(IconsExample.Props(tablesIcons, "Tables", "Icons can be used to represent common actions inside a table")),
          IconsExample(IconsExample.Props(textEditorIcons, "Text Editor", "Icons can represent common actions when editing text")),
          IconsExample(IconsExample.Props(currencyIcons, "Currency", "Icons can represent units of currency")),
          IconsExample(IconsExample.Props(paymentIcons, "Payment Options", "Icons can represent common forms of payment")),
          IconsExample(IconsExample.Props(brandsIcons, "Brands", "Icons can represent logos to common brands"))
        )
      )
    )
    .buildU

  def apply() = component()
}

object IconExample {
  case class Props(header: String, description: String, inverted: Boolean = false)

  def component = ReactComponentB[Props]("IconExample")
    .stateless
    .renderPC((_, p, c) =>
      <.div(
        ^.cls := "example",
        <.h4(
          ^.cls := "ui header",
          p.header),
        <.p(p.description),
        if (p.inverted) <.div(
          ^.cls := "ui inverted segment",
          c) else c
      )
    ).build

  def apply(p: Props, children: ReactNode*) = component(p, children: _*)
}
object IconDefinitions {

  def component = ReactComponentB[Unit]("IconDefinitions")
    .stateless
    .render(_ =>
      <.div(
        ^.cls := "ui tab",
        dataTabAttr := "definition",
        <.h2(
          ^.cls := "ui dividing header",
          "States"),
        IconExample(
          IconExample.Props("Disabled", "An icon can show that it is disabled"),
          Icon(Icon.Props("users", disabled = true))
        ),
        IconExample(
          IconExample.Props("Loading", "An icon can be used as a simple loader"),
          Icon(Icon.Props("spinner", loading = true)),
          Icon(Icon.Props("notched circle", loading = true)),
          Icon(Icon.Props("asterisk", loading = true))
        ),
        <.h2(
          ^.cls := "ui dividing header",
          "Variations"),
        IconExample(
          IconExample.Props("Fitted", "An icon can be fitted, without any space to the left or right of it."),
          "Tight spacing",
          Icon(Icon.Props("help", fitted = true)),
          "Tight spacing"
        ),
        IconExample(
          IconExample.Props("Size", "An icon can vary in size"),
          Icon(Icon.Props("home", mini = true)),
          Icon(Icon.Props("home", tiny = true)),
          Icon(Icon.Props("home", small = true)),
          <.br(),
          Icon(Icon.Props("home")),
          <.br(),
          Icon(Icon.Props("home", large = true)),
          <.br(),
          Icon(Icon.Props("home", big = true)),
          <.br(),
          Icon(Icon.Props("home", huge = true)),
          <.br(),
          Icon(Icon.Props("home", massive = true))
        ),
        IconExample(
          IconExample.Props("Link", "An icon can be formatted as a link"),
          Icon(Icon.Props("close", link = true)),
          Icon(Icon.Props("help", link = true))
        ),
        IconExample(
          IconExample.Props("Flipped", "An icon can be flipped"),
          Icon(Icon.Props("cloud", flipped = Horizontally)),
          Icon(Icon.Props("cloud", flipped = Vertically))
        ),
        IconExample(
          IconExample.Props("Rotated", "An icon can be rotated"),
          Icon(Icon.Props("cloud", rotated = Clockwise)),
          Icon(Icon.Props("cloud", rotated = CounterClockwise))
        ),
        IconExample(
          IconExample.Props("Circular", "An icon can be formatted to appear circular"),
          Icon(Icon.Props("users", circular = true)),
          Icon(Icon.Props("users", circular = true, color = Some("teal"))),
          Icon(Icon.Props("users", circular = true, inverted = true)),
          Icon(Icon.Props("users", circular = true, inverted = true, color = Some("teal")))
        ),
        IconExample(
          IconExample.Props("Bordered", "An icon can be formatted to appear bordered"),
          Icon(Icon.Props("users", bordered = true)),
          Icon(Icon.Props("users", bordered = true, color = Some("teal"))),
          Icon(Icon.Props("users", bordered = true, inverted = true)),
          Icon(Icon.Props("users", bordered = true, inverted = true, color = Some("teal")))
        ),
        IconExample(
          IconExample.Props("Colored", "An icon can be formatted with different colors"),
          Icon(Icon.Props("users", color = Some("red"))),
          Icon(Icon.Props("users", color = Some("orange"))),
          Icon(Icon.Props("users", color = Some("yellow"))),
          Icon(Icon.Props("users", color = Some("olive"))),
          Icon(Icon.Props("users", color = Some("green"))),
          Icon(Icon.Props("users", color = Some("teal"))),
          Icon(Icon.Props("users", color = Some("blue"))),
          Icon(Icon.Props("users", color = Some("violet"))),
          Icon(Icon.Props("users", color = Some("purple"))),
          Icon(Icon.Props("users", color = Some("pink"))),
          Icon(Icon.Props("users", color = Some("brown"))),
          Icon(Icon.Props("users", color = Some("grey"))),
          Icon(Icon.Props("users", color = Some("black")))
        ),
        IconExample(
          IconExample.Props("Inverted", "An icon can have its colors inverted for contrast", inverted = true),
          Icon(Icon.Props("users", inverted = true)),
          Icon(Icon.Props("users", inverted = true, color = Some("red"))),
          Icon(Icon.Props("users", inverted = true, color = Some("orange"))),
          Icon(Icon.Props("users", inverted = true, color = Some("yellow"))),
          Icon(Icon.Props("users", inverted = true, color = Some("olive"))),
          Icon(Icon.Props("users", inverted = true, color = Some("green"))),
          Icon(Icon.Props("users", inverted = true, color = Some("teal"))),
          Icon(Icon.Props("users", inverted = true, color = Some("blue"))),
          Icon(Icon.Props("users", inverted = true, color = Some("violet"))),
          Icon(Icon.Props("users", inverted = true, color = Some("purple"))),
          Icon(Icon.Props("users", inverted = true, color = Some("pink"))),
          Icon(Icon.Props("users", inverted = true, color = Some("brown"))),
          Icon(Icon.Props("users", inverted = true, color = Some("grey"))),
          Icon(Icon.Props("users", inverted = true, color = Some("black")))
        ),
        <.h2(
          ^.cls := "ui dividing header",
          "Groups")
      )
    ).buildU

  def apply() = component()
}
object IconPage {
  def component = ReactComponentB[Unit]("IconSets")
    .render(_ =>
      <.div(
        ^.cls := "main ui container",
        IconSets(),
        IconDefinitions())
    )
    .componentDidMount { _ => Callback {
        val semReady = js.Dynamic.global.semantic.ready
        semReady()
        val iconReady = js.Dynamic.global.semantic.icon.ready
        iconReady()
      }
    }
    .buildU

  def apply() = component()
}