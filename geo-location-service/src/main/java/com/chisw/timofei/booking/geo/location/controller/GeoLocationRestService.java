package com.chisw.timofei.booking.geo.location.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author timofei.kasianov 10/2/18
 */
@Slf4j
@RestController
@RequestMapping("/geo")
public class GeoLocationRestService {

    @GetMapping("/countries")
    public ResponseEntity getCountries() {
        log.info("getCounties");
        return ResponseEntity.ok().body(new ArrayList<>());
    }

    @GetMapping("/countries/{id}/cities")
    public ResponseEntity getCitiesByCountry(@PathVariable("id") long countryId) {
        log.info("getCitiesByCountry");
        return ResponseEntity.ok().body(new ArrayList<>());
    }

    @PostMapping("/countries")
    public ResponseEntity addCountry(@RequestBody Object addCountryRequest) {
        log.info("addCountry");
        return ResponseEntity.ok().body(new ArrayList<>());
    }

    @PostMapping("/countries/{id}/cities")
    public ResponseEntity addCities(@PathVariable("id") long countryId, @RequestBody Object addCitiesRequest) {
        log.info("addCities");
        return ResponseEntity.ok().body(new ArrayList<>());
    }

    @DeleteMapping("/countries/{id}")
    public ResponseEntity deleteCountry(@PathVariable("id") long countryId) {
        log.info("deleteCountry");
        return ResponseEntity.ok().body(new ArrayList<>());
    }

}
