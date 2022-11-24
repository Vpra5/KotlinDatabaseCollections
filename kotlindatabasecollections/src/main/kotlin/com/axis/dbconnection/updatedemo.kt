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
        val update_res=stmt.executeUpdate("update users set name = 'Rahulaa' where id = 1")
        if (update_res > 0) {
            println("successfully updated record in users db !!!")
            println("$update_res updated")
        } else {
            println("Update Not sucessful")
        }
    }
