package com.example.daggerhiltsample.domain.weather

import androidx.annotation.DrawableRes
import com.example.daggerhiltsample.R

enum class WeatherType(
    val weatherDesc: String,
    @DrawableRes val weatherIcon: Int
) {
    ClearSky("ClearSky", R.drawable.ic_sunny),
    MainlyClear("MainlyClear", R.drawable.ic_cloudy),
    PartlyCloudy("PartlyCloudy", R.drawable.ic_cloudy),
    Overcast("Overcast", R.drawable.ic_cloudy),
    Foggy("Foggy", R.drawable.ic_very_cloudy),
    DepositingRimeFog("Depositing rime fog", R.drawable.ic_very_cloudy),
    LightDrizzle("Light drizzle", R.drawable.ic_rainshower),
    ModerateDrizzle("Moderate drizzle", R.drawable.ic_rainshower),
    DenseDrizzle("Dense drizzle", R.drawable.ic_rainshower),
    LightFreezingDrizzle("Slight freezing drizzle", R.drawable.ic_snowyrainy),
    DenseFreezingDrizzle("Dense freezing drizzle", R.drawable.ic_snowyrainy),
    SlightRain("Slight rain", R.drawable.ic_rainy),
    ModerateRain("Rainy", R.drawable.ic_rainy),
    HeavyRain("Heavy rain", R.drawable.ic_rainy),
    HeavyFreezingRain("Heavy freezing rain", R.drawable.ic_snowyrainy),
    SlightSnowFall("Slight snow fall", R.drawable.ic_snowy),
    ModerateSnowFall("Moderate snow fall", R.drawable.ic_heavysnow),
    HeavySnowFall("Heavy snow fall", R.drawable.ic_heavysnow),
    SnowGrains("Snow grains", R.drawable.ic_heavysnow),
    SlightRainShowers("Slight rain showers", R.drawable.ic_rainshower),
    ModerateRainShowers("Moderate rain showers", R.drawable.ic_rainshower),
    ViolentRainShowers("Violent rain showers", R.drawable.ic_rainshower),
    SlightSnowShowers("Light snow showers", R.drawable.ic_snowy),
    HeavySnowShowers("Heavy snow showers", R.drawable.ic_snowy),
    ModerateThunderstorm("Moderate thunderstorm", R.drawable.ic_thunder),
    SlightHailThunderstorm("Thunderstorm with slight hail", R.drawable.ic_rainythunder),
    HeavyHailThunderstorm("Thunderstorm with heavy hail", R.drawable.ic_rainythunder);

    companion object {
        fun weatherCode(code: Int): WeatherType {
            return when (code) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> LightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderstorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}
