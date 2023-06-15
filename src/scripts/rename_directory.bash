#!/bin/bash

# Define the source and destination directory paths
srcDir="src/leetcode"

# Iterate over the directories in the source directory
ls $srcDir
for dir in "$srcDir"/*; do
    # Extract the directory name
    dirName=$(basename "$dir")

    # Check if the directory name starts with "leetcode"
    if [[ $dirName == leetcode* ]]; then
        # Extract the problem number from the directory name
        problemNum=${dirName#"leetcode"}

        # Construct the new destination directory name
        destDirName="problem$problemNum"

        # Rename the directory
        mv "$dir" "$srcDir/$destDirName"
    fi
done

echo "Directory names updated successfully."
