# College-Management-Android-App

# Introduction :
<p>This project is compelete college management android app.</p>

# Features : 
- Beautiful LoginScreen.
- Multiple Login System (Student, Teacher and Other)
- In Teacher Section, Teacher will be able to save syllabus update,take attendance and upload notices.
- In Student Section, Student will be able to see updated files and syllabus update.
- In Other Section, Other will be able to upload notices, other doc files. 

# GuideLines :

 <B><h3> Localhost Testing :</h3></B>

<p>
<br>1. Download php mail test mail : <url>http://www.toolheap.com/test-mail-server-tool/ </url>for email verification on localhost.
<br>2. Start Wamp server.
<br>3. In cmd run "ipconfig" command (make sure your pc/laptop is connected to network lan or wifi) and note the ip of lan/wifi network .
<br>4. Run project in android studio, Go to Java/package name/misc/utils/constants/ 
 change link address to ip address (which you got from steps 2) so link will be like this :- http://some ip/demo/register.php...
<br>5. Browse to c/wamp (64 or 32) /www/create demo folder and paste all php files inside demo folder. 
<br>6. open phpmyadmin in browser, there you should create demo database inside that import the demo.sql file 
<br>7. Run test mail server tool. 
<br>8. Finally Check in emulator/phone (for phone, you should config wamp to work on phone ).
<br>9. If above test is success then you could upload files on server.</p>

 <B><h3> Server settings :</h3></B>
 
<br> 1. For Email verify from server :
			   	change this line " $headers = 'From:noreply@Slrtce pocket app' . "\r\n"; " to   " $headers = 'From: your server email name' . "\r\n"; in DB_Functions file.
<br> 2. Change database connection in these listed files :
        - Config.php
        - attendance/Config.php
        - syllabus/Config.php
        
# Notes :
<p>
<br>1. In student section, only fourth year cmpn depart. syllabus is added (for other year data you could add in the database).
<br>2. Teachers could update only fourth year cmpn syllabus data (for other year data you could add in the database).
<br>3. Login System is based on integer flag such that every data goes perfectly in it's database table.
<br>4. Lots of optimization is done so you have to check each files and code too :)
</p>

# ScreenShots :
<a href="https://github.com/RylHiteshgarg/Android-Studio/blob/master/College%20Management%20Android%20App/Screenshots">Screenshots folder </a>

# Contact :

 <p>mail me : hiteshg220@gmail.com.</p>
