package silverstar.servlet

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport

class MyServlet  extends ScalatraServlet with JacksonJsonSupport {

  override protected implicit def jsonFormats: Formats = DefaultFormats

  post("/my/endpoint"){
    val json = parse(request.body)
    val person = json.extract[Person]
    println(person)
  }

}

case class Person(name : String) {
  override def toString = s"My name is $name"
}