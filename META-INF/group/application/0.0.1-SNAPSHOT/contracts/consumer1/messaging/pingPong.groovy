package consumer1

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description 'Send a pong message in response to a ping message'
    label 'ping_pong'
    input {
        messageFrom('input')
        messageBody('ping')
    }
    outputMessage {
        sentTo(value(c('input'), p('output')))
        body('pong')
    }
}