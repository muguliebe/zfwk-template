package zfwk.core.proto.model

import org.springframework.context.annotation.Profile

@Profile("proto")
data class ProtoModel(
    var one: String? = null,
    var two: String? = null
)
