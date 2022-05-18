package ru.otus.otuskotlin.marketplace.backend.services

import marketplace.stubs.Bolt
import ru.otus.otuskotlin.marketplace.common.MkplContext
import ru.otus.otuskotlin.marketplace.common.models.MkplError
import ru.otus.otuskotlin.marketplace.common.stubs.MkplStubs

class OfferService {
    fun searchOffers(context: MkplContext, buildError: () -> MkplError): MkplContext {
        val request = context.adRequest

        return when (context.stubCase) {
            MkplStubs.SUCCESS -> context.successResponse {
                adsResponse.addAll(Bolt.getModels().onEach { it.id = request.id })
            }
            else -> {
                context.errorResponse(buildError) {
                    it.copy(field = "ad.id", message = notFoundError(request.id.asString()))
                }
            }
        }
    }
}
