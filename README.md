# Description
A Spring Web port of github.com/idwer/rust-webapeplication

# Run the app:
```mvn spring-boot:run```

# Using the endpoint:
```curl --header 'Content-Type: application/json' http://127.0.0.1:8080/ape -X POST -d '{"height": 200, "wingspan": 200}'```

# JSON output:
```{"height":200,"wingspan":200,"apeIndex":1.0}```
