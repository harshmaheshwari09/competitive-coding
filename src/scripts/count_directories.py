import os
import sys

# Check input directory existence.
if len(sys.argv) > 1:
    input_directory = sys.argv[1]
else:
    input_directory = os.getcwd()

# Validate input directory.
if not os.path.isdir(input_directory):
    print("Invalid input directory")
    sys.exit(1)


# Count directories
def count_directories(input_directory):
    count = 0
    for root, dirs, files in os.walk(input_directory):
        for directory in dirs:
            if directory.startswith("problem"):
                count += 1
    return count


directory_count = count_directories(input_directory)
print("completed ques: ", directory_count)
