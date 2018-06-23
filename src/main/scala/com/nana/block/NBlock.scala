package com.nana.block

import com.nana.common.MyTags.{BlockId, Timestamp}
import com.nana.transaction.NTransaction
import io.circe.Encoder
import io.circe.syntax._


case class NBlock(blockIndex:BlockId,
             timestamp: Timestamp,
             nonce:Int,
             prevHash: String,
             hash: String,
             transactions: Seq[NTransaction]){


}

object NBlock{
implicit val nblockEcoder:Encoder[NBlock] = (block:NBlock)=>{
  Map("blockIndex" -> block.blockIndex.asJson,
    "timestamp" -> block.timestamp.asJson,
    "nonce" -> block.nonce.asJson,
    "prevHash" -> block.prevHash.asJson,
    "hash" -> block.hash.asJson,
    "transactions" -> block.transactions.map(_.asJson)).asJson
}
}
