# OpenAPI Petstore
#
# This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
#
# OpenAPI spec version: 1.0.0
# 
# Generated by: https://openapi-generator.tech


#' ApiResponse Class
#'
#' @field code 
#' @field type 
#' @field message 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ApiResponse <- R6::R6Class(
  'ApiResponse',
  public = list(
    `code` = NULL,
    `type` = NULL,
    `message` = NULL,
    initialize = function(`code`, `type`, `message`){
      if (!missing(`code`)) {
        stopifnot(is.numeric(`code`), length(`code`) == 1)
        self$`code` <- `code`
      }
      if (!missing(`type`)) {
        stopifnot(is.character(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!missing(`message`)) {
        stopifnot(is.character(`message`), length(`message`) == 1)
        self$`message` <- `message`
      }
    },
    toJSON = function() {
      ApiResponseObject <- list()
      if (!is.null(self$`code`)) {
        ApiResponseObject[['code']] <-
          self$`code`
      }
      if (!is.null(self$`type`)) {
        ApiResponseObject[['type']] <-
          self$`type`
      }
      if (!is.null(self$`message`)) {
        ApiResponseObject[['message']] <-
          self$`message`
      }

      ApiResponseObject
    },
    fromJSON = function(ApiResponseJson) {
      ApiResponseObject <- jsonlite::fromJSON(ApiResponseJson)
      if (!is.null(ApiResponseObject$`code`)) {
        self$`code` <- ApiResponseObject$`code`
      }
      if (!is.null(ApiResponseObject$`type`)) {
        self$`type` <- ApiResponseObject$`type`
      }
      if (!is.null(ApiResponseObject$`message`)) {
        self$`message` <- ApiResponseObject$`message`
      }
    },
    toJSONString = function() {
      sprintf(
        '{
           "code":
             %d,
           "type":
             "%s",
           "message":
             "%s"
        }',
        self$`code`,
        self$`type`,
        self$`message`
      )
    },
    fromJSONString = function(ApiResponseJson) {
      ApiResponseObject <- jsonlite::fromJSON(ApiResponseJson)
      self$`code` <- ApiResponseObject$`code`
      self$`type` <- ApiResponseObject$`type`
      self$`message` <- ApiResponseObject$`message`
    }
  )
)
