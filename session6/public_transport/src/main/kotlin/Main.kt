import java.sql.*
import java.util.*

val credentials = Credentials()

fun main(){
    //Get a user input
    print("Type the city you want to go to ")
    val userinput = readLine()

    //Make connection with database
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.userName
    connectionProps["password"] = credentials.password
    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.host +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    //Select statement and filtering
    val statement = connection.prepareStatement("SELECT * FROM rides, cities where rides.destination_city_id = cities.id and cities.name = ? ORDER BY rides.departure_time DESC LIMIT 1")
    statement.setString(1, userinput)
//    and LIKE NOW()
    val result = statement.executeQuery()

    while(result.next()) {
        println(result.getString("departure_time"))
    }


}