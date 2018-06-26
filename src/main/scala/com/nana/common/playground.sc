val value:Long = 1L
val tuppy = ("Nana", "Bolarinwa", "John")

import com.nana.common.MyTags.Address
import com.nana.signatures.{NSignatureScheme, PrivateKey25519}
import com.redis._
import io.circe.Encoder
import io.circe.syntax._

val r = new RedisClient("localhost", 6379)
r.hmset("hash", Map("field1" -> "1", "field2" -> 2))
val redit= r.hmget[String,String]("hash", "field1" ,"field2") match {
  case Some(map) => map
  case None => Map()
}
 val another = redit.toMap[String,String]
another.get("field1")
  //r.set("a:c.key", "a:b.some value")
//r.get("a")
//
//r.set("key", "some other")
//r.get("sammy")
//def getOrMust(key:String, default:String):Any = r.get(key) match {
//  case Some(i)=> i
//  case None => {r.set(key,default)
//                getOrMust(key, default)}
//  case _ => println("something went wrong")
//
//}
//
////val test = getOrMust("sammy", "Ayomide")
//
//r.get("sammy").getOrElse("joohnny")
//
//r.keys("a:*") match {
//  case None => None
//  case Some(i) => i flatten (x=>x)
//
//}


import scala.util.{Try,Success,Failure}
import scorex.crypto.encode.Base58
import supertagged.TaggedType


  object BlockId extends TaggedType[String]
  type BlockId = BlockId.Type

//val k = Base58.encode(1.getBytes())
//("john".getBytes().map(_.toChar)).mkString
//Base58.decode(k) match {
//  case Success(p) => p
//  case _ => ""
//}
case class Nana(name:String, age:String)
val Person = Nana("John", "30")
Map( "name"-> s"${Person.name}",
"age" -> "john").asJson

val something =(1 to 4).map(x=> x*2)