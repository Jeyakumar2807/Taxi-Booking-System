🚖 Taxi Booking System – Java Console Application
📌 Project Overview

The Taxi Booking System is a Java-based console application that simulates a real-world taxi reservation system.
It allows customers to book taxis based on nearest availability, pickup time, and minimum travel distance, while automatically calculating fares and managing taxi schedules.

This project focuses on object-oriented programming concepts, data structures, and real-time booking logic.

🎯 Features

🚕 Multiple taxi management

📍 Nearest taxi allocation

⏰ Pickup time–based booking

💰 Automatic fare calculation

📊 Taxi earnings tracking

🧾 Booking history storage

❌ Handles unavailability of taxis gracefully

🛠️ Technologies Used

Language: Java

Concepts:

OOP (Encapsulation, Abstraction)

Collections (ArrayList)

Recursion & Conditional Logic

Environment: Console-based application

📂 Project Structure
TaxiBookingSystem/
│
├── Main.java              // Entry point of the program
├── bookingSystem.java     // Handles booking logic
├── taxi.java              // Taxi class with properties & methods
└── README.md              // Project documentation

🧩 Core Classes Description
🚖 Taxi Class

Handles:

Taxi ID

Current location

Free time

Total earnings

Trip details

Methods include:

Checking availability

Updating location after trip

Recording earnings

📘 BookingSystem Class

Responsible for:

Managing taxi list

Assigning nearest free taxi

Fare calculation

Handling customer bookings

Fare Logic:

Base fare: ₹100

First 5 km: Free

After 5 km: ₹10 per km

▶️ Main Class

Accepts user inputs

Displays booking status

Shows taxi details and earnings

🔄 Booking Flow

User enters pickup point, drop point, and pickup time

System checks for available taxis

Nearest free taxi is selected

Fare is calculated automatically

Booking details are stored

Taxi status is updated

🧪 Sample Input
Pickup Point: A
Drop Point: D
Pickup Time: 9

📤 Sample Output
Taxi Allocated Successfully!
Taxi ID: 2
Fare: ₹250
