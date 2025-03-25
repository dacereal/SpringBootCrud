Project Overview
1. Project Description
This is a Spring Boot CRUD (Create, Read, Update, Delete) Web Application that manages a list of courses.

It allows users to:

Add a new course

View a list of courses

Edit existing course details

Delete a course

The application follows the MVC (Model-View-Controller) architecture and is likely built using:

Spring Boot (Backend framework)

Thymeleaf or React/Vue/Angular (Frontend template)

Spring Data JPA & Hibernate (Database integration)

MySQL/PostgreSQL (Database storage)



2. Steps to clone and run the application

create a folder 

right click and select git bash here

in the terminal:

git init

git clone https://github.com/dacereal/SpringBootCrud.git

Open Eclipse IDE

Select File > Import > Existing Maven Project

Navigate to the cloned project folder and select it


run the main class

and search localhost:8081/course to view

3. Git Workflow Explanation (Branching, Merging, PR Process)

Git follows a structured workflow to ensure smooth collaboration and version control. Here’s a breakdown of the standard Git workflow, including **branching**, **merging**, and the **pull request (PR) process**.

---

## Cloning the Repository
Before making any changes, you need to **clone** the repository to your local machine:
```sh
git clone <repository-url>
cd <repository-name>
```

---

## Creating a Branch (Feature Branching)
Instead of working directly on the `main` or `develop` branch, developers create separate **feature branches** to isolate changes.

```sh
git checkout -b feature/add-course
```
- `feature/add-course` → A new branch for adding a course-related feature  
- This keeps the `develop` or `main` branch clean

---

## Making Changes and Committing  
After writing code, stage and commit your changes:

```sh
git add .
git commit -m "Added course creation feature"
```
- `git add .` → Stages all changes  
- `git commit -m "<message>"` → Saves changes with a description  

---

## Pushing Changes to Remote Repo  
Once committed locally, push the branch to GitHub/GitLab:

```sh
git push origin feature/add-course
```
This makes the branch available for others to review.

---

## Creating a Pull Request (PR)  
Now, you need to request the merge of your branch into `develop` or `main`.  

**On GitHub/GitLab:**  
1. Go to the **repository** → Click **Pull Requests**  
2. Click **"New Pull Request"**  
3. Select **`feature/add-course` → `develop`**  
4. Add a **description**, mention reviewers  
5. Click **Create Pull Request**

---

## Code Review & Approval  
- Other developers **review the PR**, suggest changes if needed  
- You make changes, **commit**, and **push again**  
- Once approved, the PR is **merged into `develop`**  

---

## Merging & Deleting the Branch  
After approval, merge the PR:

```sh
git checkout develop
git merge feature/add-course
git push origin develop
```

Then, delete the feature branch to keep the repo clean:

```sh
git branch -d feature/add-course
git push origin --delete feature/add-course
```

---



