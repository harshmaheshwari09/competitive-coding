import os

def count_directories():
    current_dir = "/Users/harshmaheshwari/IdeaProjects/competitive-coding/src/leetcode/java/problems"
    directories_count = 0

    for item in os.listdir(current_dir):
        directories_count += 1
    return directories_count

num_directories = count_directories()
print("completed ques: ", num_directories)
