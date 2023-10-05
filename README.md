# API SPEC

## GET ALL Data Household Power Cunsumption

Request :
- Method : GET
- Endpoint : `/api/household`

Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
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


## Create Data Household Power Consumption
Request :
- Method : POST
- Endpoint : `/api/household`
- Body : 
```json
{
  "id" : "string, unique",
  "Date" : "string",
  "time" : "string",
  "global_active_power" : "double",
  "global_reactive_power" : "double",
  "voltage" : "double",
  "global_intensity" : "double",
  "sub_metering_1" : "double",
  "sub_metering_2" : "double",
  "sub_metering_3" : "double"
}
```

Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id" : "string, unique",
    "Date" : "string",
    "time" : "string",
    "global_active_power" : "double",
    "global_reactive_power" : "double",
    "voltage" : "double",
    "global_intensity" : "double",
    "sub_metering_1" : "double",
    "sub_metering_2" : "double",
    "sub_metering_3" : "double"
  }
}
```