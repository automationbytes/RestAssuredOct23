package RestAssuredExamples;

public class Person {
        private String firstName;
        private String lastName;
        private int id;
        private Address address;
        
        // Getter and Setter methods for firstName
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // Getter and Setter methods for lastName
        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // Getter and Setter methods for id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // Getter and Setter methods for address
        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        // Inner class for the 'address' field
        public static class Address {
            private String city;
            private String country;
            private String street;
            private int zipCode;

            // Getter and Setter methods for city
            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            // Getter and Setter methods for country
            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            // Getter and Setter methods for street
            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            // Getter and Setter methods for zipCode
            public int getZipCode() {
                return zipCode;
            }

            public void setZipCode(int zipCode) {
                this.zipCode = zipCode;
            }
        }
    }


