# Polixis PoC Application

This is a Proof of Concept (PoC) application for Polixis, featuring one main model: UserData

This is a multimodule application which has 2 Modules: Producer and Consumer.

### Model:

- **UserData:** Represents a DTO for some very basic user data. Used in this application to for Producing, Sending, Consuming and Saving to the DB

### Modules:

- **Producer:** Has a single role in the architecture, to produce a Kafka message and send it to the queue right after it starts.
- **Consumer:** Handles consumption operation and saves the UserData object to the DB.

### Notes:

As this is just a simple PoC application, many of the features that are required by production-grade applications are omitted. For example:
 - Password encoding
 - Logging
 - Exception handling

It should also be noted that 2 of the properties required by the Consumer module are passed as command line arguments. Those are:
- spring.datasource.username
- spring.datasource.password