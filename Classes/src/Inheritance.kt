package inheritance
sealed interface Error

//enum class extending the sealed interface Error
enum class ErrorType: Error{
    FILE_ERROR, DATABASE_ERROR
}