posts = [
    ("anas", "I hate this link http://yahoo.com"),
    ("anas", "toxic words here present in this http://facebook.com"),
    ("nethra", "This is bad content")
]
bannedWords = {"bad", "toxic", "hate"}
total = len(posts)
flags = {}
cleaned = 0
links = []
result = []

for user, text in posts:
    flags.setdefault(user, 0)
    words = text.split()
    newWords = []
    for word in words:
        lower = word.lower()
        if lower in bannedWords:
            newWords.append("*" * len(word))
            flags[user] += 1
        else:
            if lower.startswith("http"):
                links.append(word)
            newWords.append(word)
    censored = " ".join(newWords)
    if flags[user]:
        cleaned += 1
    result.append(f"{user}:{censored}")

with open("links.txt", "w") as f:
    f.write("\n".join(links))

print("Total Posts:", total)
print("Cleaned:", cleaned)
print(result)
print("Total Flags:", flags)