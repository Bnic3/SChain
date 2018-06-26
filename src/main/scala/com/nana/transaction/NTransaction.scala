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
  def txToJSON(tx:NTransaction) ={
    Map(
      "fee"-> s"${tx.fee}",
      "timestamp"-> s"${tx.timestamp}",
      "recipient" -> s"${tx.recipient}",
      "from" -> s"${tx.from}"
    ).asJson
  }
}


