const express = require("express");
const axios = require("axios");

const app = express();

app.get("/api/doctors", async (req, res) => {

    try {

        const response = await axios.get(
            "https://jsonplaceholder.typicode.com/users"
        );

        const doctors = response.data.map((doctor) => ({
            id: doctor.id,
            name: doctor.name,
            email: doctor.email,
            phone: doctor.phone
        }));
        console.log(doctors);
        res.json(doctors);
        

    } catch (error) {

        res.status(500).json({
            error: "Failed to fetch doctors"
        });

    }

});

app.listen(4000, () => {
    console.log("Server running on port 4000");
});