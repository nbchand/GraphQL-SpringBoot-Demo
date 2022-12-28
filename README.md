# GraphQL-SpringBoot-Demo
<b>API: </b> http://localhost:8080/graphql
<br><br>
<b>QUERY: </b>
<span></br>
`query{
recentPosts(count:0, offset:3){
id,
text,
author{
id,
name
}
},
fetchAuthors{
id,
name,
posts{
id,
title
}
}
}`
</span>
<br><br>
<b>RESPONSE: </b>
<span></br>
`{
"data": {
"recentPosts": [
{
"id": "1",
"text": "'Ram Ram'",
"author": {
"id": "2",
"name": "'Rajan Khadka'"
}
},
{
"id": "2",
"text": "'Thug life'",
"author": {
"id": "2",
"name": "'Rajan Khadka'"
}
},
{
"id": "3",
"text": "'Bhoot'",
"author": {
"id": "3",
"name": "'Roshan Saud'"
}
}
],
"fetchAuthors": [
{
"id": "1",
"name": "'Santosh Nepal'",
"posts": []
},
{
"id": "2",
"name": "'Rajan Khadka'",
"posts": [
{
"id": "1",
"title": "'The notebook'"
},
{
"id": "2",
"title": "'Avengers'"
}
]
},
{
"id": "3",
"name": "'Roshan Saud'",
"posts": [
{
"id": "3",
"title": "'Casper'"
}
]
}
]
}
}`
</span>