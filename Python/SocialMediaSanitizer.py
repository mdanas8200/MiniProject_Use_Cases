posts = {
    "anas": [
        "I hate this link http://yahoo.com",
        "toxic words here present in this http://facebook.com"
    ],
    "nethra": [
        "This is bad content"
    ]
}
bannedWords=["bad", "toxic", "hate"]
cleanedPosts=[]
links=[]
flag={}
cleaned=0
total=sum(len(v) for v in posts.values())

for user, messages in posts.items():
    flag[user]=0
    for text in messages:
        for word in bannedWords:
            if word in text:
                text = text.replace(word, len(word)*"*")
                flag[user] += 1
        for word in text.split():
            if word.startswith("http"):
                links.append(word)
        if "***" in text:
            cleaned += 1
        cleanedPosts.append(user + ":" + text)

with open("links.txt", "w") as f:
    for link in links:
        f.write(link+"\n")

print("Total Posts:", total)
print("Cleaned:", cleaned)
print(cleanedPosts)
print("Toatl Flags:", flag)