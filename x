[1mdiff --git a/src/main/resources/application.properties b/src/main/resources/application.properties[m
[1mindex 8b13789..e69de29 100644[m
[1m--- a/src/main/resources/application.properties[m
[1m+++ b/src/main/resources/application.properties[m
[36m@@ -1 +0,0 @@[m
[31m-[m
[1mdiff --git a/src/main/resources/templates/end.html b/src/main/resources/templates/end.html[m
[1mindex d01f779..9c9785b 100644[m
[1m--- a/src/main/resources/templates/end.html[m
[1m+++ b/src/main/resources/templates/end.html[m
[36m@@ -3,6 +3,8 @@[m
 <head>[m
     <meta charset="UTF-8">[m
     <meta name="viewport" content="width=device-width, initial-scale=1.0">[m
[32m+[m[32m    <link rel="stylesheet" th:href="@{/end.css}" href="../static/end.css">[m
[32m+[m
     <title>Document</title>[m
 </head>[m
 <body>[m
