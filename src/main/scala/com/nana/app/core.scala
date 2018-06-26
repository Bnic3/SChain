package com.nana.app

import java.io.File

import com.nana.common.{BlockLogging, MyDB}
import io.iohk.iodb.LSMStore
import com.nana.common.MyConstants._
import com.nana.common.MyTags.Address
import com.nana.signatures.{NSignatureScheme, PrivateKey25519}
import scorex.crypto.encode.Base58
import scorex.crypto.signatures.{Curve25519, PrivateKey, PublicKey, Signature}

import scala.util.Random

object core extends App with BlockLogging with MyDB{

val seed:String = Random.alphanumeric.take(10).mkString

 val coinbase =  (1 to 3 ) map( idx =>{
   val seed:String = Random.alphanumeric.take(10).mkString
   val (priv,pub)=  NSignatureScheme.generateKeys(seed.getBytes())
   (idx,priv,pub)
 }) foreach(coinbase=>{
   val coinbaseKey = s"${COINBASE}:${coinbase._1}"
   val coinbaseValue = Map(PRIVFIELD ->s"${coinbase._2}", PUBFIELD ->s"${coinbase._3}")
   //save wallet to redis store
   hashSet(coinbaseKey,coinbaseValue)

 })




}
