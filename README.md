# API SPEC

Required Api Key Authentication

## GET ALL Data Household Power Cunsumption By Range Date

Request :
- Method : GET
- Endpoint : `/api/power-usage-by-range-date`
- Params : - startDate , - endDate

Response :
```json
{
  "code" : "200",
  "status" : "OK",
  "data" : [
    {
      "id" : "id_household, unique",
      "Date" : "2006-12-16",
      "time" : "17:24:00",
      "global_active_power" : 4.216,
      "global_reactive_power" : 0.418,
      "voltage" : 234.840,
      "global_intensity" : 18.400,
      "sub_metering_1" : 0.000,
      "sub_metering_2" : 1.000,
      "sub_metering_3" : 17.000
    },
    {
      "id" : "id_household, unique",
      "Date" : "16/12/2006",
      "time" : "17:24:00",
      "global_active_power" : 4.216,
      "global_reactive_power" : 0.418,
      "voltage" : 234.840,
      "global_intensity" : 18.400,
      "sub_metering_1" : 0.000,
      "sub_metering_2" : 1.000,
      "sub_metering_3" : 17.000
    }
  ]
}
```