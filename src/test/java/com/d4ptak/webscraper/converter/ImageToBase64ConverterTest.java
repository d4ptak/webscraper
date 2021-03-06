package com.d4ptak.webscraper.converter;

import com.d4ptak.webscraper.downloader.Downloader;
import com.d4ptak.webscraper.encode.Encoder;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ImageToBase64ConverterTest {

    @Test
    public void shouldConvertImageToBase64() {
        // given
        Downloader downloader = mock(Downloader.class);
        Encoder encoder = mock(Encoder.class);

        when(downloader.downloadAsByteArray(anyString())).thenReturn(new byte[5]);
        when(encoder.encode(new byte[5])).thenReturn("AAAAAAA=");

        // when
        ImageToBase64Converter converter = new ImageToBase64Converter(downloader, encoder);
        String converted = converter.convert(anyString());

        // then
        assertEquals("AAAAAAA=", converted);
    }
}