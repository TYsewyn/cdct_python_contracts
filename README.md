## Consumer Driven Contract Tests using [Cloud Contract](https://spring.io/projects/spring-cloud-contract) for Python

Producer: <https://github.com/TYsewyn/cdct_python_producer>

Consumer: <https://github.com/TYsewyn/cdct_python_consumer>

Contracts: this repo

### Why Cloud Contract instead of Pact?

For our usecase, we need support for messaging.
In the consumer-driven contract testing world, the most popular solution is [Pact](https://docs.pact.io/).

Pact for Python has two competing solutions:
- Pact Python
- Pactman

#### Pact Python

Pact-python does not currently support messaging, although work in ongoing:
https://github.com/pact-foundation/pact-python/issues/88

Work has initially started, but has stalled since January (at the time of writing):
https://github.com/pact-foundation/pact-python/pull/119


#### Pactman

Pactman does not currently support messaging (although they claim to support the Pact specification v3): https://github.com/reecetech/pactman/issues/68

### Cloud Contract

Cloud Contract does support messaging, and now also supports a polyglot solution:
https://spring.io/blog/2018/02/13/spring-cloud-contract-in-a-polyglot-world

This repository demonstrates that solution.
