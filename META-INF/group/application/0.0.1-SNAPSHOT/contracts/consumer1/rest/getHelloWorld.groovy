package consumer1

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GOT()
        url "/"
    }

    response {
        status 200
        body "Hello, World!"
    }
}
