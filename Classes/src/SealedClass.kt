import java.io.File
import javax.sql.DataSource

//Create sealed interface
sealed interface Error

//create a sealed class that implements sealed interface error

sealed class IOError(): Error

//Define subclass that extend sealed class 'IOError'

class FileReadError(val file: File): IOError()
class DatabaseError(val source: DataSource): IOError()

//Create a singleton object implementing the 'Error' sealed interface
object RuntimeError: Error

