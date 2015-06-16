package com.example.helloworld.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class HelloWorldConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty
    private DataSourceFactory database = new DataSourceFactory();

    @Valid
    @NotNull
    @JsonProperty
    private MongoConfiguration mongo = new MongoConfiguration();

    public DataSourceFactory getDatabaseConfiguration() {
        return database;
    }

    public MongoConfiguration getMongo() {
        return mongo;
    }
}
