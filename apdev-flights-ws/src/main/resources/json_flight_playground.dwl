%dw 1.0
%output application/xml
%type currency = :string {format: "###.00"}
%type flights = :object {class: "com.mulesoft.training.Flight"}
---
payload map {
	price: $.price as :number as :currency,
	departureDate: $.departureDate as :date {format: "MM.dd.yyyy"} 
		as :string {format: "MM.dd.yyyy"},
		planeType: $.planeType replace /B(.)/ with "X",
		availableSeats: $.emptySeats as :number,
		//totalSeats: getNumSeats($.planeType)
		totalSeats: lookup("getTotalSeats", {type: $.plainType})
	} as :flights
