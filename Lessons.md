Document lessons learned from various CTF problems and competitions.

Web Exploitation:
  1. It is my Birthday - picoCTF 2021: MD5 collision hash (birthday attack) can be happened due to uploading two files with similar MD5 hash 
  2. GET aHEAD - picoCTF 2021: sends a head request using Hetty, which gets a respond in the form of the flag
  3. Cookies - picoCTF 2021: manipulate cookies by changing its values using document.cookie 
  4. Insp3ct0r - picoCTF 2019: use Ctrl + U to see the source code of the website
  5. Scavenger Hunt - picoCTF 2021: use Ctrl + U to see the source code of the website; robots.txt for web crawlers; .ntaccess manages Apache server permissions; .DS_Store stores configuration for how desktop looks
  6. where are the robots - picoCTF 2019: robots.txt and dissallow website path (change path then try entering again)
  7. logon - picoCTF 2019: manipulate cookies by changing its values using document.cookie = "admin=true"
  8. Who are you? - picoCTF 2021: manipulates headers and their values with Hetty, then sends them again to the website to get a different request
  9. Includes - picoCTF 2022: use Ctrl + U to see the source code of the website
  10. Inspect HTMl - picoCTF 2022: use Ctrl + U to see the source code of the website
  11. Search source - picoCTF 2022: search within the CSS style editor to find the flag
