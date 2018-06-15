package com.nana

import scorex.app.{Application, _}

class MyApplication extends Application {

}

object MyApplicationApplication extends App {
  // Provide filename by command-line arguments
  val filename = args.headOption.getOrElse("settings.json")
  // Create application instance
  val application = new MyApplication(filename)
  // Run it
  application.run()
  // Generate account in your wallet
  if (application.wallet.privateKeyAccounts().isEmpty) application.wallet.generateNewAccounts(1)


}
