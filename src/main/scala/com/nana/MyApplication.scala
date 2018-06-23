package com.nana


import akka.actor.Props
import scorex.api.http._
import scorex.app._
import scorex.app.Application
import scorex.consensus.nxt.NxtLikeConsensusModule
import scorex.consensus.nxt.api.http.NxtConsensusApiRoute
import scorex.network._
import scorex.settings.Settings
import scorex.transaction._

import scala.reflect.runtime.universe._

class MyApplication(val settingsFilename: String)  {
  // application config
  val applicationName = "my cool application"
  val appVersion = ApplicationVersion(0, 1, 0)
  implicit lazy val settings = new Settings with TransactionSettings {
    override val filename: String = settingsFilename
  }

  // Define consensus and transaction modules of your application



  // Create your custom messages and add them to additionalMessageSpecs




}

object MyApplicationApplication extends App {
  // Provide filename by command-line arguments
  val filename = args.headOption.getOrElse("settings.json")
  // Create application instance
  val application = new MyApplication(filename)
  // Run it

  // Generate account in your wallet
  if (application.wallet.privateKeyAccounts().isEmpty) application.wallet.generateNewAccounts(1)


}
