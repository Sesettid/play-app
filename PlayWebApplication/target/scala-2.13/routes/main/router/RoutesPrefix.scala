// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Thu Nov 12 22:07:52 EST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
