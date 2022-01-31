# quarkus-artemis

## Get it running

You just need to run both applications using:

``` bash
mvn -f amqp-quickstart-producer quarkus:dev
```
And, in a separate terminal:

``` bash
 mvn -f amqp-quickstart-processor quarkus:dev
```
Quarkus starts a AMQP broker automatically, configures the application and shares the broker instance between different applications. See Dev Services for AMQP for more details.

Open <http://localhost:8080/quotes.html> in your browser and request some quotes by clicking the button.
