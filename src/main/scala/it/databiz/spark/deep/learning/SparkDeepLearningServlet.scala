package it.databiz.spark.deep.learning

import org.scalatra._

class SparkDeepLearningServlet extends DeepLearningOnApacheSparkMnistStack {

  get("/") {
    contentType = "text/html"
    ssp("index", "title" -> "MNIST")
  }

}
