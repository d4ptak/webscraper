package com.d4ptak.webscraper.output;

public class OutputFactory {
    public Output createOutput(String outputType) {
        if (outputType.equalsIgnoreCase("xml")) {
            return new XmlOutput();
        } else {
            throw new IllegalArgumentException("Invalid output file type: " + outputType);
        }
    }
}
