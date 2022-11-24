package com.axis.dbconnection

import java.sql.DriverManager



//model class
//data class User(val id:Int, val name:String)

fun main(args:Array<String>) {




    val myurl = "jdbc:mysql://localhost:3306/kotlin" //localhost is the database name
    val connection = DriverManager.getConnection(myurl, "root", "Vpusha@5*")
    println("connection estlabished successfully")

    val prestmt = connection.prepareStatement("insert into users values(?,?)")

    prestmt.setInt(1, 3)
    prestmt.setString(2,"pra")
    val result=prestmt.executeUpdate()
    if(result>0){
        println("inserted")
    }else {
        println("not inserted")
    }
}
