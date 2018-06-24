val value:Long = 1L

import com.redis._

val r = new RedisClient("localhost", 6379)
r.set("a:c.key", "a:b.some value")
r.get("a")

r.set("key", "some other")
r.get("sammy")
def getOrMust(key:String, default:String):Any = r.get(key) match {
  case Some(i)=> i
  case None => {r.set(key,default)
                getOrMust(key, default)}
  case _ => println("something went wrong")

}

//val test = getOrMust("sammy", "Ayomide")

r.get("sammy").getOrElse("joohnny")

r.keys("a:*") match {
  case None => None
  case Some(i) => i flatten (x=>x)

}


