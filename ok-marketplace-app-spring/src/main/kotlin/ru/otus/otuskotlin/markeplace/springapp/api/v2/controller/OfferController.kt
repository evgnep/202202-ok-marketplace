//package ru.otus.otuskotlin.markeplace.springapp.api.v2.controller
//
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//import ru.otus.otuskotlin.markeplace.springapp.api.v2.service.OfferService
//import ru.otus.otuskotlin.marketplace.api.v2.models.AdOffersRequest
//import ru.otus.otuskotlin.marketplace.common.MkplContext
//import ru.otus.otuskotlin.marketplace.mappers.v2.fromTransport
//import ru.otus.otuskotlin.marketplace.mappers.v2.toTransportOffers
//
//@RestController("offerController2")
//@RequestMapping("v2/ad")
//class OfferController(
//    private val offerService: OfferService
//) {
//
//    @PostMapping("offers")
//    fun offersAd(@RequestBody offersAdRequest: AdOffersRequest) =
//        MkplContext().apply { fromTransport(offersAdRequest) }.let {
//            offerService.readOffers(it)
//        }.toTransportOffers()
//}