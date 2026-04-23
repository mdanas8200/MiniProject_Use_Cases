# Social Media Content Sanitizer (Python)

A simple Python script that scans user posts, removes banned words, extracts links, and generates a summary report.

---

## Project Overview

This project is a basic content moderation system that processes user posts and ensures they are safe by:

* Replacing banned words with asterisks
* Extracting all URLs from posts
* Tracking how many violations each user has
* Generating a final report

---

## Features

* User-wise post processing using dictionary
* Word masking using replace function
* Link extraction using string methods
* File handling to store extracted links
* Summary report with total posts and flags

---

## Project Structure

```id="py1"
PYTHON/
│
├── SocialMediaSanitizer.py
└── links.txt
```

---

## How It Works

1. Posts are stored in a dictionary where:

   * Key is username
   * Value is list of posts

2. Each post is processed:

   * Banned words are replaced with asterisks
   * Links are extracted from text

3. Extracted links are saved into a file

4. A final report is generated showing:

   * Total posts
   * Cleaned posts
   * Flag count per user

---

## Validation Rules

* Words in bannedWords list are not allowed
* Any banned word found is replaced with asterisks
* Any word starting with "http" is treated as a link

---

## Outputs


---

## How to Run

### Method 1: Using VS Code or any IDE

1. Open the project folder
2. Open SocialMediaSanitizer.py
3. Click Run or use Run Python File option

---

### Method 2: Using Command Line

1. Navigate to project folder:

```id="py2"
cd PYTHON
```

2. Run the script:

```id="py3"
python SocialMediaSanitizer.py
```

---

## Concepts Used

* Dictionary
* List
* String methods
* Loops
* File handling
* Conditional statements

---

## Author

Mohammed Anas

---

