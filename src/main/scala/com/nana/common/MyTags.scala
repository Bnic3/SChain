package com.nana.common

import supertagged.TaggedType

object MyTags {
  object BlockId extends TaggedType[Int]
  object TXID extends TaggedType[Int]
  object Timestamp extends  TaggedType[Long]
  object Address extends  TaggedType[String]
  object SecretKey extends TaggedType[String]
  object PublicKey extends TaggedType[Array[Byte]]




  type BlockId = BlockId.Type
  type TXID = TXID.Type
  type Timestamp = Timestamp.Type
  type Address = Address.Type

  type SecretKey = SecretKey.Type
  type PublicKey = PublicKey.Type



}



