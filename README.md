# Repository Setup Guides

### Option 1: Create a new repository on the command line
```bash
echo "# repository-name" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com
git push -u origin main
```

### Option 2: Push an existing repository from the command line
```bash
git remote add origin https://github.com
git branch -M main
git push -u origin main
```
