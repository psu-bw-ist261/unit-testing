# Visual Studio Code
1.	Launch Visual Studio Code
    - If an existing folder is opened, click "File -> Close folder"
2.	Click "Clone Git Repository"<br>
    ![Visual Studio Code - Start Page](vscode-01.png "VS Code Start Page")
 
3.	This will open the command palette in Visual Studio Code and prompt you for a GitHub URL. Enter the URL for your repository and hit "Enter" or click "Clone from URL"<br>
    ![Visual Studio Code - Command Palette](vscode-02.png "VS Code Command Palette")
 
4.	This will bring up the folder dialog where you can select a folder. Ensure the directory is a location that you can easily access. I recommend using the `C:\git\github\[your-github-handle]`
    - `git` - Indicates that the directory contains Git repositories
    - `github` - Indicates that the repositories came from GitHub
    - `[your-github-handle]` - Indicates who the owner of the repository is on GitHub<br>

    ![Visual Studio Code - Choose Folder](vscode-03.png "VS Code Command Palette")

    You do not have to follow this structure, just make sure it’s a path you know in case you have to use the Git CLI and need to navigate to the directory
 
5.	Once you have the folder location you want, click "Select as Repository Destination". You may get prompted to authenticate against GitHub, follow GitHub authentication instructions.
6.	You will be prompted to open the cloned repository, click "Open". You may get prompted to trust the project/repository. Since this is your repository, you should trust it. Also worth noting that if you trust the parent folder and follow my structure guideline, you won’t get prompted again for any repository you own. <br>
![Visual Studio Code - Trust Authors](vscode-04.png "VS Code Trust Authors")