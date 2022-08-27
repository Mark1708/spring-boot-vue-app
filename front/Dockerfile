## stage1 as builder
#FROM node:lts-alpine as builder
#
#WORKDIR /front
#
## Copy the package.json and install dependencies
#COPY package*.json ./
#RUN npm install
#
## Copy rest of the files
#COPY . .
#
## Build the project
#RUN npm run build
#
#
#FROM nginx:alpine
#
### Remove default nginx index page
#RUN rm -rf /usr/share/nginx/html/*
#
#COPY --from=builder /front/nginx/nginx.conf /etc/nginx/conf.d/default.conf:ro
#COPY --from=builder /front/dist /usr/share/nginx/html

FROM node:lts-alpine

# install simple http server for serving static content
# RUN npm install -g http-server

# make the 'app' folder the current working directory
WORKDIR /app

# copy both 'package.json' and 'package-lock.json' (if available)
COPY package*.json ./

# install project dependencies
RUN npm install

# copy project files and folders to the current working directory (i.e. 'app' folder)
COPY . .

# build app for production with minification
RUN npm run build

EXPOSE 8080
CMD [ "npm", "run", "serve" ]