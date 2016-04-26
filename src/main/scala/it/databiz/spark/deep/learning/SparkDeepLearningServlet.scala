package it.databiz.spark.deep.learning

import org.scalatra._

class SparkDeepLearningServlet extends DeepLearningOnApacheSparkMnistStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
