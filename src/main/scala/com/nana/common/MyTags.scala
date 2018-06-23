package com.nana.common

import supertagged.TaggedType

object MyTags {
  object BlockId extends TaggedType[Int]
  object TXID extends TaggedType[Int]
  object Timestamp extends  TaggedType[Long]
  object Address extends  TaggedType[String]
  object PrivateKey extends TaggedType[Array[Byte]]
  object PublicKey extends TaggedType[Array[Byte]]




  type BlockId = BlockId.Type
  type TXID = TXID.Type
  type Timestamp = Timestamp.Type
  type Address = Address.Type

  type PrivateKey = PrivateKey.Type
  type PublicKey = PrivateKey.Type



}



