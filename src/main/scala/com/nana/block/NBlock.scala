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
             transactions: Seq[NTransaction]) {

  //override  val toString: String = s"NBlock(${this.asJson.noSpaces})"


}

object NBlock{

def nblockToJson(block:NBlock)={
    Map("blockIndex" -> s"${block.blockIndex}",
      "timestamp" -> s"${block.timestamp}",
      "nonce" -> s"${block.nonce}",
      "prevHash" -> s"${block.prevHash}",
      "hash" -> s"${block.hash}",
      "transactions" -> s"${block.transactions}").asJson
  }
}
