package com.nana.common

import com.typesafe.scalalogging.{Logger, StrictLogging}

trait BlockLogging extends StrictLogging{
  @inline protected def log:Logger = logger;
}
