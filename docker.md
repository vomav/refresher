### Start back service locally using docker


```
docker container run -d --rm -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=gebit_dev --name db postgres:alpine
```