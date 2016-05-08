package it.databiz.spark.deep.learning

import org.scalatra._
import play.api.libs.json.Json


class SparkDeepLearningServlet extends DeepLearningOnApacheSparkMnistStack {

  get("/") {
    contentType = "text/html"
    ssp("index", "title" -> "")
  }

  post("/api/mnist") {
    contentType = "application/json"
    Json.obj("results" -> Json.arr(
      Json.arr(0.019273845478892326,
        0.002755797002464533,
        0.24011139571666718,
        0.2932935059070587,
        0.0707358717918396,
        0.18274511396884918,
        0.040298160165548325,
        0.13164499402046204,
        0.009000223129987717,
        0.010141107253730297),
      Json.arr(6.427116971963187e-08,
        0.0006750380853191018,
        0.003446652553975582,
        0.7299981713294983,
        0.00019422220066189766,
        0.00024736422346904874,
        6.49526654683541e-08,
        0.23461812734603882,
        8.288931780953135e-07,
        0.030819464474916458)
    ))
  }

}
