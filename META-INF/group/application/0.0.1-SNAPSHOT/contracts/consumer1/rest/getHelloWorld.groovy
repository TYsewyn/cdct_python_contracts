package consumer1

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method GET()
        url "/"
    }

    response {
        status 200
        body([message : $(c('Hello, World!'), p(regex('Hello, [A-z]*!')))])
    }
}
