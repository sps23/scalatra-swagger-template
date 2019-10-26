package silverstar

import javax.servlet.ServletContext
import org.scalatra.LifeCycle
import silverstar.servlet.MyServlet
import org.scalatra.json._

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context.mount(new MyServlet, "/*")
  }
}
