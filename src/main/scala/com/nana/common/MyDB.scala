package com.nana.common

import com.redis.RedisClient

import scala.annotation.tailrec

trait MyDB {

  val r = new RedisClient("localhost", 6379)
  def put(namespace: String, key:String, value: String):Boolean = r.set(s"$namespace:$key", value)
  def get(key:String):Option[String] = r.get(key)

  @tailrec
  final def getOrSet(k:String, default:String = "" ):Any  = r.get(k) match {
    case Some(i)=> i
    case None => {r.set(k,default)
                  getOrSet(k, default)}

    case _ => println("something went wrong")
  }

  def getKeys(pattern:String) = r.keys(s"$pattern:*") match {
    case None => None
    case Some(i) => i flatten (x=>x)

  }

  def hashSet(key:String, value:Map[String,String] ) = {
    r.hmset(key,value)
  }

  def getCoinbase(key:String,  pubField:String, privField:String  ):Map[String,String]={
    r.hmget[String,String](key, pubField ,privField) match {
      case Some(map) => map
      case None => Map()
    }
  }



}
