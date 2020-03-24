package consumer1

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description 'Send a pong message in response to a ping message'
    label 'ping_pong'
    input {
        messageFrom('input')
        messageBody([
            message: 'ping'
        ])
    }
    outputMessage {
        sentTo('output')
        body([
            message: 'pong'
        ])
    }
}
