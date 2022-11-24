package com.axis.dbconnection
import java.sql.DriverManager

//model class
//data class User(val id:Int, val name:String)

fun main(args: Array<String>) {
    val myurl = "jdbc:mysql://localhost:3306/kotlin" //localhost is the database name
    val connection = DriverManager.getConnection(myurl, "root", "Vpusha@5*")
    println("connection estlabished successfully")

    //insert query -Create
    val stmt = connection.createStatement()
    val res=stmt.executeUpdate("insert into users values(2,'Prathyu')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }

}
