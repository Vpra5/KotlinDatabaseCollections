package com.axis.dbconnection

import java.sql.DriverManager

//model class
//data class User(val id:Int, val name:String)

fun main(args: Array<String>) {
    val myurl = "jdbc:mysql://localhost:3306/kotlin" //localhost is the database name
    val connection = DriverManager.getConnection(myurl, "root", "Vpusha@5*")
    println("connection estlabished successfully")

//update
    val stmt = connection.createStatement()
    val delete_res = stmt.executeUpdate("delete from users where id = 1")
    if (delete_res > 0) {
        println("successfully deleted in users db !!!")
        println("$delete_res rows deleted")
    } else {
        println("Deletion failed")
    }
}
