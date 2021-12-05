package my_git_repo;
/*
 1. Open your eclipse
2. Create a new JAVA project
    -name: my_git_repo-Yes
3. Create a new package
    -name: my_git_repo -Yes
4. Create a new Java class
    -name: FirstJavaClass -Yes
5. Open terminal
    -Right click on your PROJECT
    -If you see Terminal select it
    -WAIT FOR US
6. If you don't see it, then 
Mac    : Search for terminal from your computer search
Windows: Search for CMD-Command Prompt
7. Change the directory: cd projectpath-If you need help, contact with tech support 
Or I ll help you after class
-----------------------------------------------------------
8. We have to be on the project folder:my_git_repo
Now we can start using git for this project:
-----------------------------------------------------------
Pushing Code To Git First Time:
1. git init : It create .git folder
-git init must be used only once, when we 
create a new project.
2. git status
This is used to check the status
of the files
This is our friend
We can use git status to learn the files
that is not commited
Red means UNCOMMITTED FILES
3. git add .
It adds the code in the staging area
git status
Green means Codes are ready to me COMMITTED
We can create a new version
4. git commit -m "first commit"
We now created a new VERSION
git status
--------------------------------------
*****How to send the code to GITHUB???
1. Open your github account
2. Create a new repository
3. Go to repositories
4. Click on New
5. Repository Name : my_git_repo
6. Click Create Repository
Then we should see INSTRUCTION to push your first code
7. 
git branch -M main
git remote add origin https://github.com/techproed/my_git_repo.git
git push -u origin main
NOTE: If there is no error, then your codes should now be in github
NOTE: IF YOU SEE ERROR THEN YOU CAN CHECK YOUR CONFIGURATION:
In the same terminal :
***. git config --global user.name "your github username"
***. git config --global user.email "your github email"
***. git config --list
***. git config credential.username "your github username"
***. git config credential.password "your github password"
AND TRY PUSHING ONE MORE TIME:
git push -u origin main
==============2nd Code Push ===============
As of now, I pushed all my local code to github repository
NOW WHAT SHOULD I DO, IF I ADD NEW CODES IN MY LOCAL?
1. Create a new JAVA class
name: SecondJavaClass
MAKE SURE TO SAVE YOUR ECLIPSE CODE
    1. git add .
    2. git commit -m "second commit" 
    3. git push
    

 */
public class Review {

}
