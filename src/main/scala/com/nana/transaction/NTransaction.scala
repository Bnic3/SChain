package com.nana.transaction

import com.nana.common.MyTags.{Address, Timestamp}
import io.circe.Encoder
import io.circe.syntax._

case class NTransaction(
                        from:Address,
                        fee:Long,
                        recipient :Address,
                        timestamp: Timestamp)

object NTransaction{
  implicit val JsonRep:Encoder[NTransaction] = (tx : NTransaction) =>{
    Map(
      "fee"-> tx.fee.asJson,
      "timestamp"-> tx.timestamp.asJson,
      "recipient" -> tx.recipient.asJson,
      "from" -> tx.from.asJson
    ).asJson
  }
}


