package org.acme.amqp.processor;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import org.acme.amqp.model.Quote;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.quarkus.logging.Log;
import io.smallrye.reactive.messaging.annotations.Blocking;

@ApplicationScoped
public class QuoteProcessor {

    private Random random = new Random();

    @Incoming("requests")
    @Outgoing("quotes")
    @Blocking
    public Quote process(String quoteRequest) throws InterruptedException {
        Log.info("Quote request received: " + quoteRequest);
        Thread.sleep(200);
        Quote quote = new Quote(quoteRequest, random.nextInt(100));
        Log.info("Quote with price - " + quote.toString());
        return quote;
    }
}
