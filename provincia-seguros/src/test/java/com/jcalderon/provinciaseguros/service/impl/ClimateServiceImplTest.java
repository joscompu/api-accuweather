package com.jcalderon.provinciaseguros.service.impl;

import com.jcalderon.provinciaseguros.model.*;
import com.jcalderon.provinciaseguros.service.TemperatureService;
import com.jcalderon.provinciaseguros.service.api.AccuweatherService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClimateServiceImplTest {
    @Mock
    private AccuweatherService accuweatherService;

    @Mock
    private TemperatureService temperatureService;

    @InjectMocks
    private ClimateServiceImpl climateService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetTemperature() {
        Forecast forecast = new Forecast();
        DailyForecast dailyForecast = new DailyForecast();
        Temperature temperature = new Temperature();
        dailyForecast.setTemperature(temperature);
        forecast.setDailyForecast(Arrays.asList(dailyForecast));

        Minimum minimum = new Minimum();
        minimum.setValue(71.0);
        minimum.setUnit("F");
        minimum.getUnitType();

        Maximum maximum = new Maximum();
        maximum.setValue(77.0);
        maximum.setUnit("F");
        maximum.getUnitType();
        temperature.setMinimum(minimum);
        temperature.setMaximum(maximum);

        // Configuración de comportamiento simulado
        when(accuweatherService.dailyForecast()).thenReturn(forecast);
        // Llamada al método que queremos probar
        Temperature result = climateService.getTemperature();

        // Compara los valores mínimos entre la temperatura original y la temperatura obtenida
        assertNotNull(result);
        assertEquals(temperature.getMinimum().getValue(), result.getMinimum().getValue());
        assertEquals(temperature.getMinimum().getUnit(), result.getMinimum().getUnit());
        assertEquals(temperature.getMinimum().getUnitType(), result.getMinimum().getUnitType());

        // Compara los valores maximo entre la temperatura original y la temperatura obtenida
        assertEquals(temperature.getMaximum().getValue(), result.getMaximum().getValue());
        assertEquals(temperature.getMaximum().getUnit(), result.getMaximum().getUnit());
        assertEquals(temperature.getMaximum().getUnitType(), result.getMaximum().getUnitType());

        // Verifica que el método de AccuweatherService fue llamado una vez
        verify(accuweatherService, times(1)).dailyForecast();
        // Verifica que el método de TemperatureService fue llamado una vez
        verify(temperatureService, times(1)).saveTemperature(temperature);

    }
}