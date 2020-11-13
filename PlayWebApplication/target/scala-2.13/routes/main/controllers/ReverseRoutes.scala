// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Thu Nov 12 22:07:52 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def profiles(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profiles")
    }
  
    // @LINE:10
    def tweetSearch(keywords:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweetSearch/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("keywords", keywords)))
    }
  
    // @LINE:8
    def results(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "results")
    }
  
    // @LINE:11
    def hashtag(keywords:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hashtag/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("keywords", keywords)))
    }
  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
