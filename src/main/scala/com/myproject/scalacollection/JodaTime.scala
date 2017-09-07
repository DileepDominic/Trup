package com.myproject.scalacollection
import java.sql.Timestamp

import org.joda.time.{LocalDateTime, Months}


object DateTimeUtils {

  def nowTimestamp(): Timestamp = {
    new Timestamp(System.currentTimeMillis())
  }

  def localDateTimeToTimestamp(ldt: LocalDateTime): Timestamp = {
    new Timestamp(ldt.toDateTime.getMillis)
  }

  def timestampToLocalDateTime(tm: Timestamp): LocalDateTime = {
    LocalDateTime.fromDateFields(tm)
  }

  def localDateTimeDiffInMonths(prev: LocalDateTime, cur: LocalDateTime): Int = {
    Months.monthsBetween(prev, cur).getMonths
  }

  def main(args:Array[String]): Unit =
  {
    println("Time")
    println(nowTimestamp())
    println(localDateTimeToTimestamp(LocalDateTime.now()))
    println(timestampToLocalDateTime(nowTimestamp()))
    println(nowTimestamp())

  }

}

