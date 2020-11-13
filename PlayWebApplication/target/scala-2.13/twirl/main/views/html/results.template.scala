
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object results extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <title>My search results</title>
    <link rel="stylesheet" href='"""),_display_(/*5.35*/routes/*5.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*5.85*/("""'>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="modal-container"></div>
<div class="container">
    <div class="back-results-arrow-container">
        <div class="back-arrow-image" onclick="goTo('index')"><img src="assets/images/arrow.svg"></div>
        <div class="back-arrow-text">Your search results</div>
    </div>
    <div class="search-container">
        <div class="search-container-name">Search Terms</div>
        <div class="search-input">
            <input type="text" placeholder="Search Here" value="Montreal Sushi">
        </div>
        <div class="search-image"><img src="assets/images/search.svg"></div>
    </div>
    <div class="search-result-stats">
        <div class="search-result-count-title">Search Results:&nbsp;</div>
        <div class="search-result-count">10</div>
        &nbsp;&nbsp;| &nbsp;&nbsp;
        <div class="search-result-sentiment-title">Overall Sentiment:&nbsp;</div>
        <div class="search-result-sentiment">&#128512; Happy</div>
    </div>

    <div class="results-container" ></option>
        <div class="result-container">
            <div class="result-index">1</div>
            <div class="result">
                <div class="result-title" onclick="goTo('profile.html')">results:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">2</div>
            <div class="result">
                <div class="result-title">r.twitterName:</div>
                <div class="result-title"></div>
                <div class="result-content">
                </div>
            </div>
        </div>


        <div class="result-container">
            <div class="result-index">3</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">4</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">5</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">6</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">7</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">8</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">9</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index" id="test1">10</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>
    </div>
</div>

<button onclick="test()">test</button>
<script>

    function test()"""),format.raw/*144.20*/("""{"""),format.raw/*144.21*/("""
      """),format.raw/*145.7*/("""alert("JQ Test");
      $("#test").html("testtesttest")
      """),format.raw/*147.7*/("""}"""),format.raw/*147.8*/("""


  """),format.raw/*150.3*/("""function goTo(url)
  """),format.raw/*151.3*/("""{"""),format.raw/*151.4*/("""
    """),format.raw/*152.5*/("""location.replace(url);
  """),format.raw/*153.3*/("""}"""),format.raw/*153.4*/("""

  """),format.raw/*155.3*/("""function showmodal(id,category)"""),format.raw/*155.34*/("""{"""),format.raw/*155.35*/("""
    """),format.raw/*156.5*/("""var url = "profile.html";
    $('.modal-container').load(url,"""),format.raw/*157.36*/("""{"""),format.raw/*157.37*/("""}"""),format.raw/*157.38*/(""",function(result)"""),format.raw/*157.55*/("""{"""),format.raw/*157.56*/("""
            """),format.raw/*158.13*/("""$('#myModal').modal("""),format.raw/*158.33*/("""{"""),format.raw/*158.34*/("""show:true"""),format.raw/*158.43*/("""}"""),format.raw/*158.44*/(""");
    """),format.raw/*159.5*/("""}"""),format.raw/*159.6*/(""");
  """),format.raw/*160.3*/("""}"""),format.raw/*160.4*/("""

  """),format.raw/*162.3*/("""</script>

</body>

</html>


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-12T23:14:04.131375300
                  SOURCE: C:/Users/saidi/Downloads/Telegram Desktop/SOEN6441-APP/PlayWebApplication/app/views/results.scala.html
                  HASH: 0359a50be76405ad9d49c313a5801d99aa59bd98
                  MATRIX: 902->1|998->3|1026->5|1140->93|1154->99|1218->143|9293->8189|9323->8190|9359->8198|9451->8262|9480->8263|9516->8271|9566->8293|9595->8294|9629->8300|9683->8326|9712->8327|9746->8333|9806->8364|9836->8365|9870->8371|9961->8433|9991->8434|10021->8435|10067->8452|10097->8453|10140->8467|10189->8487|10219->8488|10257->8497|10287->8498|10323->8506|10352->8507|10386->8513|10415->8514|10449->8520
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|175->144|175->144|176->145|178->147|178->147|181->150|182->151|182->151|183->152|184->153|184->153|186->155|186->155|186->155|187->156|188->157|188->157|188->157|188->157|188->157|189->158|189->158|189->158|189->158|189->158|190->159|190->159|191->160|191->160|193->162
                  -- GENERATED --
              */
          