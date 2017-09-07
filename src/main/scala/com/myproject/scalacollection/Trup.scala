package com.myproject.scalacollection

import org.mortbay.jetty.HttpParser.Input

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Trup{


  def main(args : Array[String]): Unit ={

    println("Trup")

    val cardlist : List[String] = List("S2",
      "S3",
      "S4",
      "S5",
      "S6",
      "S7",
      "S8",
      "S9",
      "S10",
      "SJ",
      "SQ",
      "SK",
      "SA",
      "D2",
      "D3",
      "D4",
      "D5",
      "D6",
      "D7",
      "D8",
      "D9",
      "D10",
      "DJ",
      "DQ",
      "DK",
      "DA",
      "H2",
      "H3",
      "H4",
      "H5",
      "H6",
      "H7",
      "H8",
      "H9",
      "H10",
      "HJ",
      "HQ",
      "HK",
      "HA",
      "C2",
      "C3",
      "C4",
      "C5",
      "C6",
      "C7",
      "C8",
      "C9",
      "C10",
      "CJ",
      "CQ",
      "CK",
      "CA")


    val trup = List(
      "S7",
      "S8",
      "S9",
      "S10",
      "SJ",
      "SQ",
      "SK",
      "SA",
      "D7",
      "D8",
      "D9",
      "D10",
      "DJ",
      "DQ",
      "DK",
      "DA",
      "H7",
      "H8",
      "H9",
      "H10",
      "HJ",
      "HQ",
      "HK",
      "HA",
      "C7",
      "C8",
      "C9",
      "C10",
      "CJ",
      "CQ",
      "CK",
      "CA"
    )

    val gamelist = trup

    //Shuffle
    val shuffle = scala.util.Random.shuffle(gamelist)

    println(shuffle)

    val player1 = scala.collection.mutable.ListBuffer.empty[String]
    val player2 = scala.collection.mutable.ListBuffer.empty[String]
    val player3= scala.collection.mutable.ListBuffer.empty[String]
    val player4 = scala.collection.mutable.ListBuffer.empty[String]


//Initial
  for (i <-  0 to 31){
    if ((i % 4) == 1) player1 += shuffle(i)
    else if ((i % 4) == 2) player2 += shuffle(i)
    else if ((i % 4) == 3)  player3 += shuffle(i)
    else if ((i % 4) == 0)  player4 += shuffle(i)

  }

    //8 Rounds
    for (i <- 0 to 7){

      val player1input : String = ""
      val player2input : String = ""
      val player3input : String = ""
      val player4input : String = ""

      val turn = scala.collection.mutable.ListBuffer.empty[String]

      //Who has to play
      if(i==0) {

        //player1 input
        /*
        Pull the element and display it.
        Set the Sign.
        Player2 input
        check
        player 3 input
        check
        Player 4 input
        Check
        Last Action
        */

        turn += player1.last
        check(turn)

      }
      else{
        //Who own the round
        player 1 input
        Check
        Player2 input
        Check
        Player 3 input
        Check
        Player4 Input
        Check

      }


    }

    println(player1)
    println(player2)
    println(player3)
    println(player4)





  }
}