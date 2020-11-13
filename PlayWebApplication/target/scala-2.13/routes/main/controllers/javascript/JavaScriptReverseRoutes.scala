// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Thu Nov 12 22:07:52 EST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def profiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profiles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles"})
        }
      """
    )
  
    // @LINE:10
    def tweetSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tweetSearch",
      """
        function(keywords0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweetSearch/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("keywords", keywords0))})
        }
      """
    )
  
    // @LINE:8
    def results: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.results",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "results"})
        }
      """
    )
  
    // @LINE:11
    def hashtag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.hashtag",
      """
        function(keywords0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hashtag/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("keywords", keywords0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
